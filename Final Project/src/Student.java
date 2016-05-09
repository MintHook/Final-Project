import java.util.Random;
import java.util.UUID;

public 	class Student extends AbstractPerson implements Comparable<Person>{
	Random random = new Random();
	UUID StudentID;
	
	public Student(String firstname, String lastname){
		
	}
	
	@Override
	public String toString(){
		return StudentID.toString();
	}
	
	
	@Override
	public int compareTo(Object Person) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
