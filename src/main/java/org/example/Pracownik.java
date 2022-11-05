package org.example;

public class Pracownik extends Osoba
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
    }
