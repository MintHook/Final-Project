import java.util.UUID;

public 	class Teacher extends AbstractPerson implements Comparable{
	UUID TeacherID;
	
	public Teacher(String firstname, String lastname){
		
	}
	
	@Override
	public String toString(){
		return TeacherID.toString();
	}
	
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}