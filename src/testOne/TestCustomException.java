package testOne;

class TestCustomException1 {

	static void validate(int age) throws InvalidAgeExceptionn {
		if (age < 18)
			throw new InvalidAgeExceptionn("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}
}