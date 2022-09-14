import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Liczba zajerestrowanych kont to " + Osoba.ilosc);

        Osoba os1 = new Osoba();
        System.out.println("Podaj imie");
        String imie = sc.nextLine();
        System.out.println("Podaj id");
        int id = sc.nextInt();
        Osoba os2 = new Osoba(imie, id);
        Osoba os3 = new Osoba(os2);

        os1.metoda("Jan");
        os2.metoda("Jan");
        os3.metoda("Jan");

        System.out.println("Liczba zajerestrowanych kont to " + Osoba.ilosc);

    }
}