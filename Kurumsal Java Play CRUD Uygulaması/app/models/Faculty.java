package models;

import javax.persistence.*;

import play.data.validation.*;
import play.db.jpa.Model;

@Entity
public class Faculty extends Model{
	
	@Required public String Name;
	
	@ManyToOne
	public University university;
	
	 public String toString() {
		    return Name;
	  }

}
