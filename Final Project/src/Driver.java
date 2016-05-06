import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	static List<AbstractPerson> Person = new ArrayList<AbstractPerson>();
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
	public static void main(String[] args) {

		                int selection = -1;
		                
		                while(selection != 0) {
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
		                
		                for(int i = 0; i < Person.size(); i++) {
		                        System.out.println(Person.get(i).toString());
		                }
		                
		                in.close();
		        }
		        
		        public static void handleMainRoutes(int selection) {
		                switch(selection) {
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
	                System.out.print("Enter a course id: ");
	                String name = in.next();
	                Course c = new Course(name);
	                Person.add(c);
	        }
		        
		        public static void createPerson() {
		                int selection = -1;
		                
		                while(selection != 0) {
		                        System.out.println("Which hero?");
		                        System.out.println("-----------");
		                        System.out.println("1 - Teacher");
		                        System.out.println("2 - Student");
		                        System.out.println("0 - Exit");
		                        System.out.println("-----------");
		                        System.out.print("Your choice: ");
		                        selection = in.nextInt();
		                        handleHeroCreationRoutes(selection);
		                }
		        }
		        
		        public static void handleHeroCreationRoutes(int selection) {
		                switch(selection) {
		                case 1:
		                        createTeacher();
		                        break;
		                case 2:
		                        createStudent();
		                        break;
		                default:
		                        break;
		                }
		        }
		        
		        public static void createStudent() {
		                System.out.println("Student Creation");
		                System.out.println("----------------");
		                System.out.print("Enter a Name: ");
		                String name = in.next();
		                Student s = new Student(name);
		                Person.add(s);
		        }
		        
		        public static void createTeacher() {
		                System.out.println("Teacher Creation");
		                System.out.println("----------------");
		                System.out.print("Enter a Name: ");
		                String name = in.next();
		                Teacher t = new Teacher(name);
		                Person.add(t);
		        }
		}}

}
