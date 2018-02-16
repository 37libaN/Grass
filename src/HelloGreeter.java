
public class HelloGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter waffle = new Greeter("Waffle", 29);
		System.out.println(waffle.toString());
		Greeter[] many = new Greeter[10];
		for(int count = 0; count<many.length; count++){
			many[count]=new Greeter();
		}
		for(int count = 0; count<many.length; count++){
			System.out.println(many[count].toString());
		}
	}

}
