# JOBSHEET 9 – ARRAY 1 DIMENSI

## 3.1 Percobaan 1: Deklarasi, Inisialisasi, Mengisi, dan Menampilkan Elemen Array

### Pertanyaan 1

Jika isi masing-masing elemen array `bil` diubah dengan angka 5.0, 12867, 7.5, 2000000, apa yang terjadi? Mengapa bisa demikian?

**Jawaban:**

Program akan mengalami error apabila array tetap menggunakan tipe data `int`. Hal ini karena tipe data `int` hanya dapat menyimpan bilangan bulat, sedangkan angka 5.0 dan 7.5 merupakan bilangan desimal.

Agar semua nilai dapat disimpan, tipe data array harus diubah menjadi `double`. Tipe data `double` dapat menyimpan bilangan bulat maupun bilangan desimal.

### Pertanyaan 2

Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array (tanpa `new int[4]` dan pengisian satu per satu).

**Jawaban:**

Array dapat langsung diinisialisasi pada saat deklarasi dengan menuliskan seluruh nilai elemen di dalam tanda kurung kurawal. Dengan cara tersebut, ukuran array akan menyesuaikan jumlah nilai yang diberikan sehingga tidak perlu menggunakan `new int[4]` dan mengisi setiap elemen secara terpisah.

### Pertanyaan 3

Ubah statement penampilan pada langkah ke-4 menjadi seperti berikut:

`System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));`

Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

**Jawaban:**

Jika menggunakan data array awal, yaitu 5, 13, -7, dan 17, output program adalah:

```text
bil[0] = 5, double = 10
bil[1] = 13, double = 26
bil[2] = -7, double = -14
bil[3] = 17, double = 34
```

Statement tersebut digunakan untuk menampilkan indeks array, nilai pada setiap elemen, serta hasil perkalian nilai tersebut dengan angka 2. Bagian `bil[i] * 2` berfungsi untuk menghitung dua kali nilai elemen array.

### Pertanyaan 4

Jika kondisi pada statement `for-loop` di atas diubah menjadi `i <= 4`, apa keluaran dari program? Mengapa demikian?

**Jawaban:**

Program akan menampilkan empat elemen array terlebih dahulu, kemudian mengalami error `ArrayIndexOutOfBoundsException` ketika mencoba mengakses indeks ke-4.

Hal ini terjadi karena array hanya memiliki empat elemen dengan indeks 0 sampai 3. Kondisi `i <= 4` membuat perulangan tetap berjalan ketika `i` bernilai 4, padahal indeks tersebut tidak tersedia.

### Pertanyaan 5

Apa perbedaan antara menampilkan array menggunakan for loop, foreach loop, dan `Arrays.toString()` pada langkah ke-5? Kapan sebaiknya masing-masing digunakan?

**Jawaban:**

1. **For loop:** Digunakan untuk menampilkan elemen array dengan mengakses indeksnya. Cocok digunakan ketika membutuhkan nomor indeks atau ingin mengubah elemen array.
2. **Foreach loop:** Digunakan untuk membaca setiap elemen array secara langsung tanpa mengakses indeks. Cocok untuk menampilkan atau memproses seluruh isi array.
3. **Arrays.toString():** Digunakan untuk menampilkan seluruh isi array dalam bentuk satu baris teks. Cocok untuk melihat isi array dengan cepat.

---

## 3.2 Percobaan 2: Studi Kasus SIAKAD — Input Nilai Mahasiswa dan Status Kelulusan

### Pertanyaan 1

Apa yang dimaksud dengan kondisi `i < nilaiAkhir.length` pada perulangan di atas?

**Jawaban:**

Kondisi `i < nilaiAkhir.length` digunakan untuk memastikan perulangan berjalan selama nilai indeks `i` masih lebih kecil dari jumlah elemen array.

Karena array `nilaiAkhir` memiliki 10 elemen, indeks yang dapat diakses adalah 0 sampai 9. Dengan kondisi tersebut, seluruh elemen dapat diproses tanpa melewati batas indeks array.

### Pertanyaan 2

Modifikasi program agar hanya menampilkan nilai mahasiswa yang lulus saja (nilai > 70), tanpa menampilkan yang tidak lulus. Jelaskan alur programnya!

**Jawaban:**

Program perlu menggunakan kondisi untuk memeriksa setiap nilai mahasiswa. Jika nilai lebih besar dari 70, mahasiswa tersebut dinyatakan lulus dan nilainya akan ditampilkan. Jika nilainya 70 atau kurang, data mahasiswa tidak ditampilkan.

Alur program dimulai dengan membaca setiap elemen array menggunakan perulangan. Kemudian, program memeriksa nilai mahasiswa satu per satu. Hanya mahasiswa yang memenuhi syarat kelulusan yang akan ditampilkan.

### Pertanyaan 3

Ubah perulangan pada langkah ke-4 dan ke-5 dari for loop menjadi foreach loop. Apakah seluruh bagian program dapat diubah menjadi foreach? Jelaskan bagian mana yang bisa dan tidak bisa, beserta alasannya.

**Jawaban:**

Tidak seluruh bagian program dapat diubah menjadi foreach secara langsung. Foreach dapat digunakan untuk membaca dan menampilkan isi array, tetapi kurang sesuai untuk mengisi array berdasarkan indeks tertentu.

Bagian input lebih tepat menggunakan `for loop` karena membutuhkan indeks untuk menentukan posisi nilai yang dimasukkan. Sementara itu, foreach lebih sesuai untuk membaca dan memproses setiap elemen array secara langsung tanpa menggunakan indeks.

### Pertanyaan 4

Modifikasi program agar turut menghitung dan menampilkan jumlah mahasiswa yang lulus dan jumlah mahasiswa yang tidak lulus di akhir program.

**Jawaban:**

Program dapat menggunakan dua variabel penghitung, yaitu `jumlahLulus` dan `jumlahTidakLulus`. Setiap nilai mahasiswa diperiksa menggunakan kondisi percabangan.

Jika nilai mahasiswa lebih besar dari 70, jumlah mahasiswa yang lulus bertambah satu. Sebaliknya, jika nilai mahasiswa 70 atau kurang, jumlah mahasiswa yang tidak lulus bertambah satu.

Setelah seluruh data diperiksa, program menampilkan jumlah mahasiswa yang lulus dan tidak lulus.

---

## 3.3 Percobaan 3: Operasi Aritmatika pada Array — Total, Rata-rata, Nilai Tertinggi dan Terendah

### Pertanyaan 1

Modifikasi kode program di atas agar dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki nilai lebih besar dari 70 (> 70).

**Jawaban:**

Untuk menghitung jumlah mahasiswa yang lulus, program menggunakan variabel penghitung yang dimulai dari angka 0. Setiap elemen array diperiksa berdasarkan ketentuan nilai lebih besar dari 70.

Jika nilai mahasiswa memenuhi ketentuan tersebut, jumlah mahasiswa yang lulus akan bertambah satu. Setelah seluruh elemen array diperiksa, program menampilkan jumlah mahasiswa yang lulus.

### Pertanyaan 2

Modifikasi program di atas sehingga program menerima jumlah elemen array berdasarkan input dari pengguna (tidak selalu 10), lalu tetap dapat menghitung total, rata-rata, nilai tertinggi, dan nilai terendah dengan benar.

**Jawaban:**

Program dapat menerima jumlah mahasiswa melalui input pengguna. Jumlah tersebut kemudian digunakan untuk menentukan ukuran array sehingga jumlah elemen tidak selalu harus 10.

Setelah ukuran array ditentukan, pengguna memasukkan nilai setiap mahasiswa. Seluruh nilai disimpan dalam array dan dijumlahkan untuk memperoleh total nilai.

Rata-rata diperoleh dengan membagi total nilai dengan jumlah mahasiswa. Sementara itu, nilai tertinggi dan terendah ditentukan dengan membandingkan setiap elemen array. Dengan demikian, program tetap dapat melakukan seluruh perhitungan meskipun jumlah mahasiswa berubah.

### Pertanyaan 3

Mengapa pada perhitungan rata-rata digunakan `(double) total / nilaiMhs.length`, bukan langsung `total / nilaiMhs.length`? Jelaskan!

**Jawaban:**

Karena `(double) total` digunakan untuk mengubah tipe data `total` dari integer menjadi double sebelum dilakukan pembagian. Hal ini bertujuan agar hasil pembagian dapat menghasilkan angka desimal.

Jika langsung menggunakan `total / nilaiMhs.length`, pembagian dilakukan sebagai pembagian bilangan bulat sehingga angka di belakang koma akan dihilangkan.

Contoh:

Jika total nilai adalah 365 dan jumlah mahasiswa adalah 4, maka:

- Pembagian bilangan bulat menghasilkan 91.0.
- Pembagian menggunakan tipe data double menghasilkan 91.25.

Dengan demikian, penggunaan `(double)` membuat hasil rata-rata lebih akurat karena bagian desimal tetap diperhitungkan.

---

## 3.4 Percobaan 4: Pencarian (Searching) dan Pengurutan (Sorting) Sederhana

### Pertanyaan 1

Jelaskan maksud dari statement `break;` pada kode program Bagian A di atas!

**Jawaban:**

Statement `break;` digunakan untuk menghentikan perulangan secara langsung ketika nilai yang dicari (`key`) berhasil ditemukan.

Pada program linear search, setelah elemen array sama dengan nilai `key`, program menampilkan indeks elemen tersebut, mengubah status pencarian menjadi ditemukan, kemudian menghentikan perulangan agar tidak perlu memeriksa elemen berikutnya.

### Pertanyaan 2

Modifikasi kode program Bagian A sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari dari pengguna, lalu mencetak indeks posisi elemen dari nilai (key) tersebut.

**Jawaban:**

Program perlu menerima tiga jenis input dari pengguna, yaitu jumlah elemen array, nilai setiap elemen, dan nilai yang ingin dicari atau disebut `key`.

Setelah seluruh nilai dimasukkan, program melakukan pencarian menggunakan algoritma linear search dengan memeriksa setiap elemen array secara berurutan. Jika nilai yang dicari ditemukan, program menampilkan indeks tempat nilai tersebut berada.

Jika nilai tidak ditemukan setelah seluruh elemen diperiksa, program menampilkan pesan bahwa nilai tersebut tidak tersedia di dalam array.

### Pertanyaan 3

Modifikasi program Bagian A agar menampilkan pesan "Nilai yang dicari tidak ditemukan" dengan format pesan yang lebih informatif apabila nilai yang dicari (key) tidak ada di dalam array.

**Jawaban:**

Program dapat menggunakan variabel boolean untuk mengetahui apakah nilai yang dicari tersedia di dalam array.

Jika nilai ditemukan, program menampilkan nilai dan indeks tempat nilai tersebut berada. Namun, apabila seluruh elemen sudah diperiksa dan nilai tidak ditemukan, program menampilkan pesan yang lebih informatif.

Contoh output:

```text
Nilai yang dicari, yaitu 100, tidak ditemukan dalam array.
```

Dengan demikian, pengguna dapat mengetahui nilai apa yang sedang dicari dan bahwa nilai tersebut tidak tersedia dalam array.

### Pertanyaan 4

Jelaskan langkah demi langkah cara kerja algoritma bubble sort pada Bagian B menggunakan data uji coba yang tersedia!

**Jawaban:**

Bubble sort merupakan algoritma pengurutan yang bekerja dengan membandingkan dua elemen array yang bersebelahan. Jika urutannya tidak sesuai, kedua elemen tersebut akan ditukar.

Data awal:

```text
[78, 65, 90, 55, 88, 72]
```

Proses pengurutan dari nilai terkecil ke terbesar:

**Iterasi ke-1:**

```text
[65, 78, 55, 88, 72, 90]
```

**Iterasi ke-2:**

```text
[65, 55, 78, 72, 88, 90]
```

**Iterasi ke-3:**

```text
[55, 65, 72, 78, 88, 90]
```

**Iterasi ke-4:**

```text
[55, 65, 72, 78, 88, 90]
```

**Iterasi ke-5:**

```text
[55, 65, 72, 78, 88, 90]
```

Hasil akhir:

```text
[55, 65, 72, 78, 88, 90]
```

Pada setiap iterasi, elemen yang lebih besar akan bergeser ke sebelah kanan melalui proses pertukaran. Proses tersebut dilakukan berulang kali hingga seluruh elemen tersusun dari nilai terkecil ke terbesar.

### Pertanyaan 5

Modifikasi program Bagian B agar mengurutkan array dari nilai terbesar ke terkecil (descending), bukan dari terkecil ke terbesar.

**Jawaban:**

Untuk mengurutkan array secara descending, proses perbandingan dilakukan dengan memindahkan elemen yang lebih besar ke sebelah kiri dan elemen yang lebih kecil ke sebelah kanan.

Perbedaannya terletak pada urutan perbandingan elemen. Pada pengurutan ascending, elemen yang lebih besar dipindahkan ke kanan. Sedangkan pada pengurutan descending, elemen yang lebih kecil dipindahkan ke kanan.

Dengan demikian, hasil pengurutan data awal adalah:

```text
[90, 88, 78, 72, 65, 55]
```

---

# SELESAI