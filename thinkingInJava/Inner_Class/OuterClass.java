








public class OuterClass{

  private String s = "I am instance varaible of outerClass";
  
  class InnerClass{
       
    public void innerClassMethod(){
        System.out.println("Mesages from InnerClass methods " + s);
	    }


     public InnerClass outerClassMethod(){
            return OuterClass.this.outerClassMethod();

	     }
     	    
	  }

  
  public InnerClass outerClassMethod(){
         
	 System.out.println("Messages from outerClass methods");
	 InnerClass inn = new InnerClass();
	 return inn;
	  }



	  public static void main(String[] args){

		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();    // keep outer.new in mind
	        
		outerClass.outerClassMethod();
		innerClass.innerClassMethod();
		innerClass.outerClassMethod();
	}
	  

	}
