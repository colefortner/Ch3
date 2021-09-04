package loops;

public class ForEachLoop {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3, 4, 5, 5, 6};

        for (int i : nums) {
            System.out.println(i);
        }

        String msg = "Hello, World";

        for (char c: msg.toCharArray()) {
            System.out.println(c);
        }
    }
}

