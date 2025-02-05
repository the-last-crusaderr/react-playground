import java.nio.file.*;
import java.util.*;
import java.io.IOException;

class NioFileWrite{



public static void main(String[] args){
try{ 
 Path path = Paths.get("nOut");
 List<String> content = List.of("New way","To","Write");
 Files.write(path,content);
 System.out.println("File successfully written");


 List<String> lines = Files.readAllLines(path);  // Read all lines
 for(String s: lines)
  System.out.println(s);	 


}
catch(IOException e){
   System.out.print("Error caught" + e);


	}
	}

	}
