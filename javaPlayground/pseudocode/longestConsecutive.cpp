#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;


int longestConsecutive(vector<int> nums){

 unordered_set<int> store(nums.begin(),nums.end());

 int current = 0; 
 int streak = 0;
 int res = 0;


 for(int num:nums){
   // let current be starting point
   current = num;
   streak = 0;
   while( store.find(current) != store.end()){
       current ++;
       streak ++;
	   }

    res = max(res, streak);	   


	 }
 return res;
	}


int main(){
   
   vector<int> nums = {2,20,4,10,3,4,5};
   cout << longestConsecutive(nums); 


	}





