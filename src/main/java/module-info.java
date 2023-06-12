module com.example.chooseadventure {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
                requires com.almasb.fxgl.all;
    
    opens com.example.chooseadventure to javafx.fxml;
    exports com.example.chooseadventure;
}