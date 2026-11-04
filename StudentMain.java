package objReferenceVariable;

public class StudentMain {

	public static void main(String[] args) {
		Student std=new Student();
		
		std.Name="Anirudha";
		std.sid=10;
		std.grade='A';
		
		std.Display();  //output will be print As per sequence of Display method
		
		//within same package we Assign value to variable by using Reference object/variable
		
		// we Access methods by creating Object of other class 
	}

}
