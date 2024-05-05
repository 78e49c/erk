package com.example.erk;

import game.Game;
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
    public Label label_rest;
    public Label label_satiation;
    public Label label_water;
    public Label label_emptied;
    public Label label_sleep;
    public Label label_suitable_temperature;
    public Label label_health;
    public Label label_satisfaction;
    @FXML
    private Label hourText;
    @FXML
    private Button button_continue;

    @FXML
    protected void onContinueButtonClick()
    {
        Game.incrementTime();
        hourText.setText(Game.showHour());
        dayText.setText(Game.showDay());

    }


}