public class PowerFunctionsTest {
    public static void main(String[] args) {
        PowerFunctions pf = new PowerFunctions(4, 2.0);
        double result_power = pf.power(pf.getZahl(), pf.getExponent());
        System.out.println(result_power);
        System.out.println(pf.getCountPower().get());
        System.out.println(PowerFunctions.fastPower(pf.getZahl(), pf.getExponent()));
    }
}