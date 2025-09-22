package io.github.gustavoscgomes.workshopjavafxjdbc.controller;

import io.github.gustavoscgomes.workshopjavafxjdbc.HelloApplication;
import io.github.gustavoscgomes.workshopjavafxjdbc.model.service.DepartmentService;
import io.github.gustavoscgomes.workshopjavafxjdbc.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class HelloController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("/io/github/gustavoscgomes/workshopjavafxjdbc/departmentlist-view.fxml",
                (DepartmentListController controller) -> {
                    controller.setService(new DepartmentService());
                    controller.updateTableView();
                });
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("/io/github/gustavoscgomes/workshopjavafxjdbc/about-view.fxml", x -> {});
    }

    public synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox vBox = fxmlLoader.load();

            Scene scene = HelloApplication.getMainScene();
            VBox mainVbox = (VBox) ((ScrollPane) scene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(vBox.getChildren());

            T controller = fxmlLoader.getController();
            initializingAction.accept(controller);

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public synchronized void loadView2(String absoluteName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox vBox = fxmlLoader.load();

            Scene scene = HelloApplication.getMainScene();
            VBox mainVbox = (VBox) ((ScrollPane) scene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(vBox.getChildren());

            DepartmentListController controller = fxmlLoader.getController();
            controller.setService(new DepartmentService());
            controller.updateTableView();

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}