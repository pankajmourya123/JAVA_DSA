package arraysProgram;

public class DeleteElemment {
    public static void main(String[] args) {
        int[] a = { 10, 40, 30, 80,  60, 20 };
        int DelEle = 30;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (DelEle == a[i]) {
                for (int j = i; j < a.length-1 ; j++) {
                    a[j] = a[j + 1];
                  
                    count = count + 1;
                 
                }
                break;
            }
        }
        if (count==0) {
            System.out.print("Not Found");
        } else {
            for (int i = 0; i < a.length-1; i++) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
