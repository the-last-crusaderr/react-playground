#include <iostream>
using namespace std;

 int toh(char s, char d, char a, int n){
   
   if(n <=  0)
    return 0;
   
   int first = toh(s,a,d,n-1);
   cout << "move " << n << " disk from " << s << " to " << d << endl;
   int second = toh(a,d,s,n-1);

   return first + second + 1;
   }



int main(){
  
  cout << toh('s', 'd', 'a', 5) << endl;


	}
