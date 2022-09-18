package hw_01_01_students;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	protected boolean qualifyingExamTaken;
	public PhdStudent(int no,String name,int year,Date dob,String major, String advisor,String thesis, boolean qualifyingExamTaken){
		super(no,name,year,dob, major,advisor,thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
		
	
	}
	void writePaper() {
		System.out.println("Phd Student is busy with writing paper.");

	}
	@Override
	public String toString() {
		return "PhdStudent [qualifyingExamTaken=" + qualifyingExamTaken + "]";
	}
	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}
	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	@Override
	void writeThesis() {
		System.out.println("Phd Student writing thesis about "+ thesis);
		
	}
	@Override
	void meetWithAdvisor() {
		System.out.println("Phd Student is on a meeting with advisor about "+ thesis);
	}
	@Override
	void study() {
		System.out.println("Phd Student is studying");
	}
	@Override
	void register() {
		System.out.println("Phd Student has just registered");
		
	}

}