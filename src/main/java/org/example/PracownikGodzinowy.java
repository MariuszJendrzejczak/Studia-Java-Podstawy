package org.example;

public class PracownikGodzinowy extends Pracownik
    {
        private double _liczbaGodzin;
        private double _stawkaGodzinowa;
        public PracownikGodzinowy(String imie, String nazwisko, String stanowisko, String numerKarty, double lgodzin, double stawka)
            {
                super(imie, nazwisko, stanowisko, numerKarty);
                _liczbaGodzin = lgodzin;
                _stawkaGodzinowa = stawka;
            }

        public String Pobierz()
            {
                return super.Pobeirz() + " " + _liczbaGodzin + " " + _stawkaGodzinowa;
            }

        public double DochodyRoczne()
            {
                return _liczbaGodzin*_stawkaGodzinowa;
            }

    }
