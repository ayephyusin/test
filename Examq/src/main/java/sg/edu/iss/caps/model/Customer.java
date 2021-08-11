package sg.edu.iss.caps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
     private String firstName;
     private String lastName;
     private String userId;
     private String password;

}
