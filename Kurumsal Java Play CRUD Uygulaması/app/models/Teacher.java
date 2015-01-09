package models;

import java.util.Date;

import javax.persistence.*;

import play.db.jpa.Model;
import play.data.validation.InPast;
import play.data.validation.Required;


@Entity
public class Teacher extends Model {
@Required  public String fullName;
@InPast public Date dateOfHire;
  
  @ManyToOne
  public Department department;
  
  public String toString() {
	    return fullName;
}
}