#include <iostream>
using namespace std;

 void toh(char s, char d, char a, int n){
   
   if(n == 0)
    return;
   
   toh(s,a,d,n-1);
   cout << "move " << n << " disk from " << s << " to " << d << endl;
   toh(a,d,s,n-1);
   }



int main(){
  
  toh('s', 'd', 'a', 4);


	}
