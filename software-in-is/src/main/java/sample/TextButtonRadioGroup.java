package main.java.sample;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class TextButtonRadioGroup {
    TextButtonRadioGroup(){
        vBox.setLayoutX(410);
        vBox.setLayoutY(10);
        a.setToggleGroup(groupOfButtons);
        b.setToggleGroup(groupOfButtons);
        c.setToggleGroup(groupOfButtons);
        d.setToggleGroup(groupOfButtons);
        findRadioButton.setOnAction(event -> {
            String tmp = textField.getText();

            if(tmp.equals(a.getText())){
                a.fire();
            }
            else if(tmp.equals(b.getText())) {
                b.fire();
            }
            else if(tmp.equals(c.getText())){
                c.fire();
            }
            else if(tmp.equals(d.getText())){
                d.fire();
            }else{
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Achtung!!!");
                alert.setHeaderText("There's no such option ");
                alert.setContentText("Please, reconsider your opinion...");
                alert.show();
            }
        });

        vBox.getChildren().addAll(taskNumber, question, textField, findRadioButton, a, b, c, d);
    }
    VBox vBox = new VBox();

    Label taskNumber = new Label("DOOHICKEY 3");

    Label question = new Label("Littest Shrek part:");
    TextField textField =new TextField();
    Button findRadioButton =new Button("Submit!");
    ToggleGroup groupOfButtons =new ToggleGroup();
    RadioButton a = new RadioButton("1");
    RadioButton b = new RadioButton("2");
    RadioButton c = new RadioButton("3");
    RadioButton d = new RadioButton("4");
    public VBox get() {
        return vBox;
    }

}
