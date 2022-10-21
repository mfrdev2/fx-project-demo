package com.fr.feedback;

import com.fr.feedback.utils.PageLoader;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private final Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setX(visualBounds.getMinX());//visualBounds.getMinX()
        stage.setY(visualBounds.getMinY());//visualBounds.getMinY()
        stage.setWidth(visualBounds.getWidth());
        stage.setHeight(visualBounds.getHeight());
//        stage.setFullScreen(true);
        stage.setMaximized(true);

        PageLoader.loadHomePage(stage);
    }


}