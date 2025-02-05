import java.io.*;



public class FileWriterExample{

 
 public static void main(String[] args){
    try{	 
    FileWriter fd = new FileWriter("output.txt");
    fd.write("This is written by fileHandler\n");
    fd.write("There is better way to write in file\n");
    fd.write("I still chose older style\n");
    fd.close();
    System.out.println("File is successfully written");
	}
    catch(IOException e){

    System.out.println("Exception has thrown" + e); 

	    }



	}
	}



