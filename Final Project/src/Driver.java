import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	static List<AbstractPerson> Teacher = new ArrayList<AbstractPerson>();
	static List<AbstractPerson> Student = new ArrayList<AbstractPerson>();
	static List<Course> Course = new ArrayList<Course>();
	static Scanner in = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {

		int selection = -1;

		while (selection != 0) {
			System.out.println("What to do?");
			System.out.println("-----------");
			System.out.println("2 - Course");
			System.out.println("1 - Person");
			System.out.println("0 - Exit");
			System.out.println("-----------");
			System.out.print("Your choice: ");
			selection = in.nextInt();
			handleMainRoutes(selection);
		}

		//for (int i = 0; i < Person.size(); i++) {
			//System.out.println(Person.get(i).toString());
		//}

		in.close();
	}

	public static void handleMainRoutes(int selection) {
		switch (selection) {
		case 1:
			createPerson();
			break;
		case 2:
			createCourse();
			break;
		default:
			break;
		}
	}

	public static void createCourse() {
		System.out.println("Course Creation");
		System.out.println("----------------");
		System.out.print("Enter a course name: ");
		String name = in.next();
		Course c = new Course(name);
		Course.add(c);
	}

	public static void createPerson() {
		int selection = -1;

		while (selection != 0) {
			System.out.println("Which type of Person?");
			System.out.println("-----------");
			System.out.println("2 - Teacher");
			System.out.println("1 - Student");
			System.out.println("0 - Exit");
			System.out.println("-----------");
			System.out.print("Your choice: ");
			selection = in.nextInt();
			handleHeroCreationRoutes(selection);
		}
	}

	public static void handleHeroCreationRoutes(int selection) {
		switch (selection) {
		case 1:
			createStudent();
			break;
		case 2:
			createTeacher();
			break;
		default:
			break;
		}
	}

	public static void createStudent() {
		System.out.println("Student Creation");
		System.out.println("----------------");
		System.out.print("Enter a firstName: ");
		String firstname = in.next();
		System.out.print("Enter a last Name: ");
		String lastname = in.next();
		Student s = new Student(firstname, lastname);
		Student.add(s);
	}

	public static void createTeacher() {
		String c0urse = null;
		System.out.println("Teacher Creation");
		System.out.println("----------------");
		String firstname = in.next();
		System.out.print("Enter a last Name: ");
		String lastname = in.next();
		System.out.println("Do you need the list of courses possible to teach?");
		System.out.println("----------------");
		String answer = in.next();
		if (answer.equals("yes")){
			System.out.println("1: History/n2: English/n3: Programming in Java/n4: Physics/n5: Robotics/n6: Math/n7: Other");
			System.out.println("What class are you teaching?");
			String course = in.next();
			c0urse = course;
		}else if (answer.equals("no")){
			System.out.println("What class are you teaching?");
			String course = in.next();
			c0urse = course;
		}else{
			c0urse = null;
		}
		Teacher t = new Teacher(firstname, lastname, c0urse);
		Teacher.add(t);
	}
}