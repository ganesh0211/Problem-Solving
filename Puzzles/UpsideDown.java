/***********************
*
* Author: Ganesh
*
************************/
public class UpsideDown {

    public static java.util.Map<Integer,Integer> upsideDownChars = new java.util.HashMap();
    static{
      upsideDownChars.put(1,1);
      upsideDownChars.put(8,8);
      upsideDownChars.put(6,9);
      upsideDownChars.put(9,6);
      upsideDownChars.put(0,0);
    }
    public long solve(int x, int y) {      
         return java.util.stream.IntStream.range(x,y).filter(n->isUpsideDownChar(n)).count();
    }
    public boolean isUpsideDownChar(int in){
      String upsideDownNo = "";
      int n = in;
      while(n>0){
        int x = n%10;
        if(!upsideDownChars.containsKey(x)) return false;
        else{
          upsideDownNo = upsideDownNo + upsideDownChars.get(x);
        }
        n /= 10;
      }
      if(upsideDownNo.isEmpty()) upsideDownNo = "0";
      return Integer.parseInt(upsideDownNo) == in;
    }
    
    public static void main(String[] args){
      UpsideDown sol = new UpsideDown();assertEquals(3, sol.solve(0,10));
        assertEquals(4, sol.solve(10,100));
        assertEquals(12, sol.solve(100,1000));
        assertEquals(20, sol.solve(1000,10000));
        assertEquals(6, sol.solve(10000,15000));
        assertEquals(9, sol.solve(15000,20000));
        assertEquals(15, sol.solve(60000,70000));
        assertEquals(55, sol.solve(60000,130000));
      
    }
}
