/******************
*
* Author: Ganesh
*
*******************/
public class PlayPass {
    public static String playPass(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0 ; i < sb.length() ; i++) {
            char c = sb.charAt(i);
            sb.setCharAt(i, i%2 == 1 && Character.isAlphabetic(c) ? (char) ( (c + n - 'A')%26 + 'a') :
                                Character.isAlphabetic(c) ?         (char) ( (c + n - 'A')%26 + 'A') :
                                Character.isDigit(c) ?              (char) ('9' - c + '0') : c);
        }
        return sb.reverse().toString();
    }
}
