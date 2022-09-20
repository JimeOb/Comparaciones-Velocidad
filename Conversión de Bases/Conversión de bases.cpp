#include "iostream"
using namespace std;


string toBinary(int n)
{
    string r;
    if (n==0){
    	r='0';
	}
    while (n != 0){
        r += ( n % 2 == 0 ? "0" : "1" );
        n /= 2;
    }
    return r;
}

int main() {
    int number;
	
	cout<< "Ingresa en numero a convertir: " <<endl;
	cin >> number;
	
    cout << "NUMERO DECIMAL: " << number << endl;
    cout << "NUMERO BINARIO : " << toBinary(number) << endl;

    return 0;
}
