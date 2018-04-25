import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class StylusType {

    public StylusType(int typeNr, Color color,int radius) {
        this.typeNr = typeNr;
        this.color = color;
        this.radius = radius;
    }

    int typeNr;
    Color color;
    int radius;

    //Styluses
    Circle cir = new Circle();
    Rectangle rec = new Rectangle();


    public void changeColor(Object object){
        if(object=="Red"){
            color= Color.RED;
        }else if(object == "Blue"){
            color = Color.BLUE;
        }else if(object=="Green"){
            color = Color.GREEN;
        }else{
            color = Color.BLACK;
        }


    }

    public void getTheNode(double x, double y, GraphicsContext gc, Object object,SelectionWindow selectionWindow){
        if(object=="Circle"){
            gc.setFill(color);
            gc.setStroke(color);
            gc.setLineWidth(selectionWindow.getSliderSize());
            gc.strokeOval(x,y,1,1);
        }else{
            gc.setFill(color);
            gc.setStroke(color);
            gc.setLineWidth(selectionWindow.getSliderSize());
            gc.strokeLine(x,y,x,y);
        }

    }


    //Getters and setters
    public void setStylusType(Object ob){

    }



    public int getTypeNr() {
        return typeNr;
    }

    public void setTypeNr(int typeNr) {
        this.typeNr = typeNr;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
