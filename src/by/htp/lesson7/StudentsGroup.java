package by.htp.lesson7;

public class StudentsGroup {

	private Student[] students;
	private int studentsCounter;
	private int MaxCounter;
	private int MaxYear;

	
	public void setStudents(Student[] students){
		if(students != null)
		this.students = students;
	}
			
	public Student[] getStudents(){
		return this.students;
	}
	
	public int getMaxYear(){
		return this.MaxYear;
	}
	
	public int getMaxCount(){
		return this.MaxCounter;
	}
	
	public void getStudentsLengths(Student[] students){
		this.studentsCounter = students.length;
	}

	public void addStudent(Student student){
	  if(this.students.length < 15){
		if(this.students != null){
    		if(studentsCounter < this.students.length){
    			this.students[studentsCounter] = student;
    			studentsCounter++;
    			
    		}else{
    			Student[] newstudents = new Student[this.students.length + 1];
    			for(int i=0; i<this.students.length; i++){
    				newstudents[i] = this.students[i];    				
    			}
    			this.students = newstudents;
    			this.students[studentsCounter] = student;
    			studentsCounter++;
    			
       		}
    	}
    	else {
    		this.students = new Student[5];
    		this.students[0] = student;
    		studentsCounter++;
    		
    	    }
        }
	}
	public int getStudentsAverageOldYear(){
		int YearCounter = 0;
		for(int i = 0; i< this.students.length; i++){
			YearCounter = YearCounter + this.students[i].getStudentYearOld(); 
		}
		YearCounter = (int)YearCounter/this.students.length;
		if(YearCounter%10 >=5) YearCounter++;
		return YearCounter;
	}
	
	public int getStudentsEntranceYear2015(){
		int Counter = 0;
		for(int i = 0; i< this.students.length; i++){
			if(students[i].getStudentEntranceYear() == 2015)
			Counter++; 
		}
		return Counter;
	}
	
	public void getMaxStudentsEntranceYear(){
		int maxYear = 0;
		int maxCounter = 0;
		
		for(int i = 0; i< this.students.length; i++){
			int Year = this.students[i].getStudentEntranceYear();
			int Counter = 1;
			
			for(int j=0; j<this.students.length; j++){
			    if(this.students[j].getStudentEntranceYear() == Year)
			    Counter++; 
			}
			if(Counter > maxCounter){
				maxYear = this.students[i].getStudentEntranceYear();
				maxCounter = Counter;
			}			
		}
		this.MaxYear = maxYear;
		this.MaxCounter = maxCounter;
	}
	
	public void printStudents(){
		System.out.println("Students group: ");
		Student[] s = this.students; 
		for(int i = 0; i<s.length; i++){
			System.out.println(i+1 + ". Name: " + s[i].getStudentName() + " Surname: " + s[i].getStudentSurname() + " Year Old: " + s[i].getStudentYearOld() + " Entrance Year: " + s[i].getStudentEntranceYear());
		}
	}
	
	public void bubleSortByAgeAsc(){
		
		Student s = new Student();
		
		for(int i = 0; i< this.students.length; i++){
			for(int j=1; j<this.students.length - i; j++){
			    if(this.students[j-1].getStudentYearOld() > this.students[j].getStudentYearOld()){
			    	s = this.students[j-1];
			    	this.students[j-1] = this.students[j];
			    	this.students[j] = s;
			    }
			}
			
		}
	}
	
   public void bubleSortByAgeDesc(){

	   Student s = new Student();
		
		for(int i = 0; i< this.students.length; i++){
			for(int j=1; j<this.students.length - i; j++){
			    if(this.students[j-1].getStudentYearOld() < this.students[j].getStudentYearOld()){
			    	s = this.students[j-1];
			    	this.students[j-1] = this.students[j];
			    	this.students[j] = s;
			    }
			}
			
		}
	}
   
   public void insertSortByAgeAsc(){
		
		Student s = new Student();
		
		for(int i = 1; i< this.students.length; i++){
			s = this.students[i];
			int j=i;
			while(j>0 && this.students[j].getStudentYearOld() < this.students[j-1].getStudentYearOld()){
                    s = this.students[j];				
			       	this.students[j] = this.students[j-1];
			       	this.students[j-1] = s;
			    	j = j-1;			    	
		    }			
		}
	}

   public void insertSortByAgeDesc(){
		
		Student s = new Student();
		
		for(int i = 1; i< this.students.length; i++){
			s = this.students[i];
			int j=i;
			while(j>0 && this.students[j].getStudentYearOld() > this.students[j-1].getStudentYearOld()){
                   s = this.students[j];				
			       	this.students[j] = this.students[j-1];
			       	this.students[j-1] = s;
			    	j = j-1;			    	
		    }			
		}
	}
   
   public void selectSortByAgeAsc(){
		
		Student s = new Student();
		
		for(int i = 0; i< this.students.length-1; i++){
			int pos = i;
			for(int j = i+1; j<this.students.length; j++){	
				if(this.students[j].getStudentYearOld() < this.students[pos].getStudentYearOld()){
					pos=j;
				}
            s = this.students[i];				
			this.students[i] = this.students[pos];
			this.students[pos] = s;   				    	
		    }			
		}
	}
   
 
	
 }
