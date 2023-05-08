package models.mod01mod09;

public class Person  implements Comparable<Person>{

	private Long id;
	private String fname;
	private String lname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	
	
	public Person(Long id, String fname, String lname, String street, String city, String state, String zip, String phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getType() {
		return phone;
	}
	public void setType(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name= "+lname +", " +  fname  + ", id="   + id +" ] ";
	} 
	
	@Override
	public int compareTo(Person o) {
		int resultsFname =fname.compareToIgnoreCase(o.getFname());
		int resultsLname =lname.compareToIgnoreCase(o.getLname());	
		int resultsStreet =street.compareToIgnoreCase(o.getStreet());	 
		return  (resultsLname==0)?(resultsFname==0)?resultsStreet:resultsFname:resultsLname;
	} 
}
