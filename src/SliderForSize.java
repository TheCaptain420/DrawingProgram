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
        slider.setMax(100);
        slider.setValue(50);
        slider.getValue();
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        slider.getValue();

    }

    public double getValue() {
        this.value = slider.getValue();
        return value;
    }
}
