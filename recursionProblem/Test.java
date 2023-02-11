package recursionProblem;

public class Test {

	public static void main(String[] args) {
		Student object = new Student();		
//        object.CGPA =9.7f;
		
		object.setCGPA(9.7f);
		System.out.println(object.getCGPA());
		
	}
}
class  Student{
	String name;
	private float CGPA;
	 //getter method to access private variable
	public float getCGPA() {
		return CGPA;
	}
	//setter method to access private variable
	public void setCGPA(float CGPA) {
		this.CGPA = CGPA;
	}
}
