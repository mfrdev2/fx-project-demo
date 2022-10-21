package com.fr.feedback.utils;

import com.fr.feedback.controller.LayoutHome;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class PageLoader {
    private PageLoader(){

    }

    public static void loadHomePage(Stage stage) throws IOException {
        URL resource = PageLoader.class.getResource("/com/fr/feedback/layout/layout-home.fxml");
        System.out.println(resource);
        FXMLLoader homeLoader = new FXMLLoader(resource);
        Parent root = homeLoader.load();
        Scene scene = new Scene(root);
//                scene.getStylesheets().add(HomeController.class.getResource("/com/bat/feedback/style/home.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
