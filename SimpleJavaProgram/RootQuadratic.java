class RootQuadratic {
    public static void main(String[] args) {
        // root1 = (-b + √(b2-4ac)) / (2a)
        // root1 = (-b - √(b2-4ac)) / (2a)
        // ax2 + bx + c = 0

        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            // The format() function can also be replaced by printf() as:
        }

        else if (determinant == 0) {

            root1 = root2 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f;", root1);
        }

        else {

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}