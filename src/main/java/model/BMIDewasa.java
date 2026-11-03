/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class BMIDewasa extends BMI {
    public BMIDewasa(double beratBadan, double tinggiBadan) {
        super(beratBadan, tinggiBadan);
    }

    @Override
    public String getKategori() {
        double bmi = hitungNilaiBMI();
        if (bmi < 18.5) {
            return "Kurus (Underweight)";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}
