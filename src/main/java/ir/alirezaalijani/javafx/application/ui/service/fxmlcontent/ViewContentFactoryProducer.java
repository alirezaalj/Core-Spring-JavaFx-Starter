package ir.alirezaalijani.javafx.application.ui.service.fxmlcontent;

public class ViewContentFactoryProducer {

    public static ViewContentFactory getFactory(ViewLoadType type)
    {
        if(type.equals(ViewLoadType.STAGE)){
            return new FxmlStageViewFactory();
        }else if(type.equals(ViewLoadType.STAGE_PURE)){
            return new FxmlStagePureViewFactory();
        }else if(type.equals(ViewLoadType.PANE)){
            return new FxmlPaneViewFactory();
        }else if(type.equals(ViewLoadType.CONTROL)){
            return new FxmlControlViewFactory();
        }else if (type.equals(ViewLoadType.PANE_PURE)){
            return new FxmlPanePureViewFactory();
        }
        return new FxmlStageViewFactory();
    }
}
