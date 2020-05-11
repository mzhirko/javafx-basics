package main.java.sample;


import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class TextWithButton {
    TextWithButton(){
        enterText.setOnAction(event -> {
                    if(!listOfElements.contains(textField.getText()))
                    {
                        listOfElements.add(textField.getText());
                        comboBox.getItems().add(textField.getText());}
                    else {
                        Alert alert=new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Achtung!!!");
                        alert.setHeaderText("Unable to add string to the list");
                        alert.setContentText("BECAUSE IT'S ALREADY HERE!!1!");
                        alert.show();

                    }
                }
        );
        vBox.setLayoutY(10);
        vBox.setLayoutX(10);
        vBox.getChildren().addAll(taskNumber, textField, enterText, comboBox);

    }

    Button enterText = new Button("Add string");
    TextField textField =new TextField();
    VBox vBox = new VBox();
    Label taskNumber =new Label("DOOHICKEY 1");
    public ComboBox<String> comboBox =new ComboBox<String>();
    ArrayList<String> listOfElements =new ArrayList<String>();

    public VBox get() {
        return vBox;
    }
}
