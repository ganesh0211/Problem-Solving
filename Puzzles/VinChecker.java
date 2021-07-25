import java.util.*;
import java.util.stream.*;
class VinChecker {
  static int [] weights =  {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
  public static java.util.Map<Character,Integer> dict = new java.util.HashMap<Character,Integer>();
  static{
    
    dict.put('A',1);
    dict.put('B',2);
    dict.put('C',3);
    dict.put('D',4);
    dict.put('E',5);
    dict.put('F',6);
    dict.put('G',7);
    
    dict.put('H',8);
    dict.put('J',1);
    dict.put('K',2);
    dict.put('L',3);
    dict.put('M',4);
    dict.put('N',5);
    dict.put('P',7);
    dict.put('R',9);
    dict.put('S',2);
    dict.put('T',3);
    dict.put('U',4);
    dict.put('V',5);
    dict.put('W',6);
    dict.put('X',7);
    dict.put('Y',8);
    dict.put('Z',9);dict.put('0',0);dict.put('1',1);
    dict.put('2',2);
    dict.put('3',3);
    dict.put('4',4);
    dict.put('5',5);
    dict.put('6',6);
    dict.put('7',7);
    dict.put('9',9);
    dict.put('8',8);
    
    
    
    
  }
  public static boolean checkVin(String vin) {
    char[] charVins = vin.toCharArray();
    if(vin.length() !=17) return false;
    int sum=0;
    for(int i=0;i<charVins.length;i++){
        try{
          sum += (dict.get(charVins[i]) * weights[i]);
        }catch(Exception e){
          e.printStackTrace();
          return false;
        }
    }
    int vIn = sum % 11;
    vIn = (vIn == 10) ? dict.get('X') : vIn;
    if(dict.get(charVins[8]) == vIn){
        return true;
    }
    return false;
  }
}
