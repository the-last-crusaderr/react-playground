



public class Concatenation {
 public static void main(String[] args) {
    String res = new String();
     int i = 10;
    double f = 11.0;
 
      for(String temp: args){
              res += temp;
              }
     System.out.printf("Concatenate [%s %d %f]\n",res,i,f);
 }
}



class SBConcatenation{
   
   public static void main(String args[])
  {
    
    StringBuilder res = new StringBuilder();

    for(String temp: args){
	    res.append(temp);
	    }
   System.out.println(res); 


	}



	}
