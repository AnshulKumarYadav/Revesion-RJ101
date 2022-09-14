package OOP1;

 public class Test {
    int a, b;

	public Test(){
		this(2, 4);
	}

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public static void main(String[] args) {
       Test a = new Test();
    }
}

// Output: Nothing in output 