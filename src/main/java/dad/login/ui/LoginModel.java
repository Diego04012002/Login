package dad.login.ui;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	
	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contra= new SimpleStringProperty();
	private BooleanProperty ldap= new SimpleBooleanProperty();
	
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
	
	public BooleanProperty ldapProperty() {
		return this.ldap;
	}
	
	public boolean isLdap() {
		return this.ldapProperty().get();
	}
	
	public void setLdap(final boolean ldap) {
		this.ldapProperty().set(ldap);
	}
	
}
