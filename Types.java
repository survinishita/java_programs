public class Types {
    public static void main(String[] args) {
        try {
            Class.forName("Xyz");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked: " + e);
        }
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: " + e);
        }
    }
}

