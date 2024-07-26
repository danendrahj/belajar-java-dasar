public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        /* Number Overflow */
        // int iniInt = 1000;
        byte iniByte2 = (byte) iniInt;
    }
}
