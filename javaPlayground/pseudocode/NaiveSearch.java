
public class NaiveSearch{



public static void searchPattern(String input,String pattern){
 
 

 for(int i = 0;i<input.length();i++)
   
   if(input.charAt(i) == pattern.charAt(0)){
     boolean matched = true;	   
     for(int j=1;j<pattern.length();j++){
        if(input.charAt(i+j) != pattern.charAt(j)){ 
	 matched = false;
         break;
	      }
	}      
        if(matched)
          System.out.println(i);		
	   }
	}



public static void main(String[] args){
  
  String input = "COVFEFE";
  searchPattern(input,"FE");

	}
	}
