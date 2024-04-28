module workshopjavafxjbdc {
    requires javafx.controls;
    requires java.sql; // Add this line for JDBC
    
    opens application to javafx.graphics, javafx.fxml;
}