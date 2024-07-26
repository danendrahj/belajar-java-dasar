public class TernaryOperator {
    public static void main(String[] args) {
        // If-Else
        var nilai = 70;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }

        System.out.println(ucapan);

        // Ternary Operator
        var nilaix = 70;
        String kalimat = nilaix >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";
        System.out.println(kalimat);
    }
}
