// playing with static member function and data memebers.. can be accessed with className directly


class StaticTest{
  
 static int throwAway;

 static void memberFunction(int a, int b){
   System.out.println("Printing list of args:"+a + " " + b);
   throwAway = throwAway + 1;
	 }
	}




class StaticJava{
 
 public static void main(String[] args){
      
      System.out.println(StaticTest.throwAway);
      StaticTest.memberFunction(7,10);

      StaticTest st1 = new StaticTest();
      StaticTest st2 = new StaticTest();
      st1.memberFunction(1,2);

     System.out.println(StaticTest.throwAway);
	 }

	}
