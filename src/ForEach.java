public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Eko", "Kurniawan", "Khannedy",
                "Danendra", "Hardjo", "Judanto"
        };

        for (var i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("FOR EACH");

        for (var name: array){
            System.out.println(name);
        }
    }
}
