import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class StylusType {

    public StylusType(int typeNr, Color color,int radius) {
        this.typeNr = typeNr;
        this.color = color;
        this.radius = radius;
    }

    int typeNr;
    Color color;
    int radius;

    Circle cir = new Circle();

    Node getTheNode(){
        cir.setFill(color);
        cir.setRadius(10);

        return cir;
    }


    //Getters and setters

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
