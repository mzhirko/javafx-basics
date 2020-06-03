package main.java.sample;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TextButtonCheckBox {
    TextButtonCheckBox(){
        vBox.setLayoutY(10);
        vBox.setLayoutX(610);

        findFlag.setOnAction(event -> {
            String tmp= textField.getText();
            if(tmp.equals(a.getText()))
                a.fire();
            else if(tmp.equals(b.getText()))
                b.fire();
            else if (tmp.equals(c.getText()))
                c.fire();
            else
            {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Achtung!!!");
                alert.setHeaderText("There's no such option");
                alert.setContentText("Please, reconsider your opinion...");
                alert.show();
            }
        });
        vBox.getChildren().addAll(taskNumber,question, textField, findFlag, a, b, c);
    }
    VBox vBox =new VBox();


    Label taskNumber =new Label("DOOHICKEY 4");

    Label question = new Label("So, are you years or older?");
    TextField textField =new TextField();
    Button findFlag =new Button("Submit!");
    CheckBox a =new CheckBox("yes");
    CheckBox b =new CheckBox("no");
    CheckBox c =new CheckBox("remember");
    public VBox get() {
        return vBox;
    }


}
