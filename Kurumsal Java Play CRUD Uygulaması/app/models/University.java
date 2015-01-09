package models;

import javax.persistence.Entity;
import play.db.jpa.Model;
import play.data.validation.Required;

@Entity
public class University extends Model {
	
@Required public String name;
  
  public String toString() {
	    return name;
  }
  
}
