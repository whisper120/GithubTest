package tirgul1;

public class Main {

	public static void main(String[] args) {
		//a test is here ,and another one
		Timer t1 = new Timer(10, 0);
		Timer t2 = new Timer(200);
		Timer t3 = new Timer(0);
		t1.printInfo();
		t2.printInfo();
		t3.printInfo();

		Timer t4;
		t4 = t1.diff(t1);
		t4.printInfo();W
	}

}
