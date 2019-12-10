package Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class Attribute {

	private String type;
	
	@ManyToOne
	private AttributeValue value;
	
}
