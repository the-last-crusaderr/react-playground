import java.io.*;


public class ByteStream{
   public static void main(String[] args) throws IOException{
     //FileReader fd = new FileReader();
     try(FileReader finp = new FileReader("input.txt");
         FileWriter fout = new FileWriter("output.txt")){

     int data;

     while((data = finp.read()) != -1){
          fout.write(data);
	     }
	System.out.println("File copied");
	   }
catch(IOException e){
	e.printStackTrace();
	}
}

	}
