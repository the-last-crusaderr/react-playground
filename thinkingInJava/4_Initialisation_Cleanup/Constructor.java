import java.util.*;



class SimpleConstructor{

String insVar = "I am a member data";

/*
SimpleConstructor(){
  this("I got no arguments");
	}

*/

SimpleConstructor(String s){
 System.out.println("Did you expect me to print this :" + s);
 System.out.println(insVar);
	}

	}


class ArrayWorking{

        Random rand = new Random(10);	

	ArrayWorking(){

        Integer[] arr = new Integer[rand.nextInt(10)];
        for(Integer i: arr){
	  i = rand.nextInt(100);	
          System.out.println(i);
		}

		}


	}




public class Constructor{
 
 public static void main(String args[]){

    SimpleConstructor s1 = new SimpleConstructor("Print it");
  //  SimpleConstructor s2 = new SimpleConstructor(); 
    ArrayWorking a = new ArrayWorking();
	 }

	} 
