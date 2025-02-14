package dad.login.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
	
	private Label usuarioLabel;
	private Label contraseñaLabel;
	private TextField usuarioText;
	private PasswordField passwordText;
	private CheckBox Ldap;
	private Button aceptarBoton;
	private Button cancelarBoton;
	
	public LoginView() {
		super();
		
		usuarioLabel= new Label("Usuario:");
		contraseñaLabel= new Label("Contraseña:");
		
		usuarioText= new TextField();
		usuarioText.setPromptText("Nombre del usuario");
		
		passwordText= new PasswordField();
		passwordText.setPromptText("Contraseña del usuario");
		
		Ldap= new CheckBox("Usar LDAP");
		
		aceptarBoton= new Button("Acceder");
		
		cancelarBoton= new Button("Cancelar");
		
		GridPane usuarioContra= new GridPane();
		usuarioContra.setPadding(new Insets(5));
		usuarioContra.setHgap(8);
		usuarioContra.setVgap(8);
		usuarioContra.addRow(1, usuarioLabel, usuarioText);
		usuarioContra.addRow(2, contraseñaLabel, passwordText);
		
		HBox botones= new HBox(8, aceptarBoton, cancelarBoton);
		
		setSpacing(8);
		setFillWidth(false);
		setAlignment(Pos.CENTER);
		getChildren().addAll(usuarioContra, Ldap, botones);
	
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getPasswordText() {
		return passwordText;
	}

	public CheckBox getLdap() {
		return Ldap;
	}

	public Button getAceptarBoton() {
		return aceptarBoton;
	}

	public Button getCancelarBoton() {
		return cancelarBoton;
	}
	
}
