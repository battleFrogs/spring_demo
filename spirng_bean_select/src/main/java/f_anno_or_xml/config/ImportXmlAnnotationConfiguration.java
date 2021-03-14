package f_anno_or_xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 在注解上使用xml文件
 */
@Configuration
@ImportResource("classPath:xx.xml")
public class ImportXmlAnnotationConfiguration {


}
