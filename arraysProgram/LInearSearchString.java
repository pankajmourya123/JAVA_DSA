package arraysProgram;

public class LInearSearchString {
    public static void main(String[] args) {
        String[] arr =  { "SHIVAM", "SARTHAK", "AYUSH", "SWARAJ", "VIVEK", "RITIK","pankaj"};
        int temp = 0;
        String item = "pankaj";
        for (int i = 0; i <arr.length; i++) {
            if (item .equals( arr[i])) {
                System.out.println(item + " is found at index " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.print(item + " is not found ");
        }
    }
}
