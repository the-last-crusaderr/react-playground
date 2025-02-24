#include <iostream>
#include <cstring>
using namespace std;


int arr[100];

int fib(int n){
   
   if(arr[n] != -1)
     return arr[n];	   

   if(n==1 || n ==2)
     return 1;

   return arr[n] = fib(n-1) + fib(n-2);  

	}


int main(){
   memset(arr, -1, sizeof(arr));
   cout << fib(10) << endl;

	}
