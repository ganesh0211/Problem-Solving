import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;

public class Solution {
        
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String string1 = scan.next();
       String string2 = scan.next();
      
       System.out.println(longestSubSequence(string1,string2));
       
    }
    
    private static int longestSubSequence(String string1,String string2){
      
        int [][] lss = new int[string1.length()+1][string2.length()+1];
            
        for(int i =0;i<=string1.length();i++){
            for(int j=0;j<=string2.length();j++){
                if(i==0 || j==0){
                  lss[i][j] = 0;
                }
                else if(string1.charAt(i-1) == string2.charAt(j-1)){
                    lss[i][j] = 1 + lss[i-1][j-1];
                }else{
                    lss[i][j] = lss[i-1][j] > lss[i][j-1] ? lss[i-1][j]:lss[i][j-1];
                }
            }
        }
            
        return lss[string1.length()][string2.length()] ; 
    }

}
