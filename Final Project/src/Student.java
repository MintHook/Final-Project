import java.util.UUID;

public 	class Student extends AbstractPerson implements Comparable{
	UUID StudentID;
	
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
