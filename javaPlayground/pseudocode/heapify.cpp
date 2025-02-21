#include <iostream>
using namespace std;



// heapify from the point i

int arr[100];

void heapify( int n, int i){
 int parent = (i-1)/2;

 if(i> 0 && arr[parent] < arr[i]){
	 cout << "swapping " << i << " " << parent << endl;
    swap(arr[parent],arr[i]);
    heapify(n, parent);
	 }
	}




void heapifyDown(int i, int cap){
 
 int largest = i;
 int left = 2*i+1;
 int right = 2*i+2;


 if(left < cap && arr[left] > arr[largest])
   largest = left;

 if(right < cap && arr[right] > arr[largest])
  largest = right;

 if(largest != i){
  swap(arr[i],arr[largest]);
  heapifyDown(largest, cap);
	 } 

	}


int main(){

  
 // int arr[100];
  for(int i=0;i<10;i++)
    arr[i] = i;
  int cap = 10;


  int n = sizeof(arr)/sizeof(arr[0]);
  int i = cap;
  cap += 1;
  arr[i] = 7;
 // cout << i << " " << arr[i] << endl;
 
  heapify(cap,i);

for(int i = cap/2 - 1; i >= 0; i--)
    heapifyDown(i, cap);
 

  for(int i=0;i<cap;i++)
   cout << arr[i] << " ";	  




	}
