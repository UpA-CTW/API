package Models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class User extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	
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
