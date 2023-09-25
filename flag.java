//14.1 (Display Images) Write a program that displays four images in a grid pane as shown in Figure 14.43. 
//German flag top left, China top right French bottom Left, USA bottom right
package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class flag extends Application { 
  
  @Override
  public void start(Stage primaryStage) {
	  //creating images. I just used the links from the book by the way.
Image china = new Image("https://liveexample.pearsoncmg.com/book/image/china.gif");  
Image us = new Image("https://liveexample.pearsoncmg.com/book/image/us.gif");  
Image ge = new Image("https://liveexample.pearsoncmg.com/book/image/germany.gif");  
Image fr = new Image("https://liveexample.pearsoncmg.com/book/image/fr.gif");  
      //creating a Gridpane to place images on
      GridPane grid = new GridPane(); 
      //adding all the images to the grid to certain positions
      grid.add(new ImageView(ge), 0,0);
      grid.add(new ImageView(fr), 0,1);
      grid.add(new ImageView(china), 1,0);
      grid.add(new ImageView(us), 1,1);
      //creating scene
      Scene scene = new Scene(grid);
      //setting title of window to Four Flags
      primaryStage.setTitle("Four Flags");
      //setting and showing stage
      primaryStage.setScene(scene);
      primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 

