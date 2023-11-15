package modul_3_7.handout;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class HelloController {
    @FXML
    private Button button;

    @FXML
    private Slider red;

    @FXML
    private Slider blue;

    @FXML
    private Slider green;

    @FXML
    private Slider hue;
    @FXML
    private Slider saturation;
    @FXML
    private Slider value;

    @FXML
    private Label blueLabel;

    @FXML
    private Label redLabel;

    @FXML
    private Label greenLabel;

    @FXML
    private Label hueLabel;

    @FXML
    private Label saturationLabel;

    @FXML
    private Label valueLabel;

    @FXML
    private Circle colorShowCase;

    @FXML
    private Circle contrastColorShowCase;


    @FXML
    private Label contrastColorRedLabel;

    @FXML
    private Label contrastColorGreenLabel;

    @FXML
    private Label contrastColorBlueLabel;

    @FXML
    private Label contrastColorHueLabel;

    @FXML
    private Label contrastColorSaturationLabel;

    @FXML
    private Label contrastColorValueLabel;



    @FXML
    public void initialize() {
        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);

        hue.setMax(255);
        saturation.setMax(255);
        value.setMax(255);

        rgbInput();
    }

    @FXML
    public void rgbInput() {
        RGB rgb = new RGB((int) red.getValue(), (int) green.getValue(), (int) blue.getValue());

        HSV hsv = rgb.asHSV();

        updateSliders(rgb, hsv);

        updateContrast(hsv);
    }

    private void updateSliders(RGB rgb, HSV hsv){
        hue.setValue(hsv.getH());
        saturation.setValue(hsv.getS());
        value.setValue(hsv.getV());

        hueLabel.setText(String.valueOf(hsv.getH()));
        saturationLabel.setText(String.valueOf(hsv.getS()));
        valueLabel.setText(String.valueOf(hsv.getV()));

        red.setValue(rgb.getR());
        green.setValue(rgb.getG());
        blue.setValue(rgb.getB());

        redLabel.setText(String.valueOf(rgb.getR()));
        greenLabel.setText(String.valueOf(rgb.getG()));
        blueLabel.setText(String.valueOf(rgb.getB()));

        colorShowCase.setFill(Color.rgb(rgb.getR(), rgb.getG(), rgb.getB()));
    }

    @FXML
    public void hsvInput() {
        HSV hsv = new HSV((int) hue.getValue(), (int) saturation.getValue(), (int) value.getValue());

        RGB rgb = hsv.asRGB();

        updateSliders(rgb, hsv);

        updateContrast(hsv);
    }

    private void updateContrast(HSV hsv) {
        HSV hsvi = new HSV((hsv.getH() + 128) % 255, hsv.getS(), hsv.getV());

        RGB rgb = hsvi.asRGB();

        contrastColorBlueLabel.setText(String.valueOf(rgb.getB()));
        contrastColorGreenLabel.setText(String.valueOf(rgb.getG()));
        contrastColorRedLabel.setText(String.valueOf(rgb.getR()));

        contrastColorHueLabel.setText(String.valueOf(hsvi.getH()));
        contrastColorSaturationLabel.setText(String.valueOf(hsvi.getS()));
        contrastColorValueLabel.setText(String.valueOf(hsvi.getV()));

        contrastColorShowCase.setFill(Color.rgb(rgb.getR(), rgb.getG(), rgb.getB()));
    }


    @FXML
    private void action() {
        System.out.println("Hello, World!");
        System.out.println("Goodbye, World!");
        Platform.exit();
    }
}