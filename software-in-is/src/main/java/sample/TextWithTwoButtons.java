package main.java.sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TextWithTwoButtons {
    TextWithTwoButtons(){
        vBox.setLayoutY(10);
        vBox.setLayoutX(210);
        renameSecondButton.setStyle("-fx-background-color: #e6b3cc");
        swipeButtons.setStyle("-fx-background-color: #b3e6ff");

        renameSecondButton.setOnAction(event -> {
            swipeButtons.setText(textField.getText());
        });
        swipeButtons.setOnAction(event -> {
            String tmp= renameSecondButton.getText();
            renameSecondButton.setText(swipeButtons.getText());
            swipeButtons.setText(tmp);
        });
        vBox.getChildren().addAll(taskNumber, textField, renameSecondButton, swipeButtons);
    }

    VBox vBox =new VBox();
    Label taskNumber =new Label("DOOHICKEY 2");
    TextField textField =new TextField();
    Button renameSecondButton =new Button("RENAME");
    Button swipeButtons =new Button("Reverse button");
    public VBox get() {
        return vBox;
    }

}
