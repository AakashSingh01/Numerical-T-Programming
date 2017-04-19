#include <iostream>
#include <string>
using namespace std;

int main(){
int i,j=0,k=0,l=0;
string input,in[20];

getline(cin, input);
cout<<input;
for(i=0;i<100;i++){
if(input[i]==';'){j=i;in[l] = input.substr (k,j-k);l++;k=i+1;}
}
for(i=0;i<l;i++){cout<<in[i]<<endl;}

}


