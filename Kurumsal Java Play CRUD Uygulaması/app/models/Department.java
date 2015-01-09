package models;

import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.Model;

@Entity
public class Department extends Model {
	@Required public String Name;
	
	@ManyToOne
	public Faculty faculty;
	
	 public String toString() {
		    return Name;
	  }
	
}
