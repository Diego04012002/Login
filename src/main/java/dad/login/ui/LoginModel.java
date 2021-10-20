package dad.login.ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	
	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contra= new SimpleStringProperty();
	
	public StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	public void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	
	public StringProperty contraProperty() {
		return this.contra;
	}
	
	public String getContra() {
		return this.contraProperty().get();
	}
	
	public void setContra(final String contra) {
		this.contraProperty().set(contra);
	}
	
}
