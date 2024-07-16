package String;

import java.util.HashMap;
import java.util.Map;

public class Maxoccurance2 {
    public static void main(String[] args) {
        String s = "this is demossssss abc xyz";
        s=s.replaceAll("\\s", "");

        HashMap<Character, Integer> hm = new HashMap<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);

            } else {
                hm.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character,Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount=me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println(maxChar);


//         String   num = "6777133339";
//       char maxchar = '\0'; 
// HashMap <Character,Integer> hm=new HashMap<>();
// for (int i = 0; i < num.length(); i++) {
//     hm.put(num.charAt(i),hm.getOrDefault(num.charAt(i), 0)+1);
//     if(hm.getOrDefault(num.charAt(i), 0)>1 && num.charAt(i)>maxchar){
//         maxchar=num.charAt(i);
//     }
// }

// System.out.println(String.valueOf(maxchar).repeat(3));
    }
}
