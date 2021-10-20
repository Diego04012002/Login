package dad.login;

import dad.login.ui.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private LoginController loginController;
	
	public void start(Stage primaryStage) throws Exception {
		loginController= new LoginController();
		
		Scene escena= new Scene(loginController.getView(), 320, 240);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Login");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
