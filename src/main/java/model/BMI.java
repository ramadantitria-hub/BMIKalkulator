/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class BMI {
    private double beratBadan; // kg
    private double tinggiBadan; // meter

    public BMI(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungNilaiBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public abstract String getKategori();

    public double getBeratBadan() { return beratBadan; }
    public double getTinggiBadan() { return tinggiBadan; }
}