/*
@author : Harshit Verma
*/
import java.io.*;
import java.util.*;

//Read only region start
class UserMainCode
{
  public int sumOfUncommonNumber(int[] input1, int[] input2)
  {
    //Read only region end
    //Write code here....
    Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <input1.length ; i++) {
            int element = input1[i];
            if(map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count+1);
            }else
                map.put(element, 1);
        }
        for (int i = 0; i <input2.length ; i++) {
            int element = input2[i];
            if(map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count+1);
            }else
                map.put(element, 1);
        }
        int sum1 = 0;
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            if(map.get(key)==1)
                sum1 += key;
        }
        int sum = 0;
        while (sum1 > 0 || sum > 9)
        {
            if (sum1 == 0) {
                sum1 = sum;
                sum = 0;
            }
            sum += sum1 % 10;
            sum1 /= 10;
        }
       
        return sum;
