public class PowerFunctionsTest {
    // nloops:= Anzahl Loops, v:= Version (power = 0, fastPower = 1)
    public static void looper(PowerFunctions pf, int nloops, int v) {
        double mid_exp = 0.0;
        double mid_mx_needed = 0.0;

        for (int i = 0; i < nloops; i++) {
            pf.setZahl(Math.random());
            pf.setExponent((int) (Math.random() * 1000) + 1);// 0 bis 1000
            if (v == 0) {
                pf.power(pf.getZahl(), pf.getExponent());
                mid_mx_needed += pf.getCountPower();
            } else {
                pf.fastPower(pf.getZahl(), pf.getExponent());
                mid_mx_needed += pf.getCountFastPower();
            }
            pf.resetCounters();
            mid_exp += pf.getExponent();
        }

        System.out.println(mid_exp / nloops);
        System.out.println(mid_mx_needed / (double) nloops);
    }

    public static void main(String[] args) {
        PowerFunctions pf = new PowerFunctions(32, 2.0);
//        double result_power = pf.power(pf.getZahl(), pf.getExponent());
//        System.out.println(result_power);
//        System.out.println(pf.getCountPower());
//        double result_fpower = pf.fastPower(pf.getZahl(), pf.getExponent());
//        System.out.println(result_fpower);
//        System.out.println(pf.getCountFastPower());
        int nloops = 10000;
        System.out.println("power");
        looper(pf, nloops, 0);
        System.out.println("fast power");
        looper(pf, nloops, 1);
    }
}