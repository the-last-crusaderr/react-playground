import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DirList{

  public static void main(String[] args){
    File fd = new File("./");
    String[] dir;
    if(args.length == 0){
      dir = fd.list();
    }
   else{
     dir = fd.list(new DirFilter(args[0]));
	   }

   for(String s: dir)
	   System.out.println(s);

	  }

	}

// impmenting FilenameFilter interface which has only Boolean accept() method
class DirFilter implements FilenameFilter{
       private Pattern pattern;

       public DirFilter(String regex){
          pattern = Pattern.compile(regex);
	       }

      public boolean accept(File dir,String name){
         return pattern.matcher(name).matches();
	      }    

	}	
