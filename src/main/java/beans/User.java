package beans;
public class User {
	private String type; // Customer or Manager
	private Long idUser;
	private String login;
	private String password;
	private String lastName;
	private String firstName;
	private String address;
	// Constructeur
	public User(String type, String login, String password, String lastName, String firstName, String address) {
		this.type = type;
		this.login = login;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}
	public User() {}
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	public Long getIdUser() { return idUser; }
	public void setIdUser(Long idUser) { this.idUser = idUser; }
	public String getLogin() { return login; }
	public void setLogin(String login) { this.login = login; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
}
