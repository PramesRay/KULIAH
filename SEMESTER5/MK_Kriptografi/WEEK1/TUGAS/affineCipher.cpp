#include<iostream>
using namespace std;

static int a = 7;
static int b = 2;

string encryption(string m, int a, int b) {
  //Cipher Text initially empty
  string c = "";
  for (int i = 0; i < m.length(); i++) {
    // Avoid space to be encrypted
    if(m[i]!=' ')
        // added 'A' to bring it in range of ASCII alphabet [ 65-90 | A-Z ]
        c = c + (char) ((((a * (m[i]-'A') ) + b) % 26) + 'A');
    else
        //else append space character
        c += m[i];
  }
  return c;
}

string decryption(string c, int a, int b) {
  string m = "";
  int a_inverse = 0;
  int flag = 0;
  //Find a^-1 (the multiplicative inverse of a
  //in the group of integers modulo m.)
  for (int i = 0; i < 26; i++) {
    flag = (a * i) % 26;
    //Check if (a * i) % 26 == 1,
    //then i will be the multiplicative inverse of a
    if (flag == 1) {
        a_inverse = i;
    }
  }
  for (int i = 0; i < c.length(); i++) {
    if(c[i] != ' ')
        // added 'A' to bring it in range of ASCII alphabet [ 65-90 | A-Z ]
        m = m + (char) (((a_inverse * ((c[i]+'A' - b)) % 26)) + 'A');
    else
        //else append space character
        m += c[i];
  }
  return m;
}

int main(void) {
  string input;
  cout << endl << "[ AFFINE CIPHER ]" << endl
       << "Plain Text           : ";
  getline(cin, input);
  string msg = input;
  
  cout << "a : ";
  cin >> a;
  cout << "b : ";
  cin >> b;

  string c = encryption(msg, a, b);
  cout << "Encrypted Message is : " << c <<endl;
  cout << "Decrypted Message is : " << decryption(c, a, b);
  return 0;
}