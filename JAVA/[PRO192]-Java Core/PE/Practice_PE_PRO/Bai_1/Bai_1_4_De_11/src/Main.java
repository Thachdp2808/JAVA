// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.StringTokenizer;
class Main
{
   public static int f1(String s){
        int cnt = -1;
        /*an
        * YOUR CODE WILL BE PLACED AFTER THIS COMMENT
        */
        StringTokenizer st = new StringTokenizer(s);
        cnt = 0;
        while(st.hasMoreTokens()){
            String s1 = st.nextToken();
            for(char c: s1.toCharArray())
            if("AEIOU".contains((""+c).toUpperCase())){
                cnt++;
                break;
            }
        }
        return cnt;
   }
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String s = "";
       System.out.print("Enter a string s: ");
       s = in.readLine();
       System.out.println("OUTPUT:");
       System.out.println(f1(s));
   }
 }
