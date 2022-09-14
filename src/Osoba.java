public class Osoba  {
    private String imie;
    private int id;
    static int ilosc = 0;

    public Osoba(String imie, int id) {
        this.imie = imie;
        this.id = id;
        ilosc++;
    }

    public Osoba() {
        this.imie = "";
        this.id = 0;
        this.ilosc++;
    }

    public Osoba(Osoba os) {
        this.imie = os.imie;
        this.id = os.id;
        ilosc++;
    }

    public void metoda(String name) {
        if(imie != "") {
            System.out.println("Cześć " + name + ", mam na imię " + imie);
        } else {
            System.out.println("Brak danych");
        }
    }
}
