package parfum;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Parfum {
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

    abstract protected void Output();

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
            System.out.println("5. Tampilkan Berdasarkan Jenis");
            System.out.println("6. Keluar Program");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambah(daftarParfum, input);
                case 2 -> tampil(daftarParfum);
                case 3 -> update(daftarParfum, input);
                case 4 -> hapus(daftarParfum, input);
                case 5 -> {
                    System.out.print("Masukkan jenis: ");
                    String jenis = input.nextLine();
                    tampil(daftarParfum, jenis);
                }
                case 6 -> System.out.println("Program selesai");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 6);

        input.close();
    }

    static void tambah(ArrayList<Parfum> daftarParfum, Scanner input) {
        Parfum p = inputDataParfum(input);
        if (p != null) {
            daftarParfum.add(p);
            System.out.println("Data berhasil ditambahkan");
        }
    }

    static Parfum inputDataParfum(Scanner input) {
        Parfum parfumBaru;

        System.out.print("Masukkan jenis (pria/wanita/unisex): ");
        String jenis = input.nextLine();

        switch (jenis) {
            case "pria" -> parfumBaru = new ParfumPria();
            case "wanita" -> parfumBaru = new ParfumWanita();
            case "unisex" -> parfumBaru = new ParfumUnisex();
            default -> {
                System.out.println("Jenis tidak valid");
                return null;
            }
        }

        parfumBaru.setJenis(jenis);

        while (true) {
            System.out.print("Nama Parfum: ");
            if (parfumBaru.setNama(input.nextLine()))
                break;
        }

        while (true) {
            System.out.print("Harga Parfum: ");
            int harga = input.nextInt();
            input.nextLine();
            if (parfumBaru.setHarga(harga))
                break;
        }

        while (true) {
            System.out.print("Isi Parfum (ml): ");
            int isi = input.nextInt();
            input.nextLine();
            if (parfumBaru.setIsi(isi))
                break;
        }

        return parfumBaru;
    }

    static void tampil(ArrayList<Parfum> daftarParfum) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data Masih Kosong");
            return;
        }

        int no = 1;
        for (Parfum p : daftarParfum) {
            System.out.println("\nData ke " + no);
            p.Output();
            no++;
        }
    }

    static void tampil(ArrayList<Parfum> daftarParfum, String jenis) {
        for (Parfum p : daftarParfum) {
            if (p.getJenis().equalsIgnoreCase(jenis)) {
                p.Output();
            }
        }
    }

    static void update(ArrayList<Parfum> list, Scanner input) {
        tampil(list);
        System.out.print("Pilih nomor: ");
        int i = input.nextInt();
        input.nextLine();

        Parfum baru = inputDataParfum(input);
        list.set(i - 1, baru);
    }

    static void hapus(ArrayList<Parfum> list, Scanner input) {
        tampil(list);
        System.out.print("Pilih nomor: ");
        int i = input.nextInt();
        input.nextLine();

        list.remove(i - 1);
    }
}