package org.example;

public class Main
    {
        public static void main(String[] args)
            {
                Kadry kadry = new Kadry();

                Osoba os = new Osoba("Anna", "Osobowa");
                //Pracownik prac1 = new Pracownik("Mariusz", "Koder", "Programista", "123456" );
                PracownikEtatowy prac2 = new PracownikEtatowy("Adam", "Etatowy", "Programista", "12235", 8000, 12);
                PracownikGodzinowy prac3 = new PracownikGodzinowy("Paweł", "Godzinowy", "DevOps", "13254", 48, 25);

                kadry.DrukujRozliczenieRoczne(prac2);
                kadry.DrukujRozliczenieRoczne(prac3);
            }
    }