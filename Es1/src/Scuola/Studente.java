package Scuola;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Studente {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private int matricola;
    private String corsoDiStudi;
    private float[] voti;

    public Studente(String nome, String cognome, LocalDate dataDiNascita, int matricola, String corsoDiStudi, float[] voti) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
        this.voti = voti;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    public float[] getVoti() {
        return voti;
    }

    public void setVoti(float[] voti) {
        this.voti = voti;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getEta() {
        return dataDiNascita;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(LocalDate eta) {
        this.dataDiNascita = eta;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void ToString() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + dataDiNascita);
        System.out.println("Matricola: " + matricola);
        System.out.println("Corso di Studi: " + corsoDiStudi);
        System.out.println("Voti:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Voto " + (i + 1) + ": " + voti[i]);
        }
    }

    public void aggiungiVoto(float voto) {
        System.out.print("Inserisci l'indice del voto (da 1 a 10): ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        System.out.print("Inserisci il voto sostitutivo");
        voti[i] = input.nextFloat();
    }

    public void rimuoviVoti() {
        for (int i = 0; i < 10; i++) {
            voti[i] = 0.0f;
        }
    }

    public void calcolaMediaVoti() {
        float somma = 0;
        int count = 0;
        for (int i = 0;i < 10;i++) {
            somma += voti[i];
        }
        System.out.print(somma/10);
    }

    public int calcolaEta() {
        Period eta = Period.between(dataDiNascita,LocalDate.now());
        return eta.getYears();
    }
}