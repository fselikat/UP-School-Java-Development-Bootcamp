package hw_02_01_abstractstudents;
import java.util.Date;

public  abstract class Student { 
	protected int no;
	protected String name;
	protected int year;
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	Date dob;
	protected String major;
	
	public Student(int no,String name,int year, Date dob, String major){
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
		
	}
	public Student() {
		
	}
	abstract void study();
		
	abstract void register();
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	
	
	

}
