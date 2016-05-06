import java.util.Random;
import java.util.UUID;

public 	class Student extends AbstractPerson implements Comparable{
	Random random = new Random();
	UUID StudentID;
	
	public Student(String firstname, String lastname){
		
	}
	
	@Override
	public String toString(){
		return StudentID.toString();
	}
	
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
