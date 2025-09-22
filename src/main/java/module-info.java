module io.github.gustavoscgomes.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics; // Adicionado
    requires javafx.base;     // Adicionado

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    // Abre o pacote principal para o JavaFX
    opens io.github.gustavoscgomes.workshopjavafxjdbc to javafx.fxml;
    // Exporta o pacote principal para outros módulos
    exports io.github.gustavoscgomes.workshopjavafxjdbc;

    // Adiciona o pacote de entidades para o javafx.base
    opens io.github.gustavoscgomes.workshopjavafxjdbc.model.entities to javafx.base;

    // Adiciona o pacote dos controladores para o javafx.fxml
    opens io.github.gustavoscgomes.workshopjavafxjdbc.controller to javafx.fxml;
    exports io.github.gustavoscgomes.workshopjavafxjdbc.controller;
}