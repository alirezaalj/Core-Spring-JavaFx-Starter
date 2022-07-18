package ir.alirezaalijani.product.manager.application.ui.controller;

import ir.alirezaalijani.product.manager.application.config.ContextHolder;
import ir.alirezaalijani.product.manager.application.ui.service.ViewManager;
import ir.alirezaalijani.product.manager.application.ui.service.fxmlcontent.FxmlContent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class ProductsController {

    private final ViewManager viewManager;
    private final BorderPane rootPane;

    public ProductsController() {
        this.rootPane = ContextHolder.getInstance().getBean("RootPane",BorderPane.class);
        this.viewManager= ContextHolder.getInstance().getBean("ViewManager",ViewManager.class);
    }

    @FXML
    void initialize() {

    }

    @FXML
    public void onBack(MouseEvent mouseEvent) {
        FxmlContent content = viewManager.popView();
        rootPane.setCenter(content.getContentPane());
    }

    @FXML
    public void onAddNewProduct(MouseEvent mouseEvent) {
    }

    @FXML
    public void onEditProduct(MouseEvent mouseEvent) {
    }

    @FXML
    public void onDeleteProduct(MouseEvent mouseEvent) {
    }

    @FXML
    public void onFindByName(MouseEvent mouseEvent) {
    }

    @FXML
    public void onFindByCode(MouseEvent mouseEvent) {
    }

}
