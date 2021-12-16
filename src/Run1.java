class Dog1{
	String name;
	Dog1(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
public class Run1 {

	public static void main(String[] args) {
	Dog1 [] d=new Dog1[4];
	d[0]=new Dog1("Bulldog");
	d[1]=new Dog1("Ruby");
	d[2]=new Dog1("Julie");
	
	for(Object s: d){
		System.out.println(s);
	}
	
	}
}
