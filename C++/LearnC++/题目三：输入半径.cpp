//输入圆的半径和圆柱的高，依次输出圆周长、圆面积、圆球表面积、圆柱体积（以空格分隔，π取）。 
#include <iostream>
#include <cmath>
using namespace std;
int main(){
	double r = 0,h = 0;
	const double pi = acos(-1);
	cout << "请输入球的半径";
	cin >> r ;
	cout << "请输入球的高";
	cin >> h ;
	cout << "圆的周长是" << 2 * pi * r <<endl;
	cout << "圆的面积是" << pi * r * r <<endl;
	cout << "圆球表面积是" << 4 * pi * r * r <<endl;
	cout << "圆柱体积是" << h * pi * r * r <<endl;
	return 0;
} 
