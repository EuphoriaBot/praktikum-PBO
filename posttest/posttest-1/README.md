1. PENJELASAN PROGRAM

Di bagian ini saya akan memberikan gambar dari blok blok kode yang saya pakai di program saya beserta penjelasan singkat per blok kodenya

![blokImport](./assets/blokCode/blokImport.png)

import java.util.\* digunakan untuk mengimport semua package java.util seperti arraylist, scanner, dll

Merupakan class utama bernama DataParfum yang menjadi tempat seluruh program ditulis

![blokDataParfume](./assets/blokCode/blokDataParfume.png)

Blok ini digunakan sebagai template parfum

Setiap objek dari DataParfum memiliki 3 atribut dengan jenis tipe datanya masing masing

Terdapat constructor DataParfum dengan nama, harga, dan isi yang berfungsi untuk mengisi data saat objek dibuat

Di dalam blok constructor ini terdapat kode seperti :
this.nama = nama;

Maksudnya adalah dia mengisi atribut nama milik objeknya dengan nilai nama yang dikirim ke constructornya, jadi nilai dari parameter nama ini akan disimpan ke atribut nama

Untuk kode this.harga = harga; dan this.isi = isi; itu fungsinya sama dengan yang kode nama tadi cuma beda parameter aja

![blokArrayList](./assets/blokCode/blokArrayList.png)

Membuat arraylist bernama daftarParfum yang fungsinya untuk menyimpan banyak data parfum

Scanner digunakan untuk menerima input dari user

![blokVoidMain](./assets/blokCode/blokVoidMain.png)

Merupakan method pertama yang dijalankan saat program dimulai

![blokVoidMenu](./assets/blokCode/blokVoidMenu.png)

Method yang berfungsi untuk menampilkan menu utama

Dapat menyimpan angka pilihan menu dari user di variabel pilihan bertipe int, semisal user input angka 1 maka akan masuk ke case 1

Menggunakan perulangan do-while agar program terus berjalan dan halaman menu nya minimal muncul dulu sekali, program akan terus mengulang selama user tidak menginput angka 5

Jika user memilih angka 1 maka method tambah akan dijalankan
Jika user memilih angka 2 maka method tampil akan dijalankan
Jika user memilih angka 3 maka method update akan dijalankan
Jika user memilih angka 4 maka method hapus akan dijalankan
Jika user memilih angka 5 maka program akan berhenti dan menampilkan pesan Program selesai
Jika user memilih angka selain angka 1, 2, 3, 4, dan 5 maka program akan menampilkan pesan Pilihan tidak valid dan akan tetap looping

![tampilanAwal](./assets/tampilanProgram/tampilanAwal.png)
Tetstaydyabdyuanidanwidnawd
