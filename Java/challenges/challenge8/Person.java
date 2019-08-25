package challenge_8;

import java.sql.Date;

public class Person {
	private String name; 
	private int month; 
	private int day; 
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int month, int day) {
		super();
		this.name = name;
		this.month = month;
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void status() { 
		System.out.print("  name:" + this.name);
		System.out.print("  birthday:" + this.day + "/" + this.month + " "); 
		System.out.println("");
	} 
}
