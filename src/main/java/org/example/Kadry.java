package org.example;

public class Kadry
    {
        public void DrukujRozliczenieRoczne(Pracownik p)
            {
                System.out.println("==================");
                System.out.println("Rozliczenie roczne");
                System.out.println("Dane pracownika:");
                System.out.println(p.Pobeirz());
                System.out.println("Wartość wynagrodzenia: ");
                System.out.println(p.DochodyRoczne());
                System.out.println("==================");
            }
    }
