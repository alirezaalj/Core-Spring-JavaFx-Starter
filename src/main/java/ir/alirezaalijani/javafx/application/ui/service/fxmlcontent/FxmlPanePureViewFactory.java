package ir.alirezaalijani.javafx.application.ui.service.fxmlcontent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URL;

@Slf4j
public class FxmlPanePureViewFactory extends ViewContentFactory{

    @Override
    protected FxmlContent contentFactory(URL url) {
        FXMLLoader loader=new FXMLLoader(url);
//        loader.setControllerFactory(StaticHolder.getInstance().getApplicationContext()::getBean);
        Pane pane = null;
        try {
            pane = loader.load();
            Parent root = loader.getRoot();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("loading fxml content {} fail.",url);
        }
        return new FxmlPaneView(loader,null,pane);
    }
}
