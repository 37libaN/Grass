
public class Greeter {
	private String name;
	private int age;

	public Greeter() {
		name="bob";
		age=12;
	}
	public Greeter(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Greeter object: Age- "+age+", Name- "+name;
	}
}
