


class ClassB{

 ClassB(){
  System.out.println("Constructor of classB is called");
	 }

 static void info(){
    System.out.println("Static method of ClassB");
	 }

	}


public class ClassA{


  public static void main(String[] args){
     
     ClassB.info();


	  }
	}
