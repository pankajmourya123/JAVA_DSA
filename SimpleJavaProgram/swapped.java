public class swapped {
    public static void main(String[] args) {
         int x = 5;
    int y = 10;
    swap(x, y); // Passing values of x and y (not the variables themselves)
    System.out.println("x: " + x + ", y: " + y);
}

static void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}
        
    }

