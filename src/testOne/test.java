package testOne;

public class test {
	static int i;
	static String s;
	float f=5.0f;

	test() {
		i = 10;
		s = "Rahul";
	}

	void change() {
		i = 20;
		s = "Robin";
	}

	void display() {
		System.out.println(i + " " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1 = new test();
		/*test t2 = new test();*/

		t1.change();
		t1.display();
		/*t2.display();*/
	}

}
