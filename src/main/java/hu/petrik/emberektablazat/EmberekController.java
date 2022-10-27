package hu.petrik.emberektablazat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {

    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TextField nevMezo;
    @FXML
    private Spinner<Integer> korMezo;

    @Deprecated
    private void initialize(){
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 18);
        korMezo.setValueFactory(valueFactory);
        nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        korOszlop.setCellValueFactory(new PropertyValueFactory<>("kor"));
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszt Elek", 52);
        Ember e3 = new Ember("Lakatos Brandod Károly", 11);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }

    @FXML
    public void hozzaadClick(ActionEvent actionEvent) {
        Ember tempEmb = new Ember(nevMezo.getText(), korMezo.getValue());
        emberek.getItems().add(tempEmb);
    }
}