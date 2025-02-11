


public class Search{

 
 public static int search(int[] arr, int n, int x, int i){
    
    // base case 

    if(i == n)
     return -1;

    else if(arr[i] == x)
     return i;

    else
      return search(arr, n, x, i-1);	    



	 }

 public static void main(String [] args){

   int [] arr = {1,3,4,5,6,7,8,10};

   search(arr,arr.length,8,0);





	 }

	}
