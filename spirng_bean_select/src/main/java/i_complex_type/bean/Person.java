package i_complex_type.bean;

import java.util.*;

public class Person {

    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String, Object> events;
    private Properties props;

    public String[] getNames() {
        return names;
    }

    public Person setNames(String[] names) {
        this.names = names;
        return this;
    }

    public List<String> getTels() {
        return tels;
    }

    public Person setTels(List<String> tels) {
        this.tels = tels;
        return this;
    }

    public Set<Cat> getCats() {
        return cats;
    }

    public Person setCats(Set<Cat> cats) {
        this.cats = cats;
        return this;
    }

    public Map<String, Object> getEvents() {
        return events;
    }

    public Person setEvents(Map<String, Object> events) {
        this.events = events;
        return this;
    }

    public Properties getProps() {
        return props;
    }

    public Person setProps(Properties props) {
        this.props = props;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }
}
