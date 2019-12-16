package models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=User.GET_ALL_USERS_QUERY_NAME , query="SELECT u FROM User u")
@NamedQuery(name=User.GET_USER_BY_EMAIL_QUERY_NAME , query="SELECT u FROM User u WHERE u.email = :email")

public class User extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_USERS_QUERY_NAME = "User.getAllUser";
	public static final String GET_USER_BY_EMAIL_QUERY_NAME  = "User.getUserByEmail";
	

	    private String name; 

	    private String email;

//	    private String password;
	    
	    private String hashcode;
	    private String salt;

	    private String role;
	    
	    public User() {
	    	
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

		public String getHashcode() {
			return hashcode;
		}

		public void setHashcode(String hashcode) {
			this.hashcode = hashcode;
		}

		public String getSalt() {
			return salt;
		}

		public void setSalt(String salt) {
			this.salt = salt;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		

	    
	    
}
