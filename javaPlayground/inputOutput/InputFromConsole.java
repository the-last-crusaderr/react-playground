import java.util.*;




public class InputFromConsole{
   

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Your name: ");
    String name = scanner.nextLine();
    System.out.println("Your lucky num: ");
    int num = scanner.nextInt();

    System.out.println("Welcome to virtual world of objects Mr. " + name + ".We would use your lucky number as your virtual id here:" + num);

 scanner.close();

	  }
	}
