public class ProstyPortalGra {
    public static void main(String[] args) {
        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal gra = new ProstyPortal();
        int liczbaLosowa = (int) (Math.random() * 5);

        int[] polozenie = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
        gra.setPolaPolozenia(polozenie);
        boolean czyIstnieje = true;

        while (czyIstnieje == true) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę");
            String wynik = gra.sprawdz(pole);
            iloscRuchow++;

            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(iloscRuchow + " ruchow");
            }
        }

    }
}

