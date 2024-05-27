public class PowerFunctionsTest {
    // nloops:= Anzahl Loops, v:= Version (power = 0, fastPower = 1)
    public static void looper(PowerFunctions powerFunctions, int nloops, int v) {
        double mid_exp = 0.0;
        double mid_mx_needed = 0.0;

        for (int i = 0; i < nloops; i++) {
            powerFunctions.setZahl(Math.random());
            powerFunctions.setExponent((int) (Math.random() * 1000) + 1);// 0 bis 1000
            if (v == 0) {
                powerFunctions.power(powerFunctions.getZahl(), powerFunctions.getExponent());
            } else {
                powerFunctions.fastPower(powerFunctions.getZahl(), powerFunctions.getExponent());
            }
            mid_mx_needed += powerFunctions.getCountPower();
            powerFunctions.resetCounters();
            mid_exp += powerFunctions.getExponent();
        }

        System.out.println(mid_exp / nloops);
        System.out.println(mid_mx_needed / nloops);
    }

    public static void main(String[] args) {
        PowerFunctions pf = new PowerFunctions(32, 2.0);
//
//        double result_power = pf.power(pf.getZahl(), pf.getExponent());
//        System.out.println(result_power);
//        System.out.println(pf.getCountPower());
//
//        double result_fpower = pf.fastPower(pf.getZahl(), pf.getExponent());
//        System.out.println(result_fpower);
//        System.out.println(pf.getCountFastPower());
        PowerFunctions pf1 = new PowerFunctions();
        int nloops = 10000;
        System.out.println("power");
        looper(pf, nloops, 0);
        System.out.println("fast power");
        looper(pf, nloops, 1);
        // 10000 loops power
//        double random_x = Math.random();
//        int random_n = (int) (Math.random() * 1000 + 1); // 0 bis 1000
    }
}