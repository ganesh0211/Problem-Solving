/***
* Author: Ganesh
****/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
        
    public static void main(String[] args) {
      int [] input = {3, 10, 2, 1, 20};
      System.out.println(longest_increasing_subsequence(input));
    }
    
    private static int longest_increasing_subsequence(int[] a){
      int [] lis = new int[a.length];
      int [] prev = new int[a.length];
      for(int i=0;i<a.length;i++){
        for(int j=0;j<i;j++){
          if(a[i] > a[j]){
              lis[i] = lis[j] >= lis[i] ? 1 + lis[j]: lis[i];     
          }
          
        }   
      }      
      return lis[a.length-1]+1;  
    }

}
