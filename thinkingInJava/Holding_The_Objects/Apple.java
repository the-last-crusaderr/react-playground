import java.util.*;


public class Apple{
 static private int nextId = 1;
 private int id = nextId;

  Apple(){
//  id = nextId;
  nextId++;
  System.out.println("Apple is created");
	 }

  public void  displayInfo(){
    System.out.println("I am the apple with id: " + id );

	  }	 

 public static void main(String[] args){
    
    ArrayList<Apple> appleList = new ArrayList<>();

    for(int i=0;i<5;i++){
     Apple apple = new Apple();
     appleList.add(apple);
	    }

    for(int i=0;i<5;i++){
     appleList.get(i).displayInfo();
	    }


	 }

	}





