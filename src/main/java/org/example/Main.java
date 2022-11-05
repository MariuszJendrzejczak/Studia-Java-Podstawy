package org.example;

public class Main
    {
        public static void main(String[] args)
            {
                Osoba prac1 = new Pracownik("Mariusz", "Jendrzejczak", "Programista", "123456" );
                System.out.println(prac1.Pobeirz());
                PracownikEtatowy prac2 = new PracownikEtatowy("Adam", "Pach", "Programista", "12235", 8000, 12);
                System.out.println(prac2.Pobierz());
                System.out.println(prac2.PobierzNazwiskoiPlace());
            }
    }