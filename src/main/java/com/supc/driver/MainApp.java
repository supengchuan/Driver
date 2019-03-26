package com.supc.driver;

import com.supc.driver.controller.StageController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class MainApp extends Application {
    private StageController stageController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stageController = new StageController();
        stageController.setPrimaryStage("primaryStage", primaryStage);

        stageController.loadStage(StaticRes.loginViewID, StaticRes.loginViewRes, StageStyle.UNDECORATED);
        stageController.loadStage(StaticRes.mainViewID, StaticRes.mainViewRes, StageStyle.UNDECORATED);
        stageController.setStage(StaticRes.loginViewID);
    }


}
