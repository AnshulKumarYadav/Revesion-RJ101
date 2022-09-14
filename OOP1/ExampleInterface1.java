package OOP1;


// a) Which of the line will give error and Why ?
// Ans: Line 5 will give error because an interface can not have a private datatype.

// interface ExampleInterface1 {
// 		int value1 = 10; // Line 1
// 		public int value2 = 15; // Line 2
// 		public static int value3 = 20; // Line 3
// 		public static final int value4 = 25; // Line 4
// 		private int value5 = 10; // Line 5
// }


// b) Below code will give error or not ? If Yes, Then give reason
// This code will give error when implemented by a class because interface does not have a method with body;

interface ExampleInterface1 {
		void method1();

		default void method5() {
				System.out .println("Method5");
		}
}
