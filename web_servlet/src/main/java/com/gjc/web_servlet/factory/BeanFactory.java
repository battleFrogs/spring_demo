package com.gjc.web_servlet.factory;

import com.gjc.web_servlet.dao.DemoDao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 1.引入静态工厂方式实现
 * 2.通过配置文件+反射实现创建bean
 * 3.通过缓存区，避免重复创建Bean的使用
 */
public class BeanFactory {

    /**
     * 通过配置文件获取信息
     */
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }

    }


    /**
     * 实现通用性获取bean的方法
     *
     * @param beanName bean的名称
     * @return 得到的bean
     */
    public static Object getBean(String beanName) {

        try {
            Class<?> beanNameClass = Class.forName(properties.getProperty(beanName));
            return beanNameClass.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [ " + beanName + " ] bean!", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[ " + beanName + " ] instantiation error!", e);
        }


    }


    public static DemoDao getDemoDao() {
//        return new DemoDaoImpl();
//        return new DemoOracleDaoImpl();  // 静态工厂指定实例

//        try {
//            // 通过反射实现，减少编译时期发现问题
//            return Class.forName("com.gjc.web_servlet.dao.impl.DemoOracleDaoImpl").newInstance()
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("DemoDao error,cause" + e.getMessage());
//        }

        // 减少代码的硬编码，通过配置文件读取来实现
        try {
            Class<?> demoDao = Class.forName(properties.getProperty("demoDao"));
            return (DemoDao) demoDao.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [ demoDao ] bean!", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[ demoDao ] instantiation error!", e);
        }

    }


    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    public static Object getBeanByMap(String beanName) {
        // 双锁保证beanName中确实没有对应的对象
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    // 过了双检锁，确实没有
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);

                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }

                }
            }
        }
        return beanMap;
    }


}
