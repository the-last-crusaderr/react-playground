import java.util.*;


public class Gerbil{
   
   private int gerbilNum;

   Gerbil(int i){
    gerbilNum = i;
	   }

   int hop(){
     return gerbilNum;
	   }

   public static void main(String[] args){
      ArrayList<Gerbil> storage = new ArrayList<Gerbil> ();

      for(int i=0;i<10;i++)
	  storage.add(new Gerbil(i));


      for(int i=0;i<storage.size();i++)
	 System.out.println(storage.get(i) + " " + storage.get(i).hop());     

	   }
	   
	}


	
