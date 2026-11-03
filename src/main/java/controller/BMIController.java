/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BMI;
import model.BMIDewasa;

public class BMIController {

    @FXML private TextField txtBerat;
    @FXML private TextField txtTinggi;
    @FXML private Label lblNilaiBMI;
    @FXML private Label lblKategori;

    @FXML
    private void handleHitung() {
        try {
            double berat = Double.parseDouble(txtBerat.getText().trim());
            double tinggiCm = Double.parseDouble(txtTinggi.getText().trim());

            if (berat <= 0 || tinggiCm <= 0) {
                tampilkanError("Nilai berat dan tinggi badan harus lebih besar dari 0.");
                return;
            }

            double tinggiMeter = tinggiCm / 100.0;
            BMI bmi = new BMIDewasa(berat, tinggiMeter);

            lblNilaiBMI.setText(String.format("Skor BMI: %.2f", bmi.hitungNilaiBMI()));
            lblKategori.setText("Kategori: " + bmi.getKategori());

        } catch (NumberFormatException e) {
            tampilkanError("Masukkan angka yang valid untuk berat dan tinggi badan!");
        }
    }

    private void tampilkanError(String pesan) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Input");
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }
}
