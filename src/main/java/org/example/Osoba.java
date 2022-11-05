package org.example;

public abstract class Osoba
    {
        protected String _imie;
        protected String _nazwisko;

        public Osoba(String imie, String nazwisko)
            {
                _imie = imie;
                _nazwisko = nazwisko;
            }

        public String Pobeirz()
            {
                return _imie + " " + _nazwisko;
            }
    }
