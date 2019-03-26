package com.supc.driver.controller;

import com.supc.driver.StaticRes;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainStageController implements ControlledStage, Initializable {
    StageController stageController;

    public void setStageController(StageController stageController) {
        this.stageController = stageController;
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void quit() {
        stageController.getStage(StaticRes.mainViewID).close();
    }
}
