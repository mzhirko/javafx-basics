package main.java.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;


public class Table {
    Table(){
        tab.setPrefWidth(170);
        tab.setPrefHeight(250);
        tab.setLayoutX(200);
        tab.setLayoutY(50);
        column1.setCellValueFactory(new PropertyValueFactory<ClassForTable, String>("firstField"));
        tab.getColumns().add(column1);
        column2.setCellValueFactory(new PropertyValueFactory<ClassForTable, String>("secondField"));
        tab.getColumns().add(column2);
        group.setLayoutY(10);
        group.setLayoutX(810);
        textField.setLayoutY(20);
        enterData.setLayoutY(50);
        description.setLayoutY(90);
        replaceInFirst.setLayoutY(105);
        replaceInSecond.setLayoutX(40);
        replaceInSecond.setLayoutY(105);




        enterData.setOnAction(event -> {
            TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
            if(!selectionModel.isEmpty())
                if("".equals((String)selectionModel.getSelectedItem().secondField.get()))
                    selectionModel.getSelectedItem().firstField.setValue(textField.getText());
        });

        replaceInSecond.setOnAction(event -> {
            TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
            if(!"".equals((String)selectionModel.getSelectedItem().firstField.get())) {
                selectionModel.getSelectedItem().secondField.setValue(selectionModel.getSelectedItem().firstField.getValue());
                selectionModel.getSelectedItem().firstField.setValue("");
            }
        });

        replaceInFirst.setOnAction(event -> {
            TableView.TableViewSelectionModel<ClassForTable> selectionModel = tab.getSelectionModel();
            if(!"".equals((String)selectionModel.getSelectedItem().secondField.get())){
                selectionModel.getSelectedItem().firstField.setValue(selectionModel.getSelectedItem().secondField.getValue());
                selectionModel.getSelectedItem().secondField.setValue("");
            }
        });


        group.getChildren().addAll(taskNumber, textField, enterData, description, replaceInSecond, replaceInFirst);
    }
    ObservableList<ClassForTable> listForTable = FXCollections.observableArrayList(

            new ClassForTable(),
            new ClassForTable(),
            new ClassForTable(),
            new ClassForTable(),
            new ClassForTable()
    );

    TableView<ClassForTable> tab = new TableView<ClassForTable>(listForTable);




    TableColumn<ClassForTable,String> column1 =new TableColumn<ClassForTable,String>("Column 1");

    TableColumn<ClassForTable,String> column2 =new TableColumn<ClassForTable,String>("Column 2");

    Group group =new Group(tab);
    Label taskNumber =new Label("DOOHICKEY 5");
    TextField textField = new TextField();
    Button enterData = new Button("Add data");

    Label description = new Label("Slide to the");
    Button replaceInSecond = new Button("Right");
    Button replaceInFirst = new Button("Left");
    public Group get() {
        return group;
    }





}
