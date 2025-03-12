#include <iostream>
#include <string>
#include <vector>
#include <climits>
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

void subsetGen(vector<int>& arr,int index, vector<int>& subset,vector<vector<int>> &res){
    
    if(index == arr.size()){
     res.push_back(subset);
     return;
    }    
    
    
    // include 
    subset.push_back(arr[index]);
    subsetGen(arr,index+1,subset,res);
    
    subset.pop_back();
    
    // exclude 
    subsetGen(arr,index+1,subset,res);
    
}




int mcm(vector<int>& arr, int i, int j){
    
    if(i+1 == j)
     return 0;
     
    int res = INT_MAX;
    
    for(int k = i+1;k<j;k++){
        
        int curr = mcm(arr,i,k) + mcm(arr,k,j) + arr[k] * arr[j] * arr[i];
        res = min(curr, res);
    }
    
    
    return res;
    
    
    
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
    
    cout << endl << endl;
    
    vector<int> v{1,2,3};
    vector<int> subset;
    vector<vector<int>> res;
    
    subsetGen(v,0,subset,res);    
    
    for(auto s:res){
        for(auto k: s)
         cout << k ;
        cout << endl; 
    }
     
     
    // mcm check
    
    vector<int> mult = {1, 2, 3, 4, 3};
    cout << mcm(mult,0,mult.size()-1) << endl;
    
        
    

    return 0;
}
