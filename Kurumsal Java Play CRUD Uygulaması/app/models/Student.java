package models;

import java.util.Date;

import javax.persistence.*;

import play.db.jpa.Model;
import play.data.validation.InPast;
import play.data.validation.Required;

@Entity
public class Student extends Model {
	@Required public String fullName;
	@Required public Integer no;
	@Required public Integer gpa;
	@Required @InPast public Date dateOfRegister;
  
  @ManyToOne
  public Department department;
  
  public String toString() {
	    return fullName;
}
  
}