#include<iostream>
using namespace std;
int main()
{
 int a,b,c,x,y,z;
  std::cin>>a>>b>>c;
  x=b*75;
  y=c*30;
  z=x+y;
  if(z<=a)
  std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}