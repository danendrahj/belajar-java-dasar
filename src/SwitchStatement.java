public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch(nilai){
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Lamda
        switch (nilai){
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Switch Tanpa Yield
        var nilaix = "A";
        String ucapan;

        switch (nilaix) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }

        System.out.println(ucapan);

        ucapan = switch (nilaix){
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
