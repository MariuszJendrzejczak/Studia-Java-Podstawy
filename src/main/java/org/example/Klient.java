package org.example;

import java.awt.*;

public class Klient extends Osoba implements IRozliczeniaRoczne
    {
        double _dochody;
        public Klient(String imie, String nazwisko, double dochody)
            {
                super(imie, nazwisko);
                _dochody = dochody;
            }
        public String Pobierz()
            {
                return super.Pobeirz() + " " + _dochody;
            }
        public double DochodyRoczne()
            {
                return _dochody;
            }
    }
