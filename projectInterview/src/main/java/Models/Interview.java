package Models;

import javax.persistence.ManyToOne;

public class Interview {
	
	@ManyToOne
	Question question;
	 
	
}
