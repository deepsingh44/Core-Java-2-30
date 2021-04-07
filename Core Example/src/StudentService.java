
public class StudentService {
	private Student[] students = {};
	int index=0;

	public StudentService(int size) {
		students = new Student[size];
		/*
		 * students[0] = new Student(1, "abc", 67.7f); students[1] = new Student(2,
		 * "bbb", 64.7f); students[2] = new Student(3, "cgt", 77.7f); students[3] = new
		 * Student(4, "drt", 87.7f); students[4] = new Student(5, "ept", 57.7f);
		 * students[5] = new Student(6, "fre", 77.7f); students[6] = new Student(7,
		 * "ger", 87.7f); students[7] = new Student(8, "his", 57.7f); students[8] = new
		 * Student(9, "is", 66.7f); students[9] = new Student(10, "jis", 68.7f);
		 */
	}

	public void insert(Student student) {
		if(index<students.length) {
			students[index++] = student;
		}
	}

	public void delete(int roll) {
		boolean status = true;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student.getRoll() == roll) {
				// System.out.println(student.getRoll() + "\t" + student.getName() + "\t" +
				// student.getMarks());
				students[i] = null;
				status = false;
			}

		}
		if (status) {
			System.out.println("this student is not available");
		}
	}

	public void fetchByRoll(int roll) {
		boolean status = true;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student.getRoll() == roll) {
				System.out.println(student.getRoll() + "\t" + student.getName() + "\t" + student.getMarks());
				status = false;
			}

		}
		if (status) {
			System.out.println("this student is not available");
		}
	}

	public void fetchByName(String name) {
		boolean status = true;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student.getName().contains(name.toLowerCase())) {
				System.out.println(student.getRoll() + "\t" + student.getName() + "\t" + student.getMarks());
				status = false;
			}

		}
		if (status) {
			System.out.println("this student is not available");
		}
	}

	public void fetchAllStudents() {
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			if (student != null) {
				System.out.println(student.getRoll() + "\t" + student.getName() + "\t" + student.getMarks());
			}
		}
	}

	public void update() {
	
	}

}
