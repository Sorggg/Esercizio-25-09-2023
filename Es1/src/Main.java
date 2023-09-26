import Scuola.Studente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2002,3,4);
        float[] votiStudente1 = { 90.0f, 85.0f, 92.5f, 78.5f, 88.0f, 94.5f, 89.5f, 87.0f, 91.0f, 86.5f };
        Studente studente1 = new Studente("Mario", "Rossi", data1, 123456, "Ingegneria", votiStudente1);

        float[] votiStudente2 = { 75.0f, 80.0f, 88.0f, 92.0f, 79.5f, 84.0f, 87.5f, 91.0f, 76.0f, 82.5f };
        Studente studente2 = new Studente("Luigi", "Verdi", data1, 789012, "Informatica", votiStudente2);
    }

}