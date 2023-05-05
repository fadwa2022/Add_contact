package poojava;

/*@Getters
@Setters*/

public class contact {
	
  private String lastname;
  private String phoneNumber;
  
//constructeur
  
public  contact(String lastname,String phoneNumber) {
	   this.lastname=lastname;
	   this.phoneNumber=phoneNumber;
   }
  
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@Override
public String toString() {
	return  this.lastname+ " " +this.phoneNumber ;
}
	
  	

}
