package String;

/***********************
*
* Author: Ganesh
*
***********************/

public class CombinationAndPermutation{

private static void allStringCombinationSameSize(String str,String ss){
        if(str.length() == 0){
          System.out.println(ss);
          return;
        }
        boolean cused[] = new boolean[26];
        for(int i=0;i<str.length();i++){
          char c = str.charAt(i);
          String otherContent = str.substring(0,i)+str.substring(i+1);
          if(cused[c-'a'] == false){
              allStringCombinationSameSize(otherContent,ss+c);
            cused[c-'a']=true;
          }
          
        }
    }
    }
