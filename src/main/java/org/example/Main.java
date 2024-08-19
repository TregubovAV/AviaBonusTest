public class Main {
    public static void main(String[] args){
        BonusService service = new BonusService();
        long amount = 500_0;
        boolean isRegistered = true;
        long bonus = service.calculate(amount, isRegistered);

        System.out.println(bonus);
    }
}