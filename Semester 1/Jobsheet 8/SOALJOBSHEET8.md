
# JOBSHEET 8 – PERULANGAN 2

## 2.1 Percobaan 1: Review Perulangan 1

### Pertanyaan 1

Jika inisialisasi `i = 1` diubah menjadi `i = 0` tanpa mengubah kondisi, berapa karakter `*` yang tercetak ketika `n = 5`? Jelaskan.

**Jawaban:**

Karakter `*` akan tercetak sebanyak 6 kali. Hal ini karena perulangan dimulai dari `i = 0` hingga `i = 5`, sehingga terdapat 6 kali pengulangan.

### Pertanyaan 2

Jika kondisi `i <= n` diganti menjadi `i < n`, berapa kali perulangan dijalankan saat `n = 5`? Mengapa hasilnya berbeda?

**Jawaban:**

Perulangan dijalankan sebanyak 4 kali, yaitu ketika nilai `i` adalah 1, 2, 3, dan 4. Hasilnya berbeda karena kondisi `i < n` tidak mengizinkan perulangan berjalan ketika `i` sudah sama dengan 5.

### Pertanyaan 3

Prediksi output potongan kode berikut ketika `n = 9`, kemudian modifikasi kode agar mencetak bilangan ganjil positif yang tidak melebihi `n`.

**Jawaban:**

Output dari kode tersebut adalah:

```text
2 4 6 8
```

Kode untuk mencetak bilangan ganjil positif:

```java
for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

Output:

```text
1 3 5 7 9
```

### Pertanyaan 4

Jelaskan mengapa perubahan increment `i++` menjadi `i--` membuat perulangan berjalan terus-menerus.

**Jawaban:**

Karena nilai `i` akan terus berkurang setiap pengulangan, sedangkan kondisinya tetap `i <= n`. Untuk nilai `n` positif, kondisi tersebut akan selalu terpenuhi sehingga perulangan tidak berhenti.

---

## 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

### Pertanyaan 1

Tentukan fungsi variabel `i` dan `j` pada program tersebut.

**Jawaban:**

- Variabel `i` berfungsi sebagai penghitung perulangan luar (outer loop) untuk menentukan jumlah baris.
- Variabel `j` berfungsi sebagai penghitung perulangan dalam (inner loop) untuk menentukan jumlah kolom atau bintang pada setiap baris.

### Pertanyaan 2

Berapa kali outer loop, inner loop, dan perintah `print("*")` dijalankan untuk baris = 4 dan kolom = 7?

**Jawaban:**

- Outer loop dijalankan sebanyak 4 kali.
- Inner loop dijalankan sebanyak 7 kali pada setiap baris, sehingga totalnya 28 kali.
- Perintah `print("*")` dijalankan sebanyak 28 kali.

### Pertanyaan 3

Apa yang terjadi jika batas perulangan luar dan dalam ditukar? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.

**Jawaban:**

Jika batas perulangan ditukar, maka program akan menghasilkan 6 baris dengan masing-masing 3 bintang. Bentuk persegi panjang akan berubah karena outer loop menggunakan jumlah kolom, sedangkan inner loop menggunakan jumlah baris.

Output:

```text
***
***
***
***
***
***
```

### Pertanyaan 4

Jelaskan akibat penghapusan `System.out.println();` setelah inner loop.

**Jawaban:**

Jika `System.out.println();` dihapus, seluruh karakter bintang akan dicetak dalam satu baris karena tidak ada perintah untuk memindahkan kursor ke baris berikutnya setelah inner loop selesai.

### Pertanyaan 5

Modifikasi program agar karakter yang dicetak adalah `#`.

**Jawaban:**

Cukup mengganti perintah:

```java
System.out.print("*");
```

Menjadi:

```java
System.out.print("#");
```

---

## 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE

### Pertanyaan 1

Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.

**Jawaban:**

Ketidaksesuaian output awal adalah terdapat satu baris kosong karena `i` dimulai dari 0 dan seluruh bintang dicetak dalam satu baris.

Perbaikan yang diperlukan:

1. Mengubah inisialisasi `i = 0` menjadi `i = 1` agar tidak menghasilkan baris kosong.
2. Menambahkan `System.out.println();` setelah inner loop agar setiap baris dicetak pada baris baru.

### Pertanyaan 2

Jelaskan peran variabel `i` dan `j`. Mengapa nilai `j` harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop? Apa yang terjadi jika `j` tidak di-reset?

**Jawaban:**

- Variabel `i` berfungsi untuk menentukan jumlah baris pada segitiga.
- Variabel `j` berfungsi untuk menghitung jumlah bintang pada setiap baris.

Nilai `j` harus diinisialisasi kembali menjadi 0 agar perulangan dalam dimulai dari awal pada setiap baris.

Jika `j` tidak di-reset, nilai sebelumnya akan terus digunakan sehingga jumlah bintang yang dicetak pada setiap baris menjadi tidak sesuai dengan pola yang diinginkan.

### Pertanyaan 3

Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop yang diperlukan untuk membentuk segitiga terbalik.

**Jawaban:**

Untuk membuat segitiga terbalik, perubahan outer loop adalah:

- Inisialisasi `i = n`, sehingga dimulai dari jumlah baris terbesar.
- Kondisi `i >= 1`, agar perulangan berhenti ketika mencapai 0.
- Update `i--`, sehingga jumlah bintang berkurang satu pada setiap baris.

Contoh kode:

```java
i = n;

while (i >= 1) {
    int j = 0;

    while (j < i) {
        System.out.print("*");
        j++;
    }

    System.out.println();
    i--;
}
```

---

## 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

### Pertanyaan 1

Mengapa `totalNilai` perlu di-reset di dalam outer loop, tetapi `rataTertinggi` tidak boleh di-reset pada setiap kelompok?

**Jawaban:**

`totalNilai` harus di-reset menjadi 0 setiap kelompok karena digunakan untuk menghitung total nilai penilai pada kelompok yang sedang diproses.

Sedangkan `rataTertinggi` tidak boleh di-reset karena digunakan untuk menyimpan rata-rata tertinggi dari seluruh kelompok yang sudah diperiksa. Jika di-reset, program tidak dapat membandingkan nilai antar kelompok dengan benar.

### Pertanyaan 2

Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?

**Jawaban:**

Perulangan FOR dijalankan sebanyak 6 kali secara keseluruhan.

Perhitungannya:

3 kelompok × 2 penilai = 6 kali pengulangan.

### Pertanyaan 3

Apa yang terjadi jika `totalNilai` dideklarasikan sebagai `int` dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.

**Jawaban:**

Hasil pembagian akan dibulatkan ke bawah karena menggunakan pembagian bilangan bulat (integer division), sehingga bagian desimal tidak diperhitungkan.

Contoh:

```java
int totalNilai = 165;
int jumlahPenilai = 2;

double rataNilai = totalNilai / jumlahPenilai;
```

Hasilnya adalah `82.0`, bukan `82.5`, karena pembagian dilakukan menggunakan tipe data integer.

### Pertanyaan 4

Mengapa `rataTertinggi` diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.

**Jawaban:**

Karena nilai rata-rata terendah yang mungkin diperoleh adalah 0. Dengan memberikan nilai awal -1, kelompok pertama tetap dapat tercatat meskipun seluruh nilainya 0.

Jika nilai awalnya 0 dan semua kelompok memperoleh rata-rata 0, kondisi `rataNilai > rataTertinggi` tidak pernah terpenuhi. Akibatnya, variabel `kelompokTerbaik` tidak diperbarui dan hasilnya menjadi salah.

### Pertanyaan 5

Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.

**Jawaban:**

1. **WHILE (Outer Loop):** Digunakan untuk memproses kelompok satu per satu.
2. **FOR (Perulangan Tengah):** Digunakan untuk memasukkan dan menjumlahkan nilai dari setiap penilai.
3. **DO-WHILE (Inner Loop):** Digunakan untuk mengulang input nilai apabila nilai yang dimasukkan tidak berada dalam rentang 0–100.

---

# SELESAI
