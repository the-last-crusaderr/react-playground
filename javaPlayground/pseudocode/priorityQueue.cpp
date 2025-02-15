#include <iostream>
using namespace std;



/* implmentation of Priority Queue
   There is priority associated with every elements 
   The elements are retrieved only based on priority
   The element is inserted on appropriate postion bases on priority

 enque()
 deque()
 peek()


1. storing complete binary tree in array

-- children

0, 1, 2
1, 3, 4
2, 5, 6
3, 7, 8

  1st children - 2n+1
  2nd children - 2n+2

-- parents 

if odd = n/2
   even = n/2-1

*/



int pq[1000];    // 0 - 999
int capacity = 1000;
int size = 0;


void enque(int val){

 if(size == capacity){
   cout << "Capacity is full" << endl;
   return;
}
	 
  pq[size+1] = val;
  int childLoc = size+1;
  int parentLoc = ;
  size += 1;

// putting the element on the right place

   while(parentLoc > 0){
     if(pq[parentLoc] > 



	   }


	}







int main(){





	}
