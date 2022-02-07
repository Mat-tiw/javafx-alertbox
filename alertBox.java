import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertBox{
    Stage window = new Stage();
    Label label = new Label();
    //if you want to change text in button
    //you can change at Button() method
    Button button = new Button("close");
    VBox layout;
    Scene scene;
    public void alertDisplay(String title,String message){

        //will not let user to interact until this window is close
        window.initModality(Modality.APPLICATION_MODAL);
        //set alert window title by taking String from java class that ref this class
        window.setTitle(title);
        window.setMinWidth(250);

        //set text what will be display by taking String from java class that ref this class
        label.setText(message);

        button.setOnAction(e -> window.close());

        layout = new VBox(20);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        //this class likly to cause a bug cuz I haven't test it yet lol
    }
}