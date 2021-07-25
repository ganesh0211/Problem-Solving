/*********************
* Author: Ganesh
*
*********************/
import java.util.regex.*;

public class ValidParentheses {
  public static void main(String[]args){
    System.out.println(validParentheses("()(())"));
    System.out.println(validParentheses("()()())"));
    System.out.println(validParentheses("())()()(())"));
  }
  public static boolean validParentheses(String parens) {
    try {
      Pattern.compile(parens.replaceAll("[^()]", ""));
      return true;
    } catch (PatternSyntaxException e) {
      return false;
    }
  }
}
