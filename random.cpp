/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>
#include <vector>
using namespace std;


void printRow(int index, int &num){
    
    if(index == 0)
     return;
     
    cout << char(num+65-1) << " ";
    num = num+1;
    return printRow(index-1,num);
    
}

void printPattern(int row,int index,int num){
    
    if(index > row)
     return;
     
    printRow(index,num); 
    cout << endl;
    printPattern(row, index+1,num);
    
    
}


int longestPalindrome(int i, int j, string s){
    
    if(i>j)
     return 0;
    
    if(i == j){
     return 1;
}
     
    if(s[i] == s[j])
     return 2 + longestPalindrome(i+1,j-1,s);
    else
     return max(longestPalindrome(i+1,j,s),longestPalindrome(i,j-1,s));
    
    
    
}

void permutation(string& s, int index, vector<string>& v){
    if(index == s.size()){
        v.push_back(s);
        return;
    }
    
    for(int i=index;i<s.size();i++){
        swap(s[index],s[i]);
        permutation(s,index+1,v);
        swap(s[index],s[i]);
    }
    
    
}



int main()
{
    string s = "abcd";
   printPattern(5,1,1);
   cout << longestPalindrome(0,s.size()-1,s) << endl;
   
   vector<string> ans;
   
   permutation(s,0,ans);
   
   
   for(auto s:ans)
    cout << s << endl;

    return 0;
}
