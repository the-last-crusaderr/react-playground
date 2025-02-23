#include <iostream>
using namespace std;


void table(int n, int i){

  if(i > 10)
   return;

   cout << n << " * " << i << " = " << n*i << endl;
   table(n,i+1);
	}





int main(){

for(int i=1;i<101;i++){
    cout << "Table of " << i << endl;
    table(i,1);
    cout << endl;
}




	}
