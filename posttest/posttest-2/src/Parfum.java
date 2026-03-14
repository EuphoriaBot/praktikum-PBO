import java.util.*;

public class Parfum {

    class DataParfum {
        private String nama;
        private int harga;
        private int isi;

        public DataParfum(String nama, int harga, int isi) {
            this.nama = nama;
            this.harga = harga;
            this.isi = isi;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public int getIsi() {
            return isi;
        }

        public void setIsi(int isi) {
            this.isi = isi;
        }
    }

    ArrayList<DataParfum> daftarParfum = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Parfum app = new Parfum();
        app.menu();
    }

    void menu() {
        int pilihan;

        do {
            System.out.println("MENU PARFUM");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Program");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    hapus();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }

    public void tambah() {
        System.out.print("Masukkan nama parfum: ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga parfum: ");
        int harga = input.nextInt();

        System.out.print("Masukkan isi parfum (ml): ");
        int isi = input.nextInt();
        input.nextLine();

        daftarParfum.add(new DataParfum(nama, harga, isi));
        System.out.println("Data berhasil ditambahkan");
    }

    protected void tampil() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        int nomor = 1;
        for (DataParfum parfum : daftarParfum) {
            System.out.println("Data ke " + nomor);
            System.out.println("Nama  : " + parfum.getNama());
            System.out.println("Harga : " + parfum.getHarga());
            System.out.println("Isi   : " + parfum.getIsi() + " ml");
            System.out.println();
            nomor++;
        }
    }

    private void update() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        DataParfum parfum = daftarParfum.get(index - 1);

        System.out.print("Masukkan nama parfum baru: ");
        String namaBaru = input.nextLine();

        System.out.print("Masukkan harga baru: ");
        int hargaBaru = input.nextInt();

        System.out.print("Masukkan isi baru (ml): ");
        int isiBaru = input.nextInt();
        input.nextLine();

        parfum.setNama(namaBaru);
        parfum.setHarga(hargaBaru);
        parfum.setIsi(isiBaru);

        System.out.println("Data berhasil diupdate");
    }

    void hapus() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        daftarParfum.remove(index - 1);
        System.out.println("Data berhasil dihapus");
    }
}