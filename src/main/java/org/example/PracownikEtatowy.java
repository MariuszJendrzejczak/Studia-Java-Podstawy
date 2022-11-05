package org.example;

public class PracownikEtatowy extends Pracownik
    {
        private double _placaBrutto;
        private double _urlop;
        public PracownikEtatowy(String imie, String nazwisko, String stanowisko, String numerKarty, double pracaB, double urlop)
            {
                super(imie, nazwisko, stanowisko, numerKarty);
                _placaBrutto = pracaB;
                _urlop = urlop;
            }

        public String Pobierz()
            {
                return super.Pobeirz() + " " +_placaBrutto + " " + _urlop;
            }

        public String PobierzNazwiskoiPlace()
            {
                return _nazwisko + " " + _placaBrutto;
            }

        public  double DochodyRoczne()
            {
                return _placaBrutto * 12;
            }
    }
