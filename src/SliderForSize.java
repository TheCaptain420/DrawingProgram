import javafx.scene.control.Slider;

public class SliderForSize {

    public SliderForSize(Slider slider) {
        this.slider = slider;
    }

    Slider slider;
    double value;


    void slider(){
        //Size
        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(5);
        slider.getValue();
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(5);
        slider.setMinorTickCount(1);
        slider.setBlockIncrement(2);
        slider.getValue();

    }

    public double getValue() {
        this.value = slider.getValue();
        return value;
    }
}
