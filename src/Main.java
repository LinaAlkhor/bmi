public class Main {
    public static void main(String[] args) {
        BMIservice service = new BMIservice();
        int bodyMassIndex = service.calculate(78, 1.98);
        System.out.println(bodyMassIndex);
    }
}