package by.htp.lesson7;


public class Student {

	private String name;
	private String surname;
	private int yearold;
	private int entranceyear;
	
	public Student(){
		
	}
	
	public Student(String name, String surname, int yearold, int entranceyear){
		this.name = name;
		this.surname = surname;
		this.yearold = yearold;
		this.entranceyear = entranceyear;
	}
	
	public void setStudent(String name, String surname, int yearold, int entranceyear){
		this.name = name;
		this.surname = surname;
		this.yearold = yearold;
		this.entranceyear = entranceyear;
	}
	
	public String getStudentName(){
		return this.name;
	}
	
	public String getStudentSurname(){
		return this.surname;
	}
	
	public int getStudentEntranceYear(){
		return this.entranceyear;
	}
	
	public int getStudentYearOld(){
		return this.yearold;
	}
}