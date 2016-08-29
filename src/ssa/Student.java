package ssa;

import java.util.*;

public class Student implements Comparable{

	@Override
	public int compareTo(Object studentAsObj) {
		Student student = (Student) studentAsObj;
		return this.firstName.compareTo(student.firstName);
}
	
	void printStudentDetail(Student student) {
	System.out.printf("%-18s   %-22s   %-25s   %-19s   %1d \n",
			student.id, student.firstName, student.lastName, student.eyeColor, student.monthsEmployed);
}
	void printRosterHeader()  {
			String header = "Student Class Roster \n"
					+ "Employee ID          First Name               Last Name                 Eye Color             Months Employed\n"
					+ "=============       ================        ================            =============        ====================\n";
  System.out.println(header);
  
}
    static ArrayList<Student> classRoster = null; 
	public String id;
	public String firstName;
	public String lastName;
	public String eyeColor;
	public int monthsEmployed;
	
	public void printClassRoster() {
	  Collections.sort(classRoster); 
	this.printRosterHeader();
			for(Student aStudent : classRoster){
				this.printStudentDetail(aStudent);
	}
		HashMap<String, Student> ClassDataBase = new HashMap<String, Student>();
		for (Student aStudent: classRoster){
			ClassDataBase.put(aStudent.id, aStudent);
			
		}
		this.printRosterHeader();
		Student Aisha = ClassDataBase.get("004014");
		Student Karen = ClassDataBase.get("001449");
		Student Peter = ClassDataBase.get("004444");
		
		this.printStudentDetail(Karen);
		this.printStudentDetail(Aisha);
		this.printStudentDetail(Peter);
}	
		
	void Init() {
		String[][] students = {
				{"004014", "Aisha", "Covington", "brown", "10"},
				{"008888", "Evan", "Tizard", "brown", "12"},
				{"001449", "Karen", "Reiter", "blue", "10"},
				{"343769", "Shaquil", "Timmons", "brown", "11"},
				{"772223", "Daniel", "Kiros", "brown", "3"},
				{"001100", "Kevin", "Tran", "other", "12"},
				{"005255", "Joesph", "Hill", "brown", "13"},
				{"306700", "Li", "Lui", "brown", "12"},
				{"009999", "Stephen", "Ellwood", "other", "2"},
				{"001212", "Stephen", "Rook", "brown", "11"},
				{"004444", "Peter", "Choi", "brown", "2"},
				{"001122", "Michael", "Clair", "other", "12"},
				{"132617", "Reuben", "Turner", "blue", "12"},
				{"267252", "Dax", "Richards", "brown", "12"},
				{"006789", "Arun", "Soma", "brown", "2"},
				{"229949", "Michael", "Sykes", "brown", "13"},
				{"215296", "Joshua", "Franey", "other", "27"},
				{"523420", "Gabriel", "Hamilton", "other", "10"},
				{"474143", "Jonathan", "Stafford", "brown", "12"},
				{"005295", "Kyle", "Deen", "blue", "2"}
		};
		
	for(String[] aStudent : students) {
        Student student = new Student();
        student.id = aStudent[0];
        student.firstName = aStudent[1];
        student.lastName = aStudent[2];
        student.eyeColor = aStudent[3];
        student.monthsEmployed = Integer.parseInt(aStudent[4]);
        classRoster.add(student);  } 
	}		

	
	
	public Student() {
			if(classRoster == null) {
				classRoster = new ArrayList<Student>();
					Init();
}
	;
	
}
	}



