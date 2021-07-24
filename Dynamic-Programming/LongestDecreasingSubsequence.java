/***
* Author: Ganesh
****/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;

public class LongestDecreasingSubsequence {
        
    public static void main(String[] args) {
      int [] input = { 2,3};
      System.out.println(longestDecreasingSubsequence(input));
    }
    
    private static int longestDecreasingSubsequence(int[] a){
      int [] lis = new int[a.length];
      for(int i=0;i<a.length;i++){
        for(int j=0;j<i;j++){
          if(a[i] < a[j]){
              lis[i] = lis[j] >= lis[i] ? 1 + lis[j]: lis[i];     
          }else{
              lis[i] = lis[j];
          }
          
        }   
      }      
      return lis[a.length-1]+1;  
    }

}
