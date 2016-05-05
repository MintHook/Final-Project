import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	static List<AbstractPerson> Person = new ArrayList<AbstractPerson>();
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		        
		        
		        
		                int selection = -1;
		                
		                while(selection != 0) {
		                        System.out.println("What to do?");
		                        System.out.println("-----------");
		                        System.out.println("3 - Course");
		                        System.out.println("2 - Teacher");
		                        System.out.println("1 - Student");
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
		                        createHeroes(); 
		                        break;
		                case 2:
	                        createHeroes(); 
	                        break;
		                case 3:
	                        createHeroes(); 
	                        break;
		                default:
		                        break;
		                }
		        }
		        
		        public static void createHeroes() {
		                int selection = -1;
		                
		                while(selection != 0) {
		                        System.out.println("Which hero?");
		                        System.out.println("-----------");
		                        System.out.println("1 - Warrior");
		                        System.out.println("2 - Wizard");
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
		                        createWarrior();
		                        break;
		                case 2:
		                        createWizard();
		                        break;
		                default:
		                        break;
		                }
		        }
		        
		        public static void createStudent() {
		                System.out.println("Warrior Creation");
		                System.out.println("----------------");
		                System.out.print("Enter a Name: ");
		                String name = in.next();
		                Warrior w = new Warrior(name);
		                heroes.add(w);
		        }
		        
		        public static void createTeacher() {
		                System.out.println("Wizard Creation");
		                System.out.println("----------------");
		                System.out.print("Enter a Name: ");
		                String name = in.next();
		                Wizard w = new Wizard(name);
		                heroes.add(w);
		        }
		}}

}
