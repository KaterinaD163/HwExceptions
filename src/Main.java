

public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("yuit", "7899", "5670");
        if (success) {
            System.out.println("Данные верны");
        } else {
            System.out.println("Данные неверны");
        }
    }
}









