/*
 * Jeffrey Tam
 * 9-25-2020
 * CMSC 203 21559  
 * Lab 5
 * 
 */
package application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	private Button helloButton;
	private Button howdyButton;
	private Button chineseButton;
	private Button clearButton;
	private Button exitButton;
	private Button frenchButton;
	
	private Label label;
	
	private TextField textField;
	
	//  declare two HBoxes
	
	private HBox hBox1;
	private HBox hBox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	private DataManager dataManager;
	
	Insets inset;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");
		frenchButton = new Button("French");
		label = new Label("Feedback:");
		textField = new TextField();
		//  instantiate the HBoxes
		hBox1= new HBox();
		hBox2 = new HBox();
	
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		inset = new Insets(10);
		
		hBox1.setMargin(helloButton, inset);
		hBox1.setMargin(howdyButton, inset);
		hBox1.setMargin(chineseButton, inset);
		hBox1.setMargin(clearButton, inset);
		hBox1.setMargin(exitButton, inset);
		hBox1.setMargin(frenchButton, inset);
		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(label, textField);
		//  add the buttons to the other HBox
		hBox2.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton, frenchButton);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2);

		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());
		frenchButton.setOnAction(new ButtonHandler());
		
		
	}
	//Task #4:
	//  create a private inner class to handle the button clicks
	/**
	 * When the button is pressed by the user, the button will display text on the screen in the feedback text box
	 */
	class ButtonHandler implements EventHandler<ActionEvent>{
			
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			Object temp = event.getTarget();
			
			if(temp == helloButton) {
				
				textField.setText(dataManager.getHello());
				
			}else if(temp == howdyButton) {
				
				textField.setText(dataManager.getHowdy());

			}else if(temp == chineseButton) {
				
				textField.setText(dataManager.getChinese());
			
			}else if(temp == clearButton) {
				
				textField.setText("");
				
			}else if(temp == exitButton) {

				Platform.exit();
				System.exit(0);
				
			}else if(temp == frenchButton) {
				
				textField.setText(dataManager.getFrench());
				
			}
			
			
		}
	}
	
	
}
	