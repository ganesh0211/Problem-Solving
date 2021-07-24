/***
* Author: Ganesh
****/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {
        
    public static void main(String[] args) {
      //int [] input = {1,104 ,4,5,97,10};
      int [] input = {10, 3, 4, 6};
      System.out.println(maximumSumIncreasingSubsequence(input));
    }
    
    private static int maximumSumIncreasingSubsequence(int[] a){
      int [] sum = new int[a.length];
      int max = 0;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<=i;j++){
          if(a[i] >= a[j]){
            sum[i] += a[j];
            max = max < sum[i]? sum[i]: max;
          }
        }   
        if(max > sum[i]){
          sum[i] = max;
        }
      }      
      return sum[a.length-1];  
    }

}
