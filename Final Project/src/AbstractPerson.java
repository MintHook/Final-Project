import java.util.UUID;


public abstract class AbstractPerson {
	String firstname;
	String lastname;
	
	@Override
	public String toString(){
		return firstname + " " + lastname;
	}
}


