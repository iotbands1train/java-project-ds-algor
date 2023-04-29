package models.mod01mod09;

public class Accounts implements Comparable<Accounts>  {
	
	private Long accountID;
	private String user;
	private String pass; 
	
	public Accounts(Long accountID, 
			String user, String pass  ) {
		super();
		this.accountID = accountID;
		this.user = user;
		this.pass = pass; 
	}
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	} 
	 
	@Override
	public int compareTo(Accounts o) { 
		return user.compareToIgnoreCase(o.getUser());
	}
	@Override
	public String toString() {
		return "Accounts [accountID=" + accountID + ", user=" + user + ", pass=" + pass + "]";
	}
	
	

}
