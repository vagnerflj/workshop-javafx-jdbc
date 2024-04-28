module workshopjavafxjbdc {
    requires javafx.controls;
    requires java.sql;
	requires javafx.fxml;
	requires javafx.graphics; // Add this line for JDBC
    
    opens application to javafx.graphics, javafx.fxml;
}