package com.supc.driver.controller;

import com.supc.driver.StaticRes;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginStageController implements ControlledStage, Initializable {

    private StageController stageController;

    public void setStageController(StageController sStageController) {
        this.stageController = sStageController;
    }

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void eventLogin() {
        stageController.setStage(StaticRes.mainViewID, StaticRes.loginViewID);
    }

    public void eventRegister() {
        stageController.setStage(StaticRes.registerViewID, StaticRes.loginViewID);
    }
}
