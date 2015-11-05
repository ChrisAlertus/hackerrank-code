#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin >> n;
    int ct =0;
    char arr[n*n];
    char pt[n*n];
    std::string cell;
    while(getline(cin,cell)){
        for(int i=0;i< cell.length();i++){
            arr[ct]= cell[i];
            //cout << arr[ct];
            ct++;
        }
    }
    for(int i=0;i < n*n;i++){
        if(i < n){
            pt[i]= arr[i];
        }
        else if(i > n*n - n){
            pt[i]= arr[i];
        }
        else if(i % n == 0){
            pt[i] = arr[i];
        }
        else if(i % n == n-1){
            pt[i] = arr[i];
        }
        else if(arr[i-1] == 'X' || arr[i+1] == 'X' || arr[i+n] == 'X' || arr[i-n] == 'X'){
            pt[i] = 'X';
        }
        else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]&& arr[i] > arr[i+n] && arr[i] > arr[i-n]){
            pt[i] = 'X';
        }
        else{
            pt[i] = arr[i];
        }
    }
    for(int i=0;i < n*n;i++){
        if(i % n == 0 && i >= n){
            cout << endl;
            cout << pt[i];   
        }
        else{
            cout << pt[i];   
        }

    }
    return 0;
}