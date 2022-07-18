/********
* Author:Ganesh
********/
import java.util.stream.*;
import java.util.*;
import java.util.Arrays;

public class Fibonacci {
    public static long [] table;
        
    public static void main(String[] args) {
        int n=100;
        table = new long[n+1];
        for(int i =0;i<n+1;i++){
          table[i] = -1;
        }
        System.out.println(Fibonacci.fib(n));
        //Arrays.stream(table).forEach(System.out::println);
    }
    public static long fib(int n){
        if(table[n] < 0){
          if(n <= 1) table[n] = n;
          else table[n] = Fibonacci.fib(n-1)+Fibonacci.fib(n-2);
        }
        return table[n];
        
    }
}
