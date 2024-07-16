package String;

public class Maxword {
    public static void main(String[] args) {
        String str = "GeeksforGeeks A to computer to science to portal for geeks ";
        String str2=" ";
 
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i].equals(a[j])){
                    str2=a[j];
                }
            }
            
        }
        System.out.println(str2);
        
    }
}
