package ir.alirezaalijani.product.manager.application.ui.controller;

import ir.alirezaalijani.product.manager.application.config.ContextHolder;
import ir.alirezaalijani.product.manager.application.ui.service.ViewManager;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Component;

@Component
public class DataImportCustomController {

    private final ViewManager viewManager;
    private BorderPane rootPane;

    public DataImportCustomController(ViewManager viewManager) {
        this.viewManager = viewManager;
    }

    @FXML
    private TableView<?> dataTable;

    @FXML
    private ProgressIndicator mainProgress;

    @FXML
    void onAdd(MouseEvent event) {

    }

    @FXML
    void onBack(MouseEvent event) {
        rootPane.setCenter(viewManager.popView().getContentPane());
    }

    @FXML
    void onDeleteRow(MouseEvent event) {

    }

    @FXML
    void onEditRow(MouseEvent event) {

    }

    @FXML
    void onFinalOk(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }
}
