#include <iostream>
#include <string>
using namespace std;



vector<int> computeLcs(strign s){
 
 int n = s.size();
 vector<int> lps(n,0);
  int index = 1;
  int len = 0;

  while(index < n){
    if(s[index] == s[len]){  // match
      len++;
      lps[index++] = len;
	    }
    else{     // mismatch
      if(len != 0)
	 len = lps[len-1];
      else{
	  lps[index] = 0;
       index++;
      }
	    }	     
	  }

  return lps;

	}













void reverse(string &s,int left,int right){
    
    if(left >= right)
     return;

    int temp = s[left];
    s[left] = s[right];
    s[right] = temp;

    reverse(s,left+1,right-1);

	}



bool palindrome(string s, int left, int right){

  if(left >= right)
   return 1;

  if(s[left] != s[right])
   return 0;	  

  return palindrome(s,left+1,right-1); 

	}

int main(){

 string s = "universe";
 cout << palindrome(s,0,s.size()-1) << endl;
 reverse(s,0,s.size()-1);
 cout << s <<  endl; 
 return 0;

	}
