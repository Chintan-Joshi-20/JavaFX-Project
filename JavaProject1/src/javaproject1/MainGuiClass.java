/*
    This project has been created by a team of two member they are: Chintan Joshi and Devarsh Ghanshyambhai Agrawal
    This project has been created by taking an idea from a database system we did tried to achieve it somewhat and there were few of minor changes 
    in this project and it isn't as same as project proporsal but it is close enough.
*/
package javaproject1;

// Importing all the necessary imports for this project
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

import java.io.File;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


//Main GUI class for the project which stores all the information and main class for this project.
public class MainGuiClass extends Application 
{	
    //Creating and intilizing all the neccessary objects here so that it can be accessed in all the methods.
    TextField  nameField = new TextField();
    TextField  idField   = new TextField();
    TextField  ageField  = new TextField();
    TextField  roleField = new TextField();
    ComboBox<String> box;
    String nameValue = nameField.getText();
    String idValue = idField.getText();
    String ageValue = ageField.getText();
    String roleValue = roleField.getText();
    
    //Typical start method for the javafx application
    @Override
    public void start(Stage stage) throws Exception
    {
            Pane        pane = new Pane();  //creating and intializing the pane.
            
            //All of the comboBox elements. and this combo box has been used so that user can store the values
            //in their choice of file out of 2 choice.
            box = new ComboBox<>();
            String Employee1 = "Employee";
            String Student1  = "Student";
            box.getItems().addAll(Employee1,Student1);
            
            //adding all 4 buttons for the main stage.
            Button view         = new Button("VIEW");
            Button save         = new Button("SAVE");
            Button saveToFile   = new Button("SAVE TO FILE");
            Button openDatabase = new Button("OPEN FROM DATABASE");
            Button close        = new Button("CLOSE");
            
            //creating an instance of the HashMapClass so all the objects can be accessible in this class.
            HashMapClass hashMapClass = new HashMapClass();
            
            //This lamba Expression helps in saving all the data from all 4 textFields into the hashMapClass where the hashMap is located 
            //when user clicks on save button
            save.setOnAction(event -> 
            {
               String name = nameField.getText();   //getting the value of nameField textField
               String id   = idField.getText();     //getting the value of idField textField
               String age  = ageField.getText();    //getting the value of ageField textField
               String role = roleField.getText();   //getting the value of roleField textField
                
               //this method stores all the values from the textField into the hashMap
               hashMapClass.storeValues(name, id, age, role);

            });
           
            //this lamba Expression is for the openDatabase button which opens a new stage on clicking the button
            openDatabase.setOnAction(event ->
            {
                OpenDataBaseButton(stage);
                
            });
            
            //Similarly this lambada expression is for the view button which helps in viewing the entries which user enters 
            view.setOnAction(event  -> 
            {
              addToFile(stage);
            });
          
            //this lambada expression is for the button save to file which basically saves the values which user enters
            //into files
            saveToFile.setOnAction(event ->
            {
            	try {
                            saveFile();
                    } catch (Exception e) {
                            e.printStackTrace();
                    }		
            });
            
            //this lambda expression basically closes the stage
            close.setOnAction(event ->
            {
                stage.close();
            });
            
            //Creating and intializing all the labels.
            Label nameLabel = new Label("NAME: ");
            Label idLabel = new Label("ID: ");
            Label ageLabel = new Label("AGE: ");
            Label roleLabel = new Label("ROLE: ");
            
            //setting up layouts/positions for all the lables
            nameLabel.setLayoutX(14);
            nameLabel.setLayoutY(35);
            ageLabel.setLayoutX(441);
            ageLabel.setLayoutY(35);
            idLabel.setLayoutX(16);
            idLabel.setLayoutY(161);
            roleLabel.setLayoutX(429);
            roleLabel.setLayoutY(161);

            //below is the code for the comboBox named box which sets the position of comboBox
            box.setLayoutX(219);
            box.setLayoutY(255);
            box.setPrefWidth(150);
            box.setPrefHeight(25);

            //this are the layout settings for all the buttons
            view.setLayoutX(124);
            view.setLayoutY(296);
            view.setPrefWidth(78);
            view.setPrefHeight(25);
            save.setLayoutX(244);
            save.setLayoutY(296);
            save.setPrefWidth(97);
            save.setPrefHeight(25);
            saveToFile.setLayoutX(369);
            saveToFile.setLayoutY(296);
            saveToFile.setPrefWidth(91);
            saveToFile.setPrefHeight(25);
            openDatabase.setLayoutX(220);
            openDatabase.setLayoutY(339);
            openDatabase.setPrefWidth(150);
            openDatabase.setPrefHeight(25);
            close.setLayoutX(243);
            close.setLayoutY(390);
            close.setPrefSize(105, 25);

            //this are the layout settings for all the textFields
            nameField.setLayoutX(14);
            nameField.setLayoutY(58);
            ageField.setLayoutX(429);
            ageField.setLayoutY(59);
            idField.setLayoutX(14);
            idField.setLayoutY(188);
            roleField.setLayoutX(429);
            roleField.setLayoutY(188);
            
            //adding all the elements in the pane.
            pane.getChildren().addAll(nameField,idField,ageField,roleField,nameLabel,idLabel,ageLabel,roleLabel,box,view,save,saveToFile,openDatabase,close);
            
            //setting up the scene and starting the stage.
            Scene scene = new Scene(pane,600,420);
            stage.setScene(scene);
            stage.setTitle("DATABASE MANAGEMENT");
            stage.show();

		
    } 
    
    /*
    The below method is for the button Open From Database which opens another stage which says this feature is coming soon and a back button
    */
    public void OpenDataBaseButton(Stage stage)
    {
        
        Pane        pane2   = new Pane();                         //creating and intializing the pane
        Label   comingSoon  = new Label();                 //creating and intializing the textField
        Button  goBackToOriginalWin = new Button("Back");    //creating and intializing the back button  
        
        //setting the text of the comingSoon textField
        comingSoon.setText("Sorry this feature is coming soon!");

        //aligning the postion of the comingSoon textField        
        comingSoon.setLayoutX(200);
        comingSoon.setLayoutY(140);
        comingSoon.setPrefSize(200, 50);
        
        //aligning the postion of the back button
        goBackToOriginalWin.setLayoutX(270);
        goBackToOriginalWin.setLayoutY(220);
        goBackToOriginalWin.setPrefSize(50, 40);
        
        //this lambada expression sends the user back to the main stage when pressed on back button
        goBackToOriginalWin.setOnAction(event ->
        {
            try {
                start(stage);
            } catch (Exception ex) {
                Logger.getLogger(MainGuiClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //adding all the elements to the pane
        pane2.getChildren().addAll(comingSoon,goBackToOriginalWin);
        
        //setting up the scene and starting the stage
        Scene scene = new Scene(pane2,600,420);
        stage.setScene(scene);
        stage.setTitle("Open Database");
        stage.show();
        
    }
    
    //this method is for the button view which helps in viewing the data which user entered
    public void addToFile(Stage stage)
    {
                //creating another instane of hashMapClass 
                HashMapClass hashMap = new HashMapClass();
                
                
		Pane pane       = new Pane();               //creating and intializing pane
		Label name      = new Label("Name:");  //creating and intializing label called name
		Label ID        = new Label("ID:");    //creating and intializing label called ID
		Label age       = new Label("Age:");   //creating and intializing label called age
		Label role      = new Label("Role:");  //creating and intializing label called role
		Button button = new Button("BACK");    //creating and intializing button called button(yes I know this makes no sense haha)
                
                //setting up the size of the lables
		name.setPrefHeight(17);
		name.setPrefWidth(45);
		ID.setPrefHeight(17);
		ID.setPrefWidth(28);
		age.setPrefHeight(17);
		age.setPrefWidth(45);
		role.setPrefHeight(17);
		role.setPrefWidth(45);
		
                //aligning the position of the label
		name.setLayoutX(21);
		name.setLayoutY(23);
		age.setLayoutX(337);
		age.setLayoutY(23);
		ID.setLayoutX(179);
		ID.setLayoutY(23);
		role.setLayoutX(507);
		role.setLayoutY(23);
		button.setLayoutX(259);
		button.setLayoutY(272);
		button.setPrefHeight(25);
		button.setPrefWidth(46);
		
                //below code gets the values from the textFields which are in the main Stage
		String name1 = nameField.getText();
		String age1  = ageField.getText();
		String id1   = idField.getText();
		String role1 = roleField.getText();
		
           
                //below code gets the values from the textFields which are in the main Stage
		String name2 = nameField.getText();
		String age2  = ageField.getText();
		String id2   = idField.getText();
		String role2 = roleField.getText();
		
                //creating two new textFields which shows the data from which has been entered by user
		Label label1    = new Label();
		Label label2    = new Label();
                
                //this below code displays the details entered by user inside textField
		label1.setText(hashMap.storeValues(name1, id1, age1, role1));
                
                //setting up the positon for the lable1
		label1.setLayoutX(12);
		label1.setLayoutY(72);
		label1.setPrefHeight(25);
		label1.setPrefWidth(558);
                
                //this below code displays the details entered by user inside textField
                label2.setText(hashMap.storeValues(name2, id2, age2, role2));
		
                //setting up the positon for the lable2
		label2.setLayoutX(12);
		label2.setLayoutY(110);
		label2.setPrefHeight(25);
		label2.setPrefWidth(558);
		
                //the below lambda expression basically sends the user back to the original window
		button.setOnAction(event ->
		{
                    try {
                        start(stage);
                    } catch (Exception ex) {
                        Logger.getLogger(MainGuiClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
		});
                
                //adding all the elements to the pane and starting the stage
		pane.getChildren().addAll(name, ID,age,role,label1,label2,button);
		Scene scene = new Scene(pane,600,420);
		stage.setScene(scene);
		stage.show();
		
   }
    
    //the below method is for the button save which saves the entries in a file
    public void saveFile() throws  Exception
    {
        //creating another hashMap class instance in order to not make too much code readable
        HashMapClass hashmap = new HashMapClass();
        
        //creating File instane which stores the file in selected location
        //PLEASE NOTE CHANGE THE PATH ACCORDING TO WHERE YOU WANT TO SAVE THE FILE.
        File        file = new File("C:\\Study\\PROG24178 Object Oriented Programming 2- Java\\JavaFX\\Student.txt");
        
        String Value1 = box.getValue(); // this gets the values from the comboBox named box.
        
        //the below code checks which option user has selected.
        if("Employee".equals(Value1))
        {
     	  file = new File("C:\\Study\\PROG24178 Object Oriented Programming 2- Java\\JavaFX\\Employee.txt");
        }
        
        PrintWriter print = new PrintWriter(file);  //creating and intitializing(sorry if my spelling is wrong) printwriter.
        
        //the below code gets the entries from the textFields which user has entered
        String name1 = nameField.getText();
        String id1   = idField.getText();
        String age1  = ageField.getText();
        String role1 = roleField.getText();
  
        //this code saves and writes the entries inside a file
        print.write("Name: " + name1 + "  Id:  " + id1 + "  Age:  " + age1 + "  Role:  " + role1);
        print.close();
    }
    
    //main method which runs the project.
    public static void main(String[] args)
    {
            launch(args);
    }
}