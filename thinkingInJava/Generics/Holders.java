



public class Holders<T>{
	private T t;

	Holders(){

           System.out.println("Holders class is created");
		}

        void set(T t){
		this.t = t;
		}
        
	T get(){
           return this.t;
		}


 public static void main(String[] args){
       Holders<String> holder = new Holders<>();
       holder.set("Socket 345");
       System.out.println(holder.get());

      // int holder 
      Holders<Integer> intHolder = new Holders<>();
      intHolder.set(15);
      System.out.println(intHolder.get());

     // double Holder
     Holders<Double> doubleHolder = new Holders<>();
     doubleHolder.set(22.22);
     System.out.println(doubleHolder.get());

	 }

	}



