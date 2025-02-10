import java.util.*;


public class InsertionSort{


public static int binarySearch(int arr[], int low, int high, int element){
   int mid;
   while(low < high){
      mid = (low + high)/2;
      if( arr[mid] > element)
         high = mid;
      else
	 low = mid +1;
}
    return low;	 

}
 


public static void insertionBinarySort(int[] arr){
    for(int j=1;j<arr.length;j++){
      int i = 0;
      // finding the insertion place withbinarysearch
      i = binarySearch(arr,0,j,arr[j]);
      /*
      while(arr[i] > arr[j])
	 i = i + 1;
      */
     

      int m = arr[j];
      for(int k = j-1;k>=i;k--){
        arr[k+1] = arr[k];
      }
      arr[i] = m;
	    }
      
      for(int i: arr)
    System.out.print(i+" ");
	    
	}


















 public static void insertionSort(int[] arr){
  
  for(int j=1;j<arr.length;j++){
     int i = 0;
     while(arr[j] > arr[i])
	i = i+1;
     int m = arr[j];
     for(int k = j-1;k>=i;k--)
        arr[k+1] = arr[k];
     arr[i] = m;	
	  }

   for(int i: arr)
    System.out.print(i+" ");	   
	 }


 public static void main(String[] args){
  int [] arr = {5,3,8,1,4,7,10};
  insertionBinarySort(arr);
	 }
	}



