package models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotBlank;

@Entity
@NamedQuery(name=User.GET_ALL_USERS_QUERY, query="SELECT u FROM User u")
@NamedQuery(name=User.GET_ALL_USERS_ID_QUERY, query="SELECT u.id FROM User u")
@NamedQuery(name=User.GET_USER_BY_NAME_QUERY, query="SELECT u FROM User u WHERE u.name LIKE %name%")

public class User extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_USERS_QUERY = "User.getAllUser";
	public static final String GET_ALL_USERS_ID_QUERY = "User.getAllUsersId";
	public static final String GET_USER_BY_NAME_QUERY = "User.getUserByName";
	
	 	@NotBlank(message = "Name is mandatory")
	    private String name;
	     
	    @NotBlank(message = "Email is mandatory")
	    private String email;

	    @NotBlank(message = "Password is mandatory")
	    private String password;
	    
	    @NotBlank(message = "Role is mandatory")
	    private String role;
	    
	    public User() {
	    	
	    }
	    
	    public User (String name, String email, String password, String role) {
	    	this.name = name;
	    	this.email = email;
	    	this.password = password;
	    	this.role = role;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    
	    
}
