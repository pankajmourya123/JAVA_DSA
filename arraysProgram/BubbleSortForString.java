package arraysProgram;

public class BubbleSortForString {
    public static void main(String[] args) {
        String[] name = { "SHIVAM", "SARTHAK", "AYUSH", "SWARAJ", "VIVEK", "RITIK" };
        String temp;
        for (int i = 0; i < name.length; i++) {
            int flag = 0;
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                    flag = 1;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+" ");
        }
    }
}
