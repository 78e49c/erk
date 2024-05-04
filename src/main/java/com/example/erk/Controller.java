package com.example.erk;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML
    public HBox hbox;

    @FXML
    public Label hungryText;


    @FXML
    public Label dayText;
    @FXML
    private Label hourText;
    @FXML
    private Button button_continue;

    
    
    
    
    @FXML
    protected void onHelloButtonClick() {
        //timeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onContinueButtonClick()
    {
        Game.incrementTime();
        hourText.setText(Game.showHour());
        dayText.setText(Game.showDay());

    }


   // tokluk gereci
}