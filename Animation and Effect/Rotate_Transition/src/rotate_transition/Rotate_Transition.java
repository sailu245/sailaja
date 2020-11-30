/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate_transition;

import javafx.animation.RotateTransition;  
import javafx.application.Application;  
import javafx.geometry.Point3D;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;  
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;  
import javafx.util.Duration;  

/**
 *
 * @author User
 */
public class Rotate_Transition extends Application {
    
   @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
      
        //Creating Rectangle   
        Text text = new Text("Welcome");
        text.setX(150);
        text.setY(200);
        text.setFill(Color.INDIGO);
        text.setFont(new Font(80));
          
        //Instantiating RotateTransition class   
        RotateTransition rotate = new RotateTransition();  
          
        //Setting Axis of rotation   
        rotate.setAxis(Rotate.Z_AXIS);  
          
        // setting the angle of rotation   
        rotate.setByAngle(360);  
          
        //setting cycle count of the rotation   
        rotate.setCycleCount(600);  
          
        //Setting duration of the transition   
        rotate.setDuration(Duration.millis(1000));  
          
        //the transition will be auto reversed by setting this to true   
        rotate.setAutoReverse(true);  
              
        //setting Rectangle as the node onto which the   
// transition will be applied  
        rotate.setNode(text);  
          
        //playing the transition   
        rotate.play();  
          
        //Configuring Group and Scene   
        Group root = new Group();  
        root.getChildren().add(text);  
        Scene scene = new Scene(root,600,400,Color.LIGHTGRAY);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Rotate Transition");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}  