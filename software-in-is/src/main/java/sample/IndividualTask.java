package main.java.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class IndividualTask {
    IndividualTask(){
        Thread thread = new Thread(() -> {
            while (true) {
                if (isInAction == 1)
                    fire();
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Change");
        thread.start();

        create.setOnAction(event -> {
            if(firstCreation==true){

                for(Integer i=0;i<Integer.parseInt(textField.getText());i++){
                    RadioButton tmp=new RadioButton(i.toString());
                    tmp.setToggleGroup(buttons);
                    groupOfButtons.getChildren().add(tmp);
                    listOfButtons.add(tmp);
                }
                parent.getChildren().add(groupOfButtons);
                firstCreation=false;
            }else{
                listOfButtons.clear();
                groupOfButtons.getChildren().clear();
                for(Integer i=0;i<Integer.parseInt(textField.getText());i++){
                    RadioButton tmp=new RadioButton(i.toString());
                    tmp.setToggleGroup(buttons);
                    groupOfButtons.getChildren().add(tmp);
                    listOfButtons.add(tmp);
                }
            }

        });
        action.setOnAction(event -> {
            isInAction=1;
        });
        stop.setOnAction(event -> {
            isInAction=0;
        });
        parent.setLayoutY(10);
        parent.setLayoutX(1210);
        parent.getChildren().addAll(taskNumber,textField,create,action,stop);


    }
    int isInAction=0;
    int ch=0;
    boolean firstCreation=true;
    Label taskNumber =new Label("DOOHICKEY 6");
    TextField textField = new TextField();
    VBox parent = new VBox();
    VBox groupOfButtons = new VBox();
    Button create = new Button("create");
    Button stop = new Button("stop");
    Button action = new Button("continue");

    ArrayList<RadioButton> listOfButtons = new ArrayList<RadioButton> ();
    ToggleGroup buttons = new ToggleGroup();
    VBox get(){
        return parent;
    }
    public void fire(){
        if(ch<listOfButtons.size()){
            listOfButtons.get(ch).fire();
            ch++;
        }
        else
            ch=0;
    }
}