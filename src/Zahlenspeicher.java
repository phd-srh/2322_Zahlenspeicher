import java.util.Arrays;

public class Zahlenspeicher {

    // Attribute
    private int kapazität;
    private int[] speicher;

    // Pre-Konstruktor (wird ausgeführt vor dem Aufruf des Konstruktors)
    private int elementeImSpeicher = 0;

    public Zahlenspeicher(int kapazität) {
        this.kapazität = kapazität;
        this.speicher = new int[ kapazität ];
        //elementeImSpeicher = 0;
    }

    // Methoden
    // Feature Request 2:
    // wenn die Kapazität nicht ausreicht, soll diese verdoppelt werden,
    // ohne die bisherigen Daten zu verlieren
    public void hinzufügen(int zahl) {
        if (elementeImSpeicher >= kapazität) {
            kapazität *= 2;
//            wenn man die Arrays Collection Klasse kennt:
//            speicher = Arrays.copyOf(speicher, kapazität);
            int[] zwischenspeicher = new int[kapazität];
            for (int i=0; i<speicher.length; i++)
                zwischenspeicher[i] = speicher[i];
            speicher = zwischenspeicher;
        }

        this.speicher[ elementeImSpeicher ] = zahl;
        elementeImSpeicher++;
    }

    // Feature Request 1:
    // weitere Methode: löscheLetzteZahl(int anzahl)
    // -> löscht die "anzahl" letzter Zahlen
    //    wenn anzahl zu groß ist, wird der gesamte Zahlenspeicher geleert
    public void löscheLetzteZahl(int anzahl) {
        for (int i=0; i<anzahl; i++)
            löscheLetzteZahl();
    }

    public void löscheLetzteZahl() {
        if (elementeImSpeicher > 0)
            elementeImSpeicher--;
    }

    public String anzeigen() {
        String ausgabe = "[";
        for (int i=0; i < elementeImSpeicher; i++) {
            if (i > 0) ausgabe += ", ";
            ausgabe += speicher[i];
        }
        ausgabe += "]";
        return ausgabe;
    }
}
