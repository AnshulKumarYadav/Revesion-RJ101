package OOP2;

public abstract class AbstractAlgorithm{
	abstract void steps();
}

// class Algorithm1 extends AbstractAlgorithm{

//     @Override
//     void steps() {
//       System.out.println("Steps are going ahead..");
//     }

// }

// Without overriding the methods it will give error because when the subclass extends any abstract super class then it should 
// override abstract methods; 




abstract class Algorithm1 extends AbstractAlgorithm{
}

//  This will not give any exception ;


// abstract class AbstractAlgorithm{
// 	private int stepCount;     // Yes this will not give any exception but if any class extends then it will give an exception;
// }