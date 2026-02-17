#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int n){
    if(n < 2) return false;   
    
    for(int i = 2; i <= sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}

int main(){
    int m,n;
    cin >> m >> n;

    int count = 0;
    double sum = 0;

    for(int i = m; i <= n; i++){
        if(isPrime(i)){
            count++;
            sum += i;
        }
    }

    if(count > 0){
        cout << count << endl;
        cout << sum / count;
    }else{
        cout << "NO";
    }

    return 0;
}

