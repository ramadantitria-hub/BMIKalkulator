# ⚖️ Kalkulator BMI (Body Mass Index) - JavaFX

Aplikasi desktop interaktif untuk menghitung **Indeks Massa Tubuh (BMI)** yang dibangun menggunakan **Java**, **JavaFX**, dan **Scene Builder**. Proyek ini menerapkan prinsip **Pemrograman Berorientasi Objek (OOP)** serta pola arsitektur **MVC (Model-View-Controller)**.

---

## 📌 Fitur Utama
* **Penghitungan BMI Akurat:** Menghitung skor BMI berdasarkan input berat badan (kg) dan tinggi badan (cm).
* **Klasifikasi Kategori Otomatis:** Mengelompokkan hasil ke dalam kategori: *Kurus (Underweight)*, *Normal*, *Kelebihan Berat Badan (Overweight)*, atau *Obesitas*.
* **Validasi Input:** Dilengkapi penanganan error jika input kosong, bukan angka, atau bernilai 0 / negatif.
* **Antarmuka Modern (GUI):** Didesain menggunakan JavaFX Scene Builder dengan tata letak responsif dan rapi.
* **Arsitektur OOP & MVC:** Pemisahan logika data (Model), tampilan antarmuka (View), dan pengendali aksi (Controller).

---

## 📂 Struktur Proyek
```text
BMIkalkulator/
├── pom.xml                                  # Konfigurasi Maven & Dependensi JavaFX
├── README.md                                # Dokumentasi proyek
└── src/
    └── main/
        ├── java/
        │   ├── controller/
        │   │   └── BMIController.java       # Menangani input pengguna & logika tombol
        │   ├── main/
        │   │   ├── AppLauncher.java         # Titik masuk utama aplikasi (Main wrapper)
        │   │   └── MainApp.java             # Konfigurasi Stage & Loader FXML
        │   └── model/
        │       ├── BMI.java                 # Abstract class (Superclass OOP)
        │       └── BMIDewasa.java           # Subclass turunan untuk klasifikasi kategori
        └── resources/
            └── fxml/
                └── form_bmi.fxml            # File desain tampilan antarmuka (Scene Builder)
```

---

## 🧠 Penerapan Konsep OOP pada Proyek Ini
Proyek ini mempraktikkan konsep dasar OOP:
1. **Abstraction (Abstraksi):**
   * Class `BMI` dibuat sebagai `abstract class` yang menyimpan data dasar (`beratBadan`, `tinggiBadan`) dan mendefinisikan method abstrak `public abstract String getKategori()`.
2. **Inheritance (Pewarisan):**
   * Class `BMIDewasa` mewarisi (`extends`) class `BMI`, dan mengimplementasikan logika spesifik penentuan kategori berat badan orang dewasa.
3. **Encapsulation (Enkapsulasi):**
   * Variabel atribut dienkapsulasi menggunakan *access modifier* `private`, dan diakses secara aman melalui *constructor* dan *getter*.

---

## 🛠️ Prasyarat Sistem
Sebelum menjalankan proyek ini, pastikan komputer Anda telah terpasang:
* **JDK 21** atau versi lebih baru.
* **Apache NetBeans** / **IntelliJ IDEA** / **Eclipse** (dengan dukungan Maven).
* **Scene Builder** (opsional, untuk mengedit desain visual antarmuka).

---

## 🚀 Panduan Menjalankan Aplikasi

### Opsi A: Menjalankan Lewat NetBeans (Disarankan)
1. Buka **Apache NetBeans**.
2. Klik menu **File** > **Open Project...**
3. Arahkan ke folder proyek `BMIkalkulator`, lalu klik **Open Project**.
4. Tunggu Maven selesai mengunduh dependensi (status di pojok kanan bawah NetBeans).
5. Klik kanan pada proyek **BMIkalkulator** > pilih **Run** (atau tekan tombol `F6` / ikon panah hijau).

### Opsi B: Menjalankan Lewat Terminal / Command Prompt
1. Buka Terminal atau Command Prompt di direktori proyek ini:
   ```bash
   cd C:\Users\USER\Documents\BMIkalkulator
   ```
2. Jalankan perintah Maven JavaFX:
   ```bash
   mvn clean javafx:run
   ```

---

## 📖 Tata Cara Penggunaan Aplikasi
1. **Jalankan Aplikasi:** Jendela kalkulator akan muncul di layar desktop Anda.
2. **Masukkan Berat Badan:** Ketik berat badan Anda dalam satuan **kilogram (kg)** pada kolom *Berat Badan* (contoh: `60`).
3. **Masukkan Tinggi Badan:** Ketik tinggi badan Anda dalam satuan **sentimeter (cm)** pada kolom *Tinggi Badan* (contoh: `170`).
4. **Klik Tombol "Hitung BMI":** Tekan tombol biru bertuliskan **Hitung BMI**.
5. **Lihat Hasil:**
   * **Skor BMI:** Ditampilkan berupa nilai angka dengan 2 angka di belakang koma (misal: `20.76`).
   * **Kategori:** Menampilkan status kesehatan berat badan Anda.

> ⚠️ **Catatan Input:** 
> * Masukkan angka saja tanpa huruf/satuan.
> * Jika menggunakan desimal, gunakan tanda titik `.` (contoh: `65.5`).

---

## 📊 Tabel Klasifikasi Nilai BMI

| Rentang Skor BMI | Kategori Status |
| :--- | :--- |
| **< 18.5** | Kurus (*Underweight*) |
| **18.5 – 24.9** | Normal (*Ideal*) |
| **25.0 – 29.9** | Kelebihan Berat Badan (*Overweight*) |
| **≥ 30.0** | Obesitas |

---

## 🎨 Mengedit Tampilan (Scene Builder)
Jika ingin mengubah desain atau warna tombol/kolom:
1. Buka aplikasi **Scene Builder**.
2. Buka file: `src/main/resources/fxml/form_bmi.fxml`.
3. Sesuaikan tata letak atau warna komponen di kanvas.
4. Simpan (`Ctrl + S`), lalu jalankan kembali aplikasi untuk melihat perubahannya.

---

## 👤 Penulis / Pengembang
* **GitHub:** [@ramadantitria-hub](https://github.com/ramadantitria-hub)
