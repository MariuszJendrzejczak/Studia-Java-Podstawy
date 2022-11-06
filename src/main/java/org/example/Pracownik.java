package org.example;

public abstract class Pracownik extends Osoba
    {
        protected String _stanowisko;
        protected String _numerKarty;

        public Pracownik(String imie, String nazwisko, String stanowisko, String numerKarty)
            {
                super(imie, nazwisko);
                _stanowisko = stanowisko;
                _numerKarty = numerKarty;
            }

        public String Pobeirz()
            {
                return super.Pobeirz()+ " " + _stanowisko + " " + _numerKarty;
            }

        public abstract double DochodyRoczne();
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
