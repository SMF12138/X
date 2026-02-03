#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double x;
    cin >> x;

    if (x <= -1) {
        cout << 3 * sqrt(abs(x) + 2) + 1;
    } 
    else if (x > -1 && x <= 10) {
        cout << pow(x, 5) + 1;
    } 
    else {
        cout << sqrt((x + 1) / (2 * x * x));
    }

    return 0;
}

