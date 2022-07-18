package ir.alirezaalijani.product.manager.application.ui.controller;

import ir.alirezaalijani.product.manager.application.config.ContextHolder;
import ir.alirezaalijani.product.manager.application.ui.service.ViewManager;
import ir.alirezaalijani.product.manager.application.ui.service.fxmlcontent.FxmlContent;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import org.springframework.stereotype.Component;

@Component
public class MarketOverviewController implements BasicController{

    private ViewManager viewManager;

    private BorderPane rootPane;
    @FXML
    private Label lbl;

    @FXML
    private GridPane gridPane;

    @FXML
    private ProgressIndicator mainProgress;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    void initialize() {
        rootPane= ContextHolder.getInstance().getBean("RootPane",BorderPane.class);

    }

    @FXML
    void onBack(MouseEvent event) {
        FxmlContent content = viewManager.popView();
        rootPane.setCenter(content.getContentPane());
    }

    @Override
    public void reload() {

    }
}
