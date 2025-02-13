#include <vector>
#include <iostream>
using namespace std;

// program to stablise the relationship in a society
int main(){

 int n = 3;


vector<vector<int>> menPref = {
    {1, 0, 2},  // M0 prefers W1 > W0 > W2
    {0, 2, 1},  // M1 prefers W0 > W2 > W1
    {2, 1, 0}   // M2 prefers W2 > W1 > W0
};

vector<vector<int>> womenPref = {
    {2, 0, 1},  // W0 prefers M2 > M0 > M1
    {1, 0, 2},  // W1 prefers M1 > M0 > M2
    {0, 2, 1}   // W2 prefers M0 > M2 > M1
};






/* men pref
 vector<vector<int> > menPref = {
        {0, 1, 2},  // man 0
        {1, 2, 0},  // man 1
        {2, 0, 1}   // man 2
    };

    // Women's preference lists: each inner vector represents a woman's preferences.
    // For example, woman 0 prefers man 1 first, then 0, then 2.
    vector<vector<int> > womenPref = {
        {1, 0, 2},  // woman 0
        {0, 2, 1},  // woman 1
        {2, 1, 0}   // woman 2
    };

*/
    vector<int> menPartner(n,-1);
    vector<int> womenPartner(n,-1);
    vector<int> nextProposal(n,0);
    int free = n;
    

    while(free != 0){
        int m; // finding a free man
    	for(m=0;m<n;m++){
            if(menPartner[m] == -1)		    
              break;
		}


    // propose to first in the list
    int women = menPref[m][nextProposal[m]];
    nextProposal[m] += 1;   // so that next time it won't propose the same girl


  // if women is free, she will accept the proposal

  if(womenPartner[women] == -1){
    menPartner[m] = women;
    womenPartner[women] = m;
    free -= 1;
	  }
  else{
    // she will match with current partner
    int currentMan = womenPartner[women];
    if(womenPref[women][m] < womenPref[women][currentMan]){
        // w dumps currentMen and engaged with m
	menPartner[currentMan] = -1;
	womenPartner[women] = m;
	menPartner[m] = women;
	    }

	  }



	    }

cout << "Stable Matching (Man -> Woman):" << endl;
    for (int m = 0; m < n; m++) {
        cout << "Man " << m << " is matched with Woman " << menPartner[m] << endl;
    }


return 0;

	}

