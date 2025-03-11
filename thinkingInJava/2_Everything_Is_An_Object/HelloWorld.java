import java.util.*;



class StaticTest{
 
 static int i = 10;

 static void incremental(){
       
       System.out.println(i++);

	 }


	}





class DataOnly{
   int i;
   boolean b;
   float f;


   static int storage(String s){
      return s.length() * 2;
	   }

	}



class ATypeName{

    void message(){
	System.out.println("You are surprised to know that I am a poor little class and my existence doesn't matter to the world.");
	    }
	}





public class HelloWorld{
   static int i;
   static float f;
   public static void main(String args[]){
  
     System.out.println("This is the starting of my Java Journey");

    // printing command line args

    for(String arg : args){
      System.out.println(arg);
	    }




     // statements to verify default values of instance primitive variables 
      System.out.println(i);
      System.out.println(f);

    // instantiate new object of type ATypeNmae
        
	ATypeName pauper = new ATypeName();
        pauper.message();

    // Demo working of Dataonly classes
        
	DataOnly dataonly = new DataOnly();
        System.out.println("Integer = " + dataonly.i + " Float = " + dataonly.f + " Boolean = " + dataonly.b );
        System.out.println(DataOnly.storage("abcde"));
	  
     // Demo of working of staic test class
     
    StaticTest s1 = new StaticTest();
    StaticTest s2 = new StaticTest();
    
    for(int i=0;i<5;i++){
       s1.incremental();
       s2.incremental();
	    }


//     StaticTest.incremental();
//     StaticTest.incremental();



	  }



	}



