package sample.model;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty name;

    public Person(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public Observable getStringProperty() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
