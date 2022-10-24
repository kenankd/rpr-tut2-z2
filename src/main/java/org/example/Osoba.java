package org.example;

public class Osoba {
    String ime,prezime;
    public Osoba(String s1, String s2){ime=s1;prezime=s2;}

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
