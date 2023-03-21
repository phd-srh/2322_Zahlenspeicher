public class Main {

    public static void main(String[] args) {
        Zahlenspeicher z = new Zahlenspeicher(100);

        z.hinzufügen(3);
        z.hinzufügen(7);
        z.hinzufügen(21);
        System.out.println( z.anzeigen() );

        z.löscheLetzteZahl(5);
        System.out.println( z.anzeigen() );

        z.hinzufügen(17);
        System.out.println( z.anzeigen() );
    }
}
