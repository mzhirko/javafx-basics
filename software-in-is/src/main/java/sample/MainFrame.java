package main.java.sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class MainFrame {
    private double changeColorControl = 0;

    MainFrame() {

        background2.setLayoutX(200);
        background3.setLayoutX(200 * 2);
        background4.setLayoutX(200 * 3);
        background5.setLayoutX(200 * 4);
        background6.setLayoutX(200 * 5);

        root.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent1 -> {
            //System.out.println(keyEvent1);
            if (keyEvent1.getCode() == KeyCode.R && keyEvent1.isControlDown()) {
                changeColorControl = 1;

            }
            if (keyEvent1.getCode() == KeyCode.S && keyEvent1.isControlDown()) {
                changeColorControl = 0;
            }

        });

        root.getChildren().addAll(background1, background2, background3, background4, background5);
        root.getChildren().addAll(textWithButton.get(), textWithTwoButtons.get(), textButtonRadioGroup.get(), textButtonCheckBox.get(), table.get(),individualTask.get());
        window.setScene(scene);
        window.show();

    }

    TextWithButton textWithButton = new TextWithButton();
    TextWithTwoButtons textWithTwoButtons = new TextWithTwoButtons();
    TextButtonRadioGroup textButtonRadioGroup = new TextButtonRadioGroup();
    TextButtonCheckBox textButtonCheckBox = new TextButtonCheckBox();
    IndividualTask individualTask=new IndividualTask();
    Table table = new Table();
    Group root = new Group();
    Stage window = new Stage();
    Scene scene = new Scene(root, 1500, 500, Color.web("#fdc887"));



    Rectangle background1 = new Rectangle(200, 500, Color.web("#92c4ea"));
    Rectangle background2 = new Rectangle(200, 500, Color.web("#a694f4"));
    Rectangle background3 = new Rectangle(200, 500, Color.web("#cfa0f9"));
    Rectangle background4 = new Rectangle(200, 500, Color.web("#ffafaf"));
    Rectangle background5 = new Rectangle(200 * 2, 500, Color.web("#fbe68c"));
    Rectangle background6 = new Rectangle(200 * 2, 500);


}
