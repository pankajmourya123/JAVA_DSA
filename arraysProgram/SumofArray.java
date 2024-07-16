package arraysProgram;

public class SumofArray {
    public static void main(String[] args) {
        int []num={1,2,1};
        int leng=num.length+num.length;
        int []full=new int [leng];
        for (int i = 0; i < num.length; i++) {
        full[i]+=num[i];
        }
        for (int i = 0; i < num.length; i++) {
        full[num.length+i]+=num[i];
        }
        for (int i = 0; i < full.length; i++) {
        System.out.print(full[i]+" ");
    }
}}
