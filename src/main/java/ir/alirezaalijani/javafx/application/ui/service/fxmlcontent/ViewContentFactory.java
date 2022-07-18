package ir.alirezaalijani.javafx.application.ui.service.fxmlcontent;

import java.net.URL;

public abstract class ViewContentFactory{
    protected abstract FxmlContent contentFactory(URL url);
    public FxmlContent getContent(URL url){
        return contentFactory(url);
    }
}
