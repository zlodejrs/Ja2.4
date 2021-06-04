public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        System.out.println(passed);

    /*    long bonusBeLowLimitForRegistered = service.calculate(1000_60, true);
        System.out.println(bonusBeLowLimitForRegistered);

        long bonusOverLimitForRegistered = service.calculate(1_000_000_60, true);
        System.out.println(bonusOverLimitForRegistered);

        long bonusBeLowLimitForUnRegistered = service.calculate(1000_60, false);
        System.out.println(bonusBeLowLimitForUnRegistered);

        long bonusOverLimitForUnRegistered = service.calculate(1_000_000_60,true);
        System.out.println(bonusOverLimitForUnRegistered);*/
    }
}