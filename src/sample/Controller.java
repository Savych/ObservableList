package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import sample.model.Person;

public class Controller {
    @FXML
    private ListView listView;

    private Person nep = new Person("Neptune");

    ObservableList<Person> items = FXCollections.observableArrayList(param -> new Observable[] {param.getStringProperty()});

    @FXML
    private void initialize() {
        items.addAll(nep, new Person("Uni"));
        listView.setItems(items);
    }

    @FXML
    private void add() {
        if(nep.getName().contentEquals("Neptune"))
            nep.setName("Nep-Nep");
        else
            nep.setName("Neptune");
    }
}
