package models.mod01mod09;

import java.util.Date;

public class Users implements Comparable<Users>{

	private Long userNumber;
	private Accounts account;
	private Person person;
	private Date date;

	public Users(Long userNumber, Accounts account, Person person, Date date) {
		super();
		this.userNumber = userNumber;
		this.account = account;
		this.person = person;
		this.date = date;
	}

	public Long getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}

	public Accounts getAccount() {
		return account;
	}

	public void setAccount(Accounts account) {
		this.account = account;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Users [userNumber=" + userNumber + ", account=" + account + ", person=" + person + ", date=" + date
				+ "]";
	}
 

	@Override
	public int compareTo(Users o) {
		return (date).compareTo(o.getDate()); 
	}
 
}
