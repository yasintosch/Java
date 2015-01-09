package models;
import javax.persistence.*;

import play.data.validation.Required;
import play.db.jpa.Model;


@Entity
public class Lesson extends Model {
	
	@Required public String Name;
	
	  @ManyToOne
	   public Teacher teacher;
	  @ManyToOne
	  public Student student;
	  
	  public String toString() {
		    return Name;
	  } 

}
