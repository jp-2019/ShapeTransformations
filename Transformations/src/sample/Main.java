package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Transformations");
        // rotation, scaling, sharing of objects
        Rectangle rect1 = new Rectangle(20, 20, 200, 200);
        Rectangle rect2 = new Rectangle(20, 20, 200, 200);
        rect1.setFill(Color.PINK);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(2);

        rect2.setFill(Color.LAVENDER);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(2);

        Rotate rotate = new Rotate();
        rotate.setAngle(30);
        rotate.setPivotX(100);
        rotate.setPivotY(100);
        rotate.setPivotZ(300);
        rect1.getTransforms().add(rotate);

        Translate translate = new Translate();
        translate.setX(40);
        translate.setY(40);
        translate.setZ(40);
        rect2.getTransforms().addAll(translate);

        Group group = new Group();
        group.getChildren().addAll(rect1, rect2);
        primaryStage.setScene(new Scene(group, 500, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
