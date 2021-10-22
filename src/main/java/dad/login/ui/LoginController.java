package dad.login.ui;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {
	
	private LoginView view= new LoginView();
	private LoginModel model= new LoginModel();
	
	public LoginController() {
		
		view.getUsuarioText().textProperty().bindBidirectional(model.usuarioProperty());
		view.getPasswordText().textProperty().bindBidirectional(model.contraProperty());
		view.getLdap().selectedProperty().bindBidirectional(model.ldapProperty());
		
		view.getAceptarBoton().setOnAction(e->aceptarBotonAction(e));	
		
		view.getCancelarBoton().setOnAction(e-> cancelarBotonAction(e));
	}

	public LoginView getView() {
		return view;
	}

	public LoginModel getModel() {
		return model;
	}

	private void cancelarBotonAction(ActionEvent e) {
		Stage stage = (Stage) view.getCancelarBoton().getScene().getWindow();
	    stage.close();
	}

	private void aceptarBotonAction(ActionEvent e){
		try {
					
			AuthService auth = model.isLdap() ? new LdapAuthService() : new FileAuthService();
			
			if(auth.login(model.getUsuario(), model.getContra())==true) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Inicio sesion");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son válidos");
				alert.showAndWait();
			}else{
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Inicio sesion");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o contraseña no son válidos");
				alert.showAndWait();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Inicio sesion");
			alert.setHeaderText("Acceso denegado");
			alert.setContentText("No se ha podido validar");
			alert.showAndWait();
		}
	}
	
}
