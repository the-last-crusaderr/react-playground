import java.util.*;




public class IteratorGeneral{

   public static void main(String[] args){
     Collection<Integer> num = Arrays.asList(1,2,3,4,5,6,7);
     Iterator<Integer> it = num.iterator();

     while(it.hasNext()){
	System.out.println(it.next());
        it.remove();      
	     }
       System.out.println(num);

	   }

	}



