
class Callback{

  void callThisWhenDone(){
     System.out.println("The caller is informed with callback mechanism");
	}

}

class Callee{
 
 private Callback c;

 Callee(Callback c){
  this.c = c;
	 }

 public void notifyUser(){
	 System.out.println("The task is finished and ......");
     c.callThisWhenDone();
	 }


 void executeTask(){	 
    System.out.println("Task is in progress");
    try{
     Thread.sleep(5000);
    }
    catch(InterruptedException e) {
            System.out.println("Task was interrupted");
        }
   notifyUser();
   }
}	



public class Caller{
  
  public static void main(String[] args){
   Callback callback = new Callback();
   Callee callee = new Callee(callback);

   System.out.println("Starting the task.......");
   callee.executeTask();
    }

	}
