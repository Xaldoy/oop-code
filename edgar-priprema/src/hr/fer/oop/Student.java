package hr.fer.oop;

public class Student {
	private String name, surname;
	private int age;

	public Student(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}
	
	static void sortStudentsOnAge(Student[] students) {
		Student temp = new Student("","",0);
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = i+1; j < students.length; j++) {
				if(students[i].getAge() < students[j].getAge()) {
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
	}
	
}