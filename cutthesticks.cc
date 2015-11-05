#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n ;
    cin >> n;
    int stks[n];
    int numstk= n;
    int stk;
    int i=0;
    while(cin >> stk){
        stks[i] = stk;
        i++;
    }
    sort(stks,stks+n);
    i=0;
    int s= numstk;
    cout << s << endl;
    while(numstk > 1){
        int cut = stks[i];
        if(cut > 0){
            for(int j=0;j<n;j++){
                if(stks[j] > 0){
                    stks[j] -= cut;                
                    if(stks[j] == 0) s--;
                }
            }
        if(s > 0) cout << s << endl;
        numstk= s;    
        }
            i++;
    }
    return 0;
}