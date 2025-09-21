module io.github.gustavoscgomes.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens io.github.gustavoscgomes.workshopjavafxjdbc to javafx.fxml;
    exports io.github.gustavoscgomes.workshopjavafxjdbc;
}