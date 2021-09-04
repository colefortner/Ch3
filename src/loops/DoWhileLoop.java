package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        do {
            System.out.println("Hello, World");
        } while (false);

        int i = 0;

        do {
            System.out.println("Hello");
            i++;
        } while (i < 3);
    }
}
