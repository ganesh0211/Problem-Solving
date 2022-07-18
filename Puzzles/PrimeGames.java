package Puzzles;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeGames{
  
    public static void main(String[] args) {
      System.out.println(getPrime(50000,1));
      //System.out.println(makeReadable(359999));
    }
  
    public static boolean isPrime(int x){
      return IntStream.rangeClosed(2,(int)(Math.sqrt(x))).allMatch((i)-> x%i!=0);
    }
  
    public static boolean containsPrime(int x){
      while(x > 0){
        int n = x%10;
        if(n != 1 && isPrime(n)) return true;
        x /= 10;
      }
      return false;
    }
  
    public static String getNonPrime(int no,int index){
      String finalString="";
      
      List<?> data = IntStream.range(1,no).filter(x-> x==1 || !isPrime(x)).filter(x-> !containsPrime(x)).mapToObj(Integer::toString)
    .collect(Collectors.toList());
      System.out.println(data);
      return String.valueOf(data.get(index));
    }
  
   public static String getPrime(int no,int index){
      String finalString="";
      List<?> data = IntStream.range(1,no).filter(x-> isPrime(x)).filter( x-> !containsPrime(x)).mapToObj(Integer::toString)
    .collect(Collectors.toList());
      return String.valueOf(data.get(index));
    }
  
}
