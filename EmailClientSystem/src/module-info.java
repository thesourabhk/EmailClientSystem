module JavaFxEmailClientCourse {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.project;
    opens com.project.view;
    opens com.project.controller;
    opens com.project.model;

}