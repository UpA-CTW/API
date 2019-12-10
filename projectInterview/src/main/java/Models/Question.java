package Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Question extends GenericEntity {

	private static final long serialVersionUID = 1L;
	
	private String question;
	private String answer;
	
	@ManyToOne
	private Attribute attribute;
	
}
