import java.util.stream.IntStream;

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
        // NOTE: foreach to stream
        int new_length = (int) IntStream.range(0, geld.length).filter(i -> geld[i].wertIstGueltig()).count();
        //        for (int i = 0; i < geld.length; i++) {
//            if (geld[i].wertIstGueltig()) {
//                new_length++;
//            }
//        }
        int ungultig = geld.length - new_length;
        Zahlungsmittel[] valid_array = new Zahlungsmittel[new_length];
        for (int i = 0, j = 0; i < geld.length; i++) {
            if (geld[i].wertIstGueltig()) {
                valid_array[j] = geld[i];
                j++;
                System.out.println(geld[i]);
            }
        }
        System.out.println("Anzahl der ungueltigen Werte " + ungultig);


//      Aufgabe 2
        double EUR_total = 0;
        double SFR_total = 0;
        double USD_total = 0;
        for (Zahlungsmittel zahlungsmittel : valid_array) {
            if (zahlungsmittel.getWaehrung().compareTo("EUR") == 0) {
                EUR_total += zahlungsmittel.getWert();
            } else if (zahlungsmittel.getWaehrung().compareTo("SFR") == 0) {
                SFR_total += zahlungsmittel.getWert();
            } else {
                USD_total += zahlungsmittel.getWert();
            }
        }
        System.out.println("Gesamtwert EUR =" + EUR_total);
        System.out.println("Gesamtwert SFR =" + SFR_total);
        System.out.println("Gesamtwert USD =" + USD_total);

        // Aufgabe 3 Gewicht und Flaeche
        double total_weight = 0;
        double total_area = 0;

        for (Zahlungsmittel zahlungsmittel : valid_array) {
            if (zahlungsmittel.getClass() == SFR_Muenze.class) {
                SFR_Muenze sfrMuenze = (SFR_Muenze) zahlungsmittel;
                total_weight += sfrMuenze.getGewicht();
            } else if (zahlungsmittel.getClass() == EUR_Muenze.class) {
                EUR_Muenze eurMuenze = (EUR_Muenze) zahlungsmittel;
                total_weight += eurMuenze.getGewicht();
            } else if (zahlungsmittel.getClass() == USD_Muenze.class) {
                USD_Muenze usdMuenze = (USD_Muenze) zahlungsmittel;
                total_weight += usdMuenze.getGewicht();
            } else if (zahlungsmittel.getClass() == SFR_Schein.class) {
                SFR_Schein sfrSchein = (SFR_Schein) zahlungsmittel;
                total_area += sfrSchein.getBreite() * sfrSchein.getLaenge();
            } else if (zahlungsmittel.getClass() == EUR_Schein.class) {
                EUR_Schein eurSchein = (EUR_Schein) zahlungsmittel;
                total_area += eurSchein.getBreite() * eurSchein.getLaenge();
            } else if (zahlungsmittel.getClass() == USD_Schein.class) {
                USD_Schein usdSchein = (USD_Schein) zahlungsmittel;
                total_area += usdSchein.getBreite() * usdSchein.getLaenge();
            }
        }
        System.out.println("Gesamtgewicht aller Muenzen ist " + total_weight + " Gramm");
        System.out.println("Gesamtflaeche aller Scheine ist " + total_area + " cm²");

        // Aufgabe 4 Höhe des Stapels
        double total_height = 0;

        for (Zahlungsmittel zahlungsmittel : valid_array) {
            if (zahlungsmittel.getClass() == SFR_Muenze.class) {
                SFR_Muenze sfrMuenze = (SFR_Muenze) zahlungsmittel;
                total_height += sfrMuenze.getDicke();
            } else if (zahlungsmittel.getClass() == EUR_Muenze.class) {
                EUR_Muenze eurMuenze = (EUR_Muenze) zahlungsmittel;
                total_height += eurMuenze.getDicke();
            } else if (zahlungsmittel.getClass() == USD_Muenze.class) {
                USD_Muenze usdMuenze = (USD_Muenze) zahlungsmittel;
                total_height += usdMuenze.getDicke();
            }
        }
        System.out.println("Gesamthöhe aller Muenzen ist " + total_height + " cm ");
        // Aufgabe 5

        System.out.println("Original array:");
        for (Zahlungsmittel zahlungsmittel : valid_array) {
            System.out.println(zahlungsmittel);
        }
        System.out.println("Sortierter array:");
        Sortierung.mergeSort(valid_array);
        for (Zahlungsmittel zahlungsmittel : valid_array) {
            System.out.println(zahlungsmittel);
        }
    }
}
