import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SelectionWindow  {

    private double sliderSize=0;
    ComboBox stylusSelectionBox;
    ComboBox colorSelectionBox;
    WritableImage image;
    Pane root;
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
        Button print = new Button("Print");

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
                        "Circle",
                        "Square"
                );

        stylusSelectionBox  = new ComboBox(stylustyper);
        stylusSelectionBox.setValue("Square");
        stylusSelectionBox.getValue();

        //Color Changer dropdown
        ObservableList<String> colorChanger =
                FXCollections.observableArrayList(
                        //Skriv typer stylus herunder
                        "Red",
                        "Black",
                        "Blue",
                        "Green"
                );
        colorSelectionBox = new ComboBox(colorChanger);
        colorSelectionBox.setValue("Red");



        grid.add(stylusSelectionBox,1,1);
        grid.add(colorSelectionBox,1,2);
        grid.add(slider,1,3);
        grid.add(sliderButton,2,3);
        grid.add(hello,1,4);
        grid.add(print,1,5);


        secondStage.setScene(new Scene(grid,200,200));
        secondStage.setX(0);
        secondStage.setY(0);
        secondStage.show();


        hello.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello to you my friendo");
            }
        });

        print.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                WritableImage imageSave = new WritableImage(600,600);
                image = root.snapshot(new SnapshotParameters(), imageSave);
                System.out.println(image.getUrl());
            }
        });
    }

    public void setImage(WritableImage image, Pane root) {
        this.image = image;
        this.root = root;
    }

    //Color
    public Object getColorSelectionboxType(){
        return colorSelectionBox.getValue();
    }

    //Stylus
    public Object getStylusSelectionboxType(){

        return stylusSelectionBox.getValue();
    }

    //SliderStørrelse
    public double getSliderSize() {

        return sliderSize;
    }
}
