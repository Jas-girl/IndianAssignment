package pac211024;

public class MainClass {
	public static void main(String[] args) {
		Nationality obj=new Nationality();
		try {
			obj.Indian("India");
		}
		catch(InvalidCountryException e) {
			System.out.println("U r not Indian");
		}
		Nationality obj1=new Nationality();
		try {
			obj1.Indian("Canada");
		}
		catch(InvalidCountryException e) {
			e.printStackTrace();
		}
		
	}


}
