class Student1{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}	
	
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		this.age=a;
		
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setName("Viren");
		System.out.println(s.getName());
		s.setAge(20);
		System.out.println(s.getAge());

	}

}
