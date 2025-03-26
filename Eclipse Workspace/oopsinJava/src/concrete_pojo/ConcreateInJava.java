package concrete_pojo;



class Student{
	private String name;
	

@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


public Student(String name) {
		super();
		this.name = name;
	}


public class ConcreteClass {
	public static void main(String[]args) {
		
		Student student = new Student("Sanchitha  M  O");
		 System.out.println("Student name: " + student.getName());
	}
		
		
		/*POJO class
		 * ======
		 * plain old java object(POJO)
		 * rules:
		 * =====
		 * 1.The class is should not extends or implements any class or interface
		 * 2. Every fields(states/properties)should be private 
		 * 3, All-args Constructor
		 * 4.no-args Constructor
		 * 5.toString()
		 * 6. Getter and setter public methods
		 * 
		 * Concrete:
		 * ========
		 * full implementation:
		 * 
		 * concrete method:
		 * ===================
		 * The method contain full implementation /body
		 * 
		 * non-concrete method/abstract method:
		 * =========================================
		 * The method doesn't contain implementation/body
		 * 
		 * concrete class:
		 * =====================
		 * The class contain full implemented/body method
		 */
	}
	

}