1. PENJELASAN PROGRAM

Di bagian ini saya akan memberikan gambar dari blok blok kode yang saya pakai di program saya beserta penjelasan singkat per blok kodenya

![blokDataParfume](./assets/blokCode/blokDataParfume.png)

import java.util.\* digunakan untuk mengimport semua package java.util seperti arraylist, scanner, dll

Membuat class utama parfum yang bersifat public agar bisa diakses di luar kelas

Membuat class DataParfum yang berisi atribut nama, isi, dan harga yang bersifat private agar tidak bisa diakses di luar kelas

Membuat constructor kosong untuk membuat objek DataParfum tanpa langsung mengisi data

![blokGetterSetter(1)](<./assets/blokCode/blokGetterSetter(1).png>)

![blokGetterSetter(2)](<./assets/blokCode/blokGetterSetter(2).png>)

Memakai method getter untuk mengambil nilai nama, isi dan harga yang semuanya bersifat public

Memakai method setter untuk untuk mengisi nilai dari nama, isi dan harga yang diisi boolean untuk mengembalikan hasil true atau false dan semuanya bersifat public

Setiap method setter memiliki kondisinya sendiri dimana untuk nama parfum tidak boleh kosong, harga parfum harus lebih dari 0, dan isi parfum harus lebih dari 0, jika kondisi terpenuhi maka akan menghasilkan nilai true

![blokMain](./assets/blokCode/blokMain.png)

Membuat arraylist bernama daftarParfum yang fungsinya untuk menyimpan banyak data parfum

Scanner digunakan untuk menerima input dari user

Blok main merupakan method pertama yang dijalankan saat program dimulai

![blokMenu](./assets/blokCode/blokMenu.png)

Method yang berfungsi untuk menampilkan menu utama

Dapat menyimpan angka pilihan menu dari user di variabel pilihan bertipe int, semisal user input angka 1 maka akan masuk ke case 1

Menggunakan perulangan do-while agar program terus berjalan dan halaman menu nya minimal muncul dulu sekali, program akan terus mengulang selama user tidak menginput angka 5

Jika user memilih angka 1 maka method tambah akan dijalankan

Jika user memilih angka 2 maka method tampil akan dijalankan

Jika user memilih angka 3 maka method update akan dijalankan

Jika user memilih angka 4 maka method hapus akan dijalankan

Jika user memilih angka 5 maka program akan berhenti dan menampilkan pesan Program selesai

Jika user memilih angka selain angka 1, 2, 3, 4, dan 5 maka program akan menampilkan pesan Pilihan tidak valid dan akan tetap looping

![blokVoidTambah](./assets/blokCode/blokVoidTambah.png)

Method tambah digunakan untuk menambah parfum baru

Membuat objek parfum dari class DataParfum, lalu membuat perulangan while (true) agar perulangannya terus terjadi sampai inputan valid

User diminta memasukkan nama, harga, dan isi parfum, inputan dari user akan dikirim ke masing-masing setter yang berhubungan dan akan di cek melalui kondisi setternya masing-masing, jika hasilnya true maka inputan akan valid dan tersimpan

Method ini merupakan public karena method ini aman untuk dipanggil di luar class

![blokVoidTampil](./assets/blokCode/blokVoidTampil.png)

Method tampil digunakan untuk menampilkan daftar parfum saat ini

Sebelum menampilkan data parfum, dia akan mengecek dulu apakah datanya kosong apa tidak, kalau kosong maka akan menampilkan pesan Data parfum masih kosong

Kalau ada isinya maka dia akan membuat variabel nomor bertipe int yang hasilnya 1 cuma untuk memberi nomot urut saja pada data yang mau ditampilkan

Terdapat perulangan for yang berfungsi untuk mengambil data satu per satu dari daftarParfum dan menambah variabel nomor sebanyak 1 setiap perulangannya selesai, misal awalnya nomor = 1, setelah parfum pertama keluar, maka 1 + 1 = 2 untuk data parfum kedua, dst

Terakhir menampilkan hasilnya dengan mengimplementasikan konsep getter

Method ini bersifat protected karena secara fungsi, tampil() bisa dianggap method yang masih boleh diwariskan jika nanti ada class turunan

![blokVoidUpdate(1)](<./assets/blokCode/blokVoidUpdate(1).png>)

![blokVoidUpdate(2)](<./assets/blokCode/blokVoidUpdate(2).png>)

Berfungsi untuk mengubah data parfum yang sudah ada di ArrayList

Sebelum mengupdate data parfum, dia akan mengecek dulu apakah datanya kosong apa tidak, kalau kosong maka akan menampilkan pesan Data parfum masih kosong

Kalau ada isinya maka dia akan menampilkan dulu semua data parfum saat ini dengan method tampil()

Kemudian kita bisa memasukkan angka untuk memilih data parfum mana yang ingin kita update, dengan kondisi user tidak boleh memasukkan angka kurang dari 1 atau user memasukkan angka lebih besar dari jumlah data yang ada

Setelah semua kondisi terpenuhi, kita bisa memasukkan nama, harga, dan isi baru dan program akan menggantinya dengan mengimplementasikan konsep setter

Method ini bersifat private karena sser tidak berinteraksi langsung dengan method ini dari luar class

![blokVoidHapus](./assets/blokCode/blokVoidHapus.png)

Berfungsi untuk menghapus data parfum yang sudah ada di ArrayList

Sebelum menghapus data parfum, dia akan mengecek dulu apakah datanya kosong apa tidak, kalau kosong maka akan menampilkan pesan Data parfum masih kosong

Kalau ada isinya maka dia akan menampilkan dulu semua data parfum saat ini dengan method tampil()

Kemudian kita bisa memasukkan angka untuk memilih data parfum mana yang ingin kita hapus, dengan kondisi user tidak boleh memasukkan angka kurang dari 1 atau user memasukkan angka lebih besar dari jumlah data yang ada

Setelah semua kondisi terpenuhi, maka parfum yang dipilih akan terhapus\

Method hapus cocok memakai modifier default karena hapus() tetap bisa dipakai di class yang sama atau package yang sama, tetapi tidak dibuka penuh seperti public

2. HASIL OUTPUT

![blokMenu](./assets/tampilanProgram/HalamanAwal.png)

Tampilan halaman awal

![blokTambah](./assets/tampilanProgram/Tambah.png)

Tampilan tambah parfum

![blokTampil](./assets/tampilanProgram/Tampil.png)

Menampilkan parfum

![blokUpdate](./assets/tampilanProgram/Update.png)

Tampilan update parfum

![blokHapus](./assets/tampilanProgram/Hapus.png)

Tampilan hapus parfum

![blokKeluar](./assets/tampilanProgram/Keluar.png)

Tampilan keluar program
