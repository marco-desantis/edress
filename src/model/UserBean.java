package model;

public class UserBean {

	private String email;
	private String psw;
	private String nome;
	private String cognome;
	private String citta;
	private String indirizzo;
	private int cap;

	public UserBean() {
	}

	public UserBean(String email, String psw) {
		this.email = email;
		this.psw = psw;
	}

	public String getEmail() {
		return email;
	}

	public String getPsw() {
		return psw;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setCognome(String c) {
		cognome = c;
	}

	public void setEmail(String e) {
		email = e;
	}

	public void setPsw(String p) {
		psw = p;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String toString() {
		return "User: email=" + email + ", psw=" + psw + ", nome=" + nome + ", cognome=" + cognome + ", citta="
				+ citta + ", indirizzo=" + indirizzo + ", cap=" + cap;
	}

}
