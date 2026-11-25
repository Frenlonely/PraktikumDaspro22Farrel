# JOBSHEET 11 – ARRAY 2 DIMENSI

## 1. Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

### Pertanyaan 1

Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

**Jawaban:**

Tidak harus. Elemen array dapat diisi berdasarkan indeks baris dan kolom yang diinginkan, asalkan indeks tersebut masih berada dalam batas ukuran array.

### Pertanyaan 2

Mengapa terdapat `null` pada daftar nama penonton? Jelaskan dari sisi nilai default array.

**Jawaban:**

Karena elemen array bertipe `String` belum diisi. Dalam Java, nilai default untuk array bertipe `String` adalah `null`.

### Pertanyaan 3

Lengkapi pengisian pada langkah 3 jika ada elemen yang belum terisi, lalu jalankan kembali program.

**Jawaban:**

Elemen yang belum terisi harus diberikan nama penonton. Setelah seluruh elemen diisi, tidak akan ada lagi nilai `null` pada daftar penonton.

### Pertanyaan 4

Tambahkan kode untuk menampilkan panjang array. Jelaskan fungsi dari `penonton.length` dan `penonton[0].length`!

**Jawaban:**

- `penonton.length` digunakan untuk mengetahui jumlah baris array.
- `penonton[0].length` digunakan untuk mengetahui jumlah kolom pada baris pertama.

Jika array memiliki 4 baris dan 2 kolom, hasilnya adalah 4 dan 2.

### Pertanyaan 5

Apakah `penonton[0].length`, `penonton[1].length`, `penonton[2].length`, dan `penonton[3].length` memiliki nilai yang sama? Mengapa?

**Jawaban:**

Ya, semuanya memiliki nilai 2 karena setiap baris memiliki jumlah kolom yang sama, yaitu dua kolom.

### Pertanyaan 6

Modifikasi kode pada pertanyaan 4 untuk menampilkan panjang setiap baris menggunakan for loop. Compile, run, lalu amati hasilnya.

**Jawaban:**

Perulangan `for` digunakan untuk memeriksa setiap baris dan menampilkan jumlah elemennya.

Hasilnya:

```text
Panjang baris ke-1: 2
Panjang baris ke-2: 2
Panjang baris ke-3: 2
Panjang baris ke-4: 2
```

### Pertanyaan 7

Modifikasi kode pada pertanyaan 5 untuk menampilkan panjang setiap baris menggunakan foreach loop. Compile, run, lalu amati hasilnya.

**Jawaban:**

Perulangan `foreach` digunakan untuk membaca setiap baris array secara langsung tanpa menggunakan indeks.

Hasilnya sama, yaitu setiap baris memiliki panjang 2 elemen.

### Pertanyaan 8

Tambahkan kode untuk menampilkan nama penonton pada baris ke-3 (indeks 2) menggunakan for loop. Compile, run, lalu amati hasilnya.

**Jawaban:**

Untuk menampilkan penonton pada baris ketiga, digunakan indeks 2 karena indeks array dimulai dari 0.

Hasilnya:

```text
Eka
Farhan
```

### Pertanyaan 9

Modifikasi kode pada pertanyaan 8 menjadi perulangan dengan foreach loop. Compile, run, lalu amati hasilnya.

**Jawaban:**

Foreach digunakan untuk menampilkan seluruh nama penonton pada baris ketiga secara langsung.

Hasilnya:

```text
Eka
Farhan
```

### Pertanyaan 10

Modifikasi kode pada pertanyaan 9 untuk menampilkan nama penonton setiap baris. Gunakan `String.join()`, compile, run, lalu amati hasilnya.

**Jawaban:**

`String.join()` digunakan untuk menggabungkan nama penonton dalam satu baris dengan pemisah tertentu.

Hasilnya:

```text
Baris ke-1: Amin, Bena
Baris ke-2: Candra, Dela
Baris ke-3: Eka, Farhan
Baris ke-4: Gisel, Hana
```

### Pertanyaan 11

Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan for loop?

**Jawaban:**

**Kelebihan foreach:**
1. Penulisannya lebih sederhana.
2. Tidak membutuhkan variabel indeks.
3. Cocok untuk membaca seluruh elemen array.

**Kekurangan foreach:**
1. Tidak dapat mengakses indeks secara langsung.
2. Kurang cocok untuk mengubah elemen berdasarkan indeks.
3. Kurang fleksibel untuk mengakses elemen tertentu.

### Pertanyaan 12

Berapa indeks baris maksimal untuk array penonton? Dari mana nilai itu diperoleh?

**Jawaban:**

Indeks baris maksimal adalah 3 karena jumlah baris array adalah 4. Indeks dimulai dari 0, sehingga indeks yang tersedia adalah 0 sampai 3.

### Pertanyaan 13

Berapa indeks kolom maksimal untuk array penonton? Apakah nilainya sama untuk setiap baris?

**Jawaban:**

Indeks kolom maksimal adalah 1 karena setiap baris memiliki 2 kolom. Nilainya sama untuk setiap baris karena seluruh baris memiliki jumlah kolom yang sama.

### Pertanyaan 14

Apa fungsi dari `String.join()`? Jelaskan parameter yang diterimanya.

**Jawaban:**

`String.join()` digunakan untuk menggabungkan beberapa teks menjadi satu teks.

Parameter yang digunakan adalah:
1. **Delimiter:** Pemisah antarteks, misalnya koma dan spasi.
2. **Elements:** Kumpulan teks yang akan digabungkan.

### Pertanyaan Diskusi Percobaan 1

Jika Anda menulis `penonton[1] = null;` lalu memanggil `penonton[1].length`, apa yang terjadi? Bandingkan dengan `penonton[1][0] = null;`. Jelaskan perbedaan antara baris yang null dan elemen yang null.

**Jawaban:**

Jika `penonton[1] = null`, seluruh baris kedua menjadi `null` sehingga pemanggilan `.length` akan menyebabkan `NullPointerException`.

Sedangkan `penonton[1][0] = null` hanya mengosongkan satu elemen pada baris kedua. Elemen lainnya tetap dapat digunakan.

Apakah `penonton.length` dapat berubah setelah array dibuat? Bagaimana jika Anda ingin menambah baris? Diskusikan batasan array di Java.

**Jawaban:**

Tidak, ukuran array tidak dapat diubah setelah dibuat. Jika ingin menambah baris, program harus membuat array baru dengan ukuran lebih besar dan menyalin data dari array sebelumnya.

---

## 2. Percobaan 2: Scanner dan Perulangan untuk Input dan Output Array 2 Dimensi

### Pertanyaan 1

Apakah pengisian elemen array dari Scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

**Jawaban:**

Tidak harus. Pengisian dapat dilakukan berdasarkan nomor baris dan kolom yang dipilih pengguna, selama indeks tersebut masih tersedia dalam array.

### Pertanyaan 2

Modifikasi program agar menampilkan menu berikut:

1. Input data penonton.
2. Tampilkan daftar penonton.
3. Exit.

**Jawaban:**

Program harus menyediakan tiga pilihan menu. Pilihan pertama digunakan untuk memasukkan data penonton, pilihan kedua untuk menampilkan daftar penonton, dan pilihan ketiga untuk keluar dari program.

Menu dapat dijalankan berulang kali menggunakan `do-while`.

### Pertanyaan 3

Modifikasi program untuk menangani nomor baris atau kolom yang tidak tersedia, misalnya baris 7 atau kolom 0.

**Jawaban:**

Program perlu melakukan validasi nomor baris dan kolom sebelum menyimpan data.

Jika nomor yang dimasukkan tidak tersedia, program menampilkan pesan kesalahan dan meminta pengguna memasukkan nomor kembali.

### Pertanyaan 4

Pada menu 1, tampilkan peringatan jika kursi yang dipilih sudah terisi penonton lain, lalu minta baris dan kolom kembali.

**Jawaban:**

Program harus memeriksa apakah kursi sudah terisi atau belum. Jika elemen array bernilai `null`, kursi masih kosong. Jika sudah berisi nama, program menampilkan peringatan dan meminta pengguna memilih kursi lain.

### Pertanyaan 5

Pada menu 2, jika sebuah kursi kosong (`null`), tampilkan `***` sebagai pengganti `null`.

**Jawaban:**

Program perlu memeriksa setiap elemen array. Jika nilainya `null`, tampilkan `***`. Jika sudah berisi nama penonton, tampilkan nama tersebut.

Contoh output:

```text
Baris ke-1: ***    Agus
Baris ke-2: Indah  ***
Baris ke-3: Sonya  Fuady
Baris ke-4: ***    ***
```

### Pertanyaan Diskusi Percobaan 2

Jika pengguna mengetik huruf pada prompt baris, `nextInt()` akan melempar `InputMismatchException`. Coba, lalu diskusikan bagaimana program seharusnya menangani kesalahan input ini.

**Jawaban:**

Program dapat menggunakan `try-catch` untuk menangani kesalahan input. Jika pengguna memasukkan huruf, program menampilkan pesan bahwa input harus berupa angka dan meminta pengguna memasukkan kembali data.

Jika jumlah baris dan kolom kursi ditentukan oleh pengguna saat program berjalan, bagian mana dari kode yang harus diubah? Mengapa array 2 dimensi tidak bisa diubah ukurannya setelah dibuat?

**Jawaban:**

Bagian deklarasi array harus diubah agar ukuran baris dan kolom berasal dari input pengguna. Array tidak dapat diubah ukurannya setelah dibuat karena ukuran array di Java bersifat tetap. Untuk mengubah ukuran, perlu dibuat array baru dan data lama disalin.

---

## 3. Percobaan 3: Array 2 Dimensi dengan Panjang Baris Berbeda (Jagged Array)

### Pertanyaan 1

Apa fungsi dari `Arrays.toString()`?

**Jawaban:**

`Arrays.toString()` digunakan untuk menampilkan isi array satu dimensi dalam bentuk teks agar mudah dibaca.

### Pertanyaan 2

Pada Kode 16, `Arrays.toString()` dipanggil pada `myNumbers[i]`. Ganti pemanggilannya menjadi `Arrays.toString(myNumbers)`, lalu compile dan jalankan. Apa yang tampil? Jelaskan.

**Jawaban:**

Hasilnya tidak menampilkan seluruh isi array secara lengkap. Hal ini karena `Arrays.toString()` tidak menampilkan elemen dalam array multidimensi secara mendalam.

### Pertanyaan 3

Jalankan juga `System.out.println(Arrays.deepToString(myNumbers));`. Bandingkan hasilnya dengan Kode 16. Mengapa `deepToString()` diperlukan untuk array 2 dimensi?

**Jawaban:**

`Arrays.deepToString()` digunakan untuk menampilkan seluruh isi array multidimensi secara lengkap, termasuk elemen pada setiap baris.

Contoh hasil:

```text
[[0, 0, 0, 0, 0], [0, 0, 0], [0]]
```

### Pertanyaan 4

Apa nilai default untuk elemen array dengan tipe data `int`?

**Jawaban:**

Nilai default untuk array bertipe `int` adalah 0. Jika elemen belum diisi, Java secara otomatis memberikan nilai 0.

### Pertanyaan 5

Tambahkan kode untuk menampilkan panjang setiap baris. Compile dan run, lalu amati hasilnya.

**Jawaban:**

Panjang setiap baris dapat diketahui menggunakan properti `length`.

Hasilnya:

```text
Panjang baris ke-1: 5
Panjang baris ke-2: 3
Panjang baris ke-3: 1
```

### Pertanyaan 6

Array `myNumbers` memiliki panjang yang berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi? Jelaskan.

**Jawaban:**

Ukuran array tidak dapat diubah secara langsung setelah dibuat. Namun, setiap baris pada jagged array dapat diganti dengan array baru yang memiliki ukuran berbeda.

### Pertanyaan 7

Jalankan `myNumbers[0] = new int[7];` setelah instansiasi, lalu cetak `myNumbers.length` dan `myNumbers[0].length`. Bagian mana yang berubah? Mengapa?

**Jawaban:**

Panjang baris pertama berubah menjadi 7, sedangkan jumlah baris utama tetap 3. Hal ini karena yang diganti hanya array pada baris pertama.

### Pertanyaan Diskusi Percobaan 3

Jalankan kode berikut: `int[][] salinan = myNumbers; salinan[0][0] = 99; System.out.println(myNumbers[0][0]);`. Mengapa nilai `myNumbers` ikut berubah? Apa perbedaannya dengan menyalin nilai satu per satu menggunakan perulangan?

**Jawaban:**

Nilai `myNumbers` ikut berubah karena kedua variabel menunjuk ke array yang sama. Jika salah satu diubah, array lainnya ikut berubah.

Sedangkan penyalinan nilai satu per satu membuat array baru sehingga perubahan pada salinan tidak memengaruhi array asli.

Jika Anda ingin menyalin array 2 dimensi secara benar, bagaimana kode penyalinannya? Apakah `clone()` sudah cukup? Coba uji dengan array yang berisi array.

**Jawaban:**

Penyalinan array dua dimensi harus dilakukan pada setiap barisnya. Penggunaan `clone()` pada array utama saja belum cukup karena hanya menyalin referensi baris.

Oleh karena itu, setiap baris perlu disalin secara terpisah agar perubahan pada array salinan tidak memengaruhi array asli.

---

## 4. Percobaan 4: Studi Kasus SIAKAD

### Pertanyaan 1

Bagaimana jika jumlah mahasiswa dan jumlah mata kuliah berubah? Modifikasi program SIAKAD agar jumlah mahasiswa dan jumlah mata kuliah dapat ditentukan saat program berjalan.

**Jawaban:**

Program dapat meminta pengguna memasukkan jumlah mahasiswa dan mata kuliah melalui Scanner. Nilai tersebut digunakan untuk menentukan ukuran array dua dimensi.

Dengan demikian, program dapat menyesuaikan jumlah data yang diinput tanpa harus menentukan ukuran array secara tetap.

### Pertanyaan Diskusi Percobaan 4

Pada Kode 20, variabel `totalPerSiswa` dideklarasikan di dalam loop luar. Apa yang terjadi jika deklarasinya dipindah ke luar loop? Jelaskan dengan contoh nilai.

**Jawaban:**

Jika dipindahkan ke luar loop, nilai total mahasiswa sebelumnya dapat terbawa ke perhitungan mahasiswa berikutnya.

Akibatnya, hasil rata-rata menjadi tidak tepat. Oleh karena itu, variabel `totalPerSiswa` harus diatur kembali menjadi 0 untuk setiap mahasiswa.

Jika ada nilai yang belum diisi (bernilai 0 secara default), bagaimana pengaruhnya terhadap rata-rata? Diskusikan apakah program perlu membedakan "belum diisi" dari "nilainya 0".

**Jawaban:**

Nilai yang belum diisi akan dianggap 0 dan ikut dihitung dalam rata-rata. Hal ini dapat membuat rata-rata menjadi lebih rendah.

Oleh karena itu, program sebaiknya membedakan nilai yang belum diisi dengan nilai 0 yang memang diberikan oleh pengguna.

---

## 5. Refleksi

### Pertanyaan 1

Sebutkan dua situasi nyata yang cocok dimodelkan dengan array 2 dimensi, dan jelaskan apa yang menjadi baris serta kolomnya.

**Jawaban:**

1. **Tempat duduk bioskop:** Baris menunjukkan barisan kursi, sedangkan kolom menunjukkan posisi kursi.
2. **Nilai mahasiswa:** Baris menunjukkan mahasiswa, sedangkan kolom menunjukkan mata kuliah.

### Pertanyaan 2

Apa perbedaan utama antara array 2 dimensi yang persegi dan jagged array? Berikan satu contoh penggunaan untuk masing-masing.

**Jawaban:**

Array dua dimensi biasa memiliki jumlah kolom yang sama pada setiap baris. Sedangkan jagged array memiliki jumlah kolom yang dapat berbeda pada setiap baris.

Contohnya, denah kursi bioskop menggunakan array biasa, sedangkan data anggota kelompok dengan jumlah berbeda menggunakan jagged array.

### Pertanyaan 3

Di bagian mana pada jobsheet ini Anda paling sering melakukan kesalahan indeks? Bagaimana cara mencegahnya?

**Jawaban:**

Kesalahan indeks saya biasanya terjadi ketika menentukan posisi baris dan kolom karena indeks array dimulai dari 0.

Cara mencegahnya adalah dengan memperhatikan ukuran array, menggunakan properti `length`, dan memastikan indeks yang digunakan tidak melebihi batas array.

---

# SELESAI