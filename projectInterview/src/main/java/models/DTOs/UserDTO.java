package models.DTOs;

import javax.validation.constraints.NotBlank;

import models.DTOs.BaseDTO;

public class UserDTO extends BaseDTO {
		

			@NotBlank(message = "Name is mandatory")
		    private String name;
		     
		    @NotBlank(message = "Email is mandatory")
		    private String email;

		    @NotBlank(message = "Password is mandatory")
		    private String password;

		    
		    @NotBlank(message = "Role is mandatory")
		    private String role;
		    
		    public UserDTO() {
		    	
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

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
}
