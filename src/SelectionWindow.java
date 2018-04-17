import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SelectionWindow  {
    void runSelectionWindow(){
        Stage secondStage = new Stage();
        //tilføj nye ting efter inden i new HBox()
        HBox boxen = new HBox(5,new Label("Select Stylus"),new Button("Pen?"));
        secondStage.setScene(new Scene(boxen,200,200));
        secondStage.setX(0);
        secondStage.setY(0);


        secondStage.show();
    }

}
