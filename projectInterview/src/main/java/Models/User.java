package Models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotBlank;

@Entity
@NamedQuery(name=User.GET_ALL_USERS_QUERY, query="SELECT u FROM User u")
@NamedQuery(name=User.GET_ALL_USERS_ID_QUERY, query="SELECT u FROM User.id u")

public class User extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_USERS_QUERY = "User.getAllUser";
	public static final String GET_ALL_USERS_ID_QUERY = "User.getAllUsersId";
	
	 	@NotBlank(message = "Name is mandatory")
	    private String name;
	     
	    @NotBlank(message = "Email is mandatory")
	    private String email;

	    @NotBlank(message = "Password is mandatory")
	    private String password;
	    
	    public User() {
	    	
	    }
	    
	    public User (String name, String email, String password) {
	    	this.name = name;
	    	this.email = email;
	    	this.password = password;
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
