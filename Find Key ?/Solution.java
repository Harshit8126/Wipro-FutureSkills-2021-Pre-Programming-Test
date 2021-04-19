/*
@author : Harshit Verma
*/
import java.io.*;
import java.util.*;
class UserMainCode
{
  public int findKey(int input1, int input2,int input3)
  {
    int largest = 0;
    int smallest =10;
    int thousands = 0;
    int hundrad = 0;
    int digit = 0;
    thousand = input1/1000;
    hundread = (input2/100)%10;
    while(input3>0)
    {
      digit = input3%10;
      if(digit>largest)
      {
        largest = digit;
      }
      if(digit < smallest)
      {
        smallest = digit;
      }
      else if(digit == 0)
      {
        smallest = 0;
      }
      input3/=10;
    }
    int key = (thousand * hundread) + smallest;
    return key;
  }
}
