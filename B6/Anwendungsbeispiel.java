public class Anwendungsbeispiel {
    public static void main(String[] args) {
        Zahlungsmittel geld[] = {new USD_Muenze(0.10), new USD_Schein(20), new SFR_Schein(5),
                new SFR_Muenze(0.50), new USD_Muenze(0.50), new EUR_Schein(50),
                new USD_Schein(100), new USD_Muenze(0.2), new USD_Muenze(0.25),
                new EUR_Muenze(0.01), new SFR_Schein(200), new USD_Schein(100),
                new EUR_Muenze(2), new EUR_Schein(5), new USD_Muenze(0.25),
                new SFR_Muenze(0.10), new SFR_Muenze(0.01), new USD_Muenze(0.50),
                new USD_Schein(100), new USD_Schein(100), new USD_Muenze(0.2),
                new USD_Muenze(0.01), new SFR_Schein(20), new SFR_Muenze(0.50),
                new USD_Muenze(0.50), new EUR_Schein(50), new USD_Schein(5),
                new EUR_Muenze(0.50), new EUR_Muenze(0.01), new SFR_Schein(10),
                new SFR_Schein(20), new SFR_Muenze(0.50), new SFR_Muenze(0.02)};
//      Aufgabe 1
//      for(Zahlungsmittel zahlungsmittel : geld) {
//          System.out.println(zahlungsmittel);
//      }

//      Aufgabe 2
//
        double EUR_total = 0;
        double SFR_total = 0;
        double USD_total = 0;
        for (Zahlungsmittel zahlungsmittel : geld) {
            if (zahlungsmittel.getWaehrung().compareTo("EUR") == 0) {
                EUR_total += zahlungsmittel.getWert();
            } else if (zahlungsmittel.getWaehrung().compareTo("SFR") == 0) {
                SFR_total += zahlungsmittel.getWert();
                //System.out.println(zahlungsmittel.getClass());
            } else {
                USD_total += zahlungsmittel.getWert();
            }
        }
        System.out.println("EUR =" + EUR_total);
        System.out.println("SFR =" + SFR_total);
        System.out.println("USD =" + USD_total);
    }
}
