import java.io.*;



public class FileReaderExample{


 public static void main(String[] args){
    
    try{
    FileReader reader = new FileReader("output.txt");
    int character;
    while (  character = reader.read() != -1) {
            System.out.print((char) character);  // Read & print character
       }
    reader.close();    

	 }


 catch(IOException i){
   System.out.print("Error");
	 }
}
	}
