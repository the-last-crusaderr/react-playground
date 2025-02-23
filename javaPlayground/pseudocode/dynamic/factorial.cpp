#include <iostream>
using namespace std;


int factorial(unsigned int n,bool b){

   if(n == 0 || n == 1)
     return 1;
     
   if(b){
   return (n*n) * factorial((n*n)-1,false);  
  }
  else{

   return n * factorial(n-1,false);
	  }

  

}


int iterativeFac(unsigned int n){
         
     int res = 1;
     for(int i=1;i<=n*n;i++)
        res *= i;
	
     return res;
}



int main(){

   cout << factorial(4,true) << endl;
   cout << iterativeFac(4) << endl;

	}
