package by.htp.lesson7;

public class MainApp {

	public static void main(String[] args) {
		
		Student stud1 = new Student("StudentName1", "StudentSurname1", 17, 2015);
		Student stud2 = new Student("StudentName2", "StudentSurname2", 18, 2016);
		Student stud3 = new Student("StudentName3", "StudentSurname3", 19, 2016);
		Student stud4 = new Student("StudentName4", "StudentSurname4", 17, 2015);
		Student stud5 = new Student("StudentName5", "StudentSurname5", 18, 2016);

		Student[] students = new Student[]{stud1, stud2, stud3, stud4, stud5};
		StudentsGroup group = new StudentsGroup();
				
		group.setStudents(students);
		group.getStudentsLengths(students);
		
		group.addStudent(stud1);
		group.addStudent(stud2);
		group.addStudent(stud3);
		group.addStudent(stud4);
		group.printStudents();
		
		System.out.println();
		System.out.println("Average age of students: " + group.getStudentsAverageOldYear());
	    System.out.println("Number of entered university in 2015 year: " + group.getStudentsEntranceYear2015());
	    
	    group.getMaxStudentsEntranceYear();
	    System.out.println("Max number of students entered the univercity in " + group.getMaxYear());
	    System.out.println("Max number of students " + group.getMaxCount());
		System.out.println();
		
		group.bubleSortByAgeAsc();
		group.bubleSortByAgeDesc();
		
        group.insertSortByAgeAsc();	
      	group.insertSortByAgeDesc();
      	
		group.selectSortByAgeAsc();
		
		System.out.println("Group sorted by students age:");
		group.printStudents();

		
		}

}