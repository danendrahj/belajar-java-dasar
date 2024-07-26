public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Danendra", "Hardjo Judanto");
        sayHello("Bambang", "Nugroho");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
