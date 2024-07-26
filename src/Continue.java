public class Continue {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
