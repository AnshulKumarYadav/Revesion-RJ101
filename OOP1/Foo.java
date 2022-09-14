package OOP1;

public class Foo {
    public void doIt(int number){
		System.out.println("A");
	}

	public void doIt(String string){
		System.out.println("B");
	}
}

class Bar extends Foo{
	public void doIt(float number){
		System.out.println("C");
	}
}

class FooResult {
    public static void main(String[] args) {
        Bar x = new Bar();
        x.doIt("hello");
    }
}

// Bar x = new Bar();
// x.doIt("hello");


// Output: This will give an exception because object creation out of any class but if we call using class than it will give B;