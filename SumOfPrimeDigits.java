public class SumOfPrimeDigits {
    public static void main(String[] args) {
//         Input: sentence="This is alpha 5057 and 97"
// Output: 5057

String sentence="This is alpha 5057 and 97 77";
String [] str=sentence.split(" ");

long res=-1;
for (String s : str) {
   if(isInteger(s)){
  
    long num=Long.valueOf(s);
    for (int i = 0; i < s.length(); i++) {
        if(!s.contains("9")){
         res=Math.max(num, res);
         
        }
    }
   }
}
System.out.println(res);
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}