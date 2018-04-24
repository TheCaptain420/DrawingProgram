import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SelectionWindow  {
    private double sliderSize=0;
    void runSelectionWindow(){
        WhatTheButtonsDo whatTheButtonsDo = new WhatTheButtonsDo();

        Stage secondStage = new Stage();
        //tilføj nye ting efter inden i new HBox()
        //HBox boxen = new HBox(5,new Label("Select Stylus"),new Button("Pen?"));

        GridPane grid = new GridPane();
        //Mellemrum
        grid.setVgap(5);
        grid.setHgap(5);


        //TEstButton1
        Button hello = new Button("hello");


        //testButton2
        Button test = new Button("Test");

        //Slider
        Slider slider = new Slider();
        SliderForSize sliderForSize = new SliderForSize(slider);
        sliderForSize.slider();
        sliderSize = slider.getValue();
        //kommer en getter længere nede

        //Slider button
        Button sliderButton = new Button("Add");
        sliderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sliderSize = slider.getValue();
            }
        });

        //StylusSelecter
        ObservableList<String> stylustyper =
                FXCollections.observableArrayList(
                        //Skriv typer stylus herunder
                        "Option 1",
                        "Option 2",
                        "Option 3"
                );;
        ComboBox stylusSelectionBox  = new ComboBox(stylustyper);
        stylusSelectionBox.setValue("Vælg Stylus");
        stylusSelectionBox.getValue();

        grid.add(stylusSelectionBox,1,1);
        grid.add(slider,1,2);
        grid.add(sliderButton,2,2);
        grid.add(hello,1,3);
        grid.add(test,1,4);


        secondStage.setScene(new Scene(grid,200,200));
        secondStage.setX(0);
        secondStage.setY(0);
        secondStage.show();


        hello.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(stylusSelectionBox.getValue());
            }
        });


        whatTheButtonsDo.doStuff(test);


    }

    public double getSliderSize() {
        return sliderSize;
    }
}
