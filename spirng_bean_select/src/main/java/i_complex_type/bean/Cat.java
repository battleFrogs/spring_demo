package i_complex_type.bean;

public class Cat {

    private String name;
    private String age;

    public Cat() {
    }

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Cat setAge(String age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
