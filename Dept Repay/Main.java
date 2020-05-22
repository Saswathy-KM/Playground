#include<iostream>
using namespace std;
int main()
{
  int amount,rate,year;
  double intr,amt,dis,finamt;
  std::cin>>amount>>rate>>year;
  intr=(amount*rate*year)/100;
  amt=amount+intr;
  dis= intr*2/100;
  finamt=amount+intr-dis;
  cout<<intr<<'\n';
cout<<amt<<'\n';
cout<<dis<<'\n';
cout<<finamt<<'\n';  
}