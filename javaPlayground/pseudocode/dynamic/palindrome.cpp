#include <iostream>
#include <string>
using namespace std;

bool palindrome(string s, int left, int right){

  if(left >= right)
   return 1;

  if(s[left] != s[right])
   return 0;	  

  return palindrome(s,left+1,right-1); 

	}

int main(){

 string s = "atefegta";
 cout << palindrome(s,0,s.size()-1);

 return 0;

	}
