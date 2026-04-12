package parfum;

import java.util.ArrayList;
import java.util.Scanner;

public class Parfum {
    private String nama;
    private String jenis;
    private int harga;
    private int isi;

    public Parfum() {
    }

    public Parfum(String nama, String jenis, int harga, int isi) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.isi = isi;
    }

    public String getNama() {
        return nama;
    }

    public boolean setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama parfum tidak boleh kosong");
            return false;
        }
        this.nama = nama;
        return true;
    }

    public String getJenis() {
        return jenis;
    }

    public boolean setJenis(String jenis) {
        if (jenis == null || jenis.trim().isEmpty()) {
            System.out.println("Jenis parfum tidak boleh kosong");
            return false;
        }
        this.jenis = jenis;
        return true;
    }

    public int getHarga() {
        return harga;
    }

    public boolean setHarga(int harga) {
        if (harga <= 0) {
            System.out.println("Harga parfum harus lebih dari 0");
            return false;
        }
        this.harga = harga;
        return true;
    }

    public int getIsi() {
        return isi;
    }

    public boolean setIsi(int isi) {
        if (isi <= 0) {
            System.out.println("Isi parfum harus lebih dari 0 ml");
            return false;
        }
        this.isi = isi;
        return true;
    }

    protected void Output() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Harga : " + harga);
        System.out.println("Isi   : " + isi + " ml");
    }

    public static void mainMenu() {
        ArrayList<Parfum> daftarParfum = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PARFUM =====");
            System.out.println("1. Tambah Parfum");
            System.out.println("2. Tampilkan Data Parfum");
            System.out.println("3. Update Data Parfum");
            System.out.println("4. Hapus Data Parfum");
            System.out.println("5. Tampilkan Berdasarkan Jenis Parfum");
            System.out.println("6. Keluar Program");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambah(daftarParfum, input);
                    break;
                case 2:
                    tampil(daftarParfum);
                    break;
                case 3:
                    update(daftarParfum, input);
                    break;
                case 4:
                    hapus(daftarParfum, input);
                    break;
                case 5:
                    System.out.print("Masukkan jenis parfum (pria/wanita/unisex): ");
                    String jenis = input.nextLine();
                    tampil(daftarParfum, jenis);
                    break;
                case 6:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 6);

        input.close();
    }

    static void tambah(ArrayList<Parfum> daftarParfum, Scanner input) {
        Parfum parfumBaru = inputDataParfum(input);
        if (parfumBaru != null) {
            daftarParfum.add(parfumBaru);
            System.out.println("Data berhasil ditambahkan");
        }
    }

    static Parfum inputDataParfum(Scanner input) {
        Parfum parfumBaru;

        System.out.print("Masukkan jenis parfum (pria/wanita/unisex): ");
        String jenis = input.nextLine();

        switch (jenis) {
            case "pria":
                parfumBaru = new ParfumPria();
                break;
            case "wanita":
                parfumBaru = new ParfumWanita();
                break;
            case "unisex":
                parfumBaru = new ParfumUnisex();
                break;
            default:
                System.out.println("Jenis tidak valid!");
                return null;
        }

        parfumBaru.setJenis(jenis);

        while (true) {
            System.out.print("Masukkan nama parfum: ");
            String nama = input.nextLine();
            if (parfumBaru.setNama(nama))
                break;
        }

        while (true) {
            System.out.print("Masukkan harga parfum: ");
            int harga = input.nextInt();
            input.nextLine();
            if (parfumBaru.setHarga(harga))
                break;
        }

        while (true) {
            System.out.print("Masukkan isi parfum (ml): ");
            int isi = input.nextInt();
            input.nextLine();
            if (parfumBaru.setIsi(isi))
                break;
        }

        return parfumBaru;
    }

    static void tampil(ArrayList<Parfum> daftarParfum) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        int nomor = 1;
        for (Parfum parfum : daftarParfum) {
            System.out.println("\nData ke " + nomor);
            parfum.Output();
            nomor++;
        }
    }

    static void tampil(ArrayList<Parfum> daftarParfum, String jenis) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        int nomor = 1;
        for (Parfum parfum : daftarParfum) {
            if (parfum.getJenis().equalsIgnoreCase(jenis)) {
                System.out.println("\nData ke " + nomor);
                parfum.Output();
                nomor++;
            }
        }
    }

    static void update(ArrayList<Parfum> daftarParfum, Scanner input) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil(daftarParfum);
        System.out.print("\nMasukkan nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        System.out.println("\nMasukkan data parfum baru:");
        Parfum parfumBaru = inputDataParfum(input);

        daftarParfum.set(index - 1, parfumBaru);
        System.out.println("Data berhasil diupdate");
    }

    static void hapus(ArrayList<Parfum> daftarParfum, Scanner input) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil(daftarParfum);
        System.out.print("\nMasukkan nomor data yang ingin dihapus: ");
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