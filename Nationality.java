package pac211024;

public class Nationality {
void Indian(String name) throws InvalidCountryException {
	if(name.equalsIgnoreCase("India")) {
		System.out.println("Indian");
	}
	else {
		throw new InvalidCountryException("Entry is not India");
	}
}
}
