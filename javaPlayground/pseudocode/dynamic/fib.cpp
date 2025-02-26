#include <iostream>
#include <cstring>
using namespace std;


int arr[100];
int countFun;
int countRaw;

int fib(int n){
   
   countFun ++;
   if(arr[n] != -1)
     return arr[n];	   

   if(n==1 || n ==2)
     return arr[n] = 1;

   return arr[n] = fib(n-1) + fib(n-2);  

	}

int fibRaw(int n){
  countRaw++;
  if( n==1 || n==2)
    return 1;

  return fibRaw(n-1) + fibRaw(n-2);  
	}




int main(){
   memset(arr, -1, sizeof(arr));
    cout << fib(20) << endl;
   cout << fibRaw(20) << endl;
   cout << "fib is called " << countFun << " times with memoisation." << endl;
   cout << "fib is called " << countRaw << " times without memoisation." << endl;

}
