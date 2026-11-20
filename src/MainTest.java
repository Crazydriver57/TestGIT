public class MainTest {

    public static void main(String[] args) {
        int result = Main.computeAdd(2, 3);

        if (result != 5) {
            throw new AssertionError(
                    "Test mislukt: verwacht 5, maar kreeg " + result
            );
        }

        System.out.println("computeAdd-test geslaagd.");
    }
}