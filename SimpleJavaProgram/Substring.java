import javax.xml.stream.events.StartDocument;

public class Substring {
    public static void main(String[] args) {
        String s= "welcometojava";
int k=3;
String largest = s.substring(0, k);
String smallest = s.substring(0, k);

for (int i = 1; i <= s.length() - k; i++) {
    String substring = s.substring(i, i + k);
    if (substring.compareTo(smallest) < 0) {
        smallest = substring;
    }
    if (substring.compareTo(largest) > 0) {
        largest = substring;
    }
   
}
     
       
      
System.out.println(smallest);
System.out.println(largest);
   
        
       
    }
}
