package posttest3pbo;

import java.io.*;
import java.util.*;

public class Posttest3PBO {
    
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Digital> dgtl = new ArrayList<>();
    static ArrayList<Analog> anlg = new ArrayList<>();
    static ArrayList<User> dataUser = new ArrayList<>();
    static ArrayList<Transaksi> dataTransaksi = new ArrayList<>();
    static String userAktif;
    
    public static void main(String[] args) throws IOException {
        User admin = new User("admin", "admin", "null", "null");
        dataUser.add(admin);
        
        Digital addDgtl = new Digital("High Tide BLACK", "Nixon", "D1G0", "Black", 250000, 200, "LED Light, Stopwatch, Temperature");
        dgtl.add(addDgtl);
        
        Analog addAnlg = new Analog("High Tide BLACK", "Nixon", "4N40", "Black", 250000, 200, "Date");
        anlg.add(addAnlg);
        
        String pilih = "a";
        
        while(!"E".equals(pilih)) {
            System.out.println("""
                               O===============================O
                               |         Eleganz Watch         |
                               O===============================O
                               | 1. Registration               |
                               | 2. Login                      |
                               | E. Exit                       |
                               O===============================O""");
            System.out.print("  Input choice : ");
            pilih = input.readLine();
            if(null == pilih){
                System.out.println("O===============================O");
                System.out.println("|        Invalid choice!        |");
                System.out.println("O===============================O");
                
            } else switch (pilih) {
                
                case "1" -> regis();
                    
                case "2" -> {
                    if (login() == true){
                        System.out.println("");
                    } else {
                        System.out.println("  Account not found!!! ");
                    }
                    break;
                }
                    
                case "E" -> {
                    System.out.println("O===============================O");
                    System.out.println("|    Thank you for visiting!    |");
                    System.out.println("O===============================O");
                }
                    
                default -> {
                    System.out.println("O===============================O");
                    System.out.println("|        Invalid choice!        |");
                    System.out.println("O===============================O");
                }
            }
        }
    }
    
    public static int kodeDigital(){
        int x = 0;
        if(dgtl.size() < 1){
            x = 0;
        } else {
            for (int i = 0; i < dgtl.size(); i++){
                x++;
            }
        }
        return x;
    }
    
    public static int kodeAnalog(){
        int x = 0;
        if(anlg.size() < 1){
            x = 0;
        } else {
            for (int i = 0; i < anlg.size(); i++){
                x++;
            }
        }
        return x;
    }
    
    public static void regis() throws IOException{
        String user, pass, alamat, email;
        
        System.out.println("""
                               O================================O
                               |          Registration          |
                               O================================O""");
        System.out.print("  Username : ");
        user = input.readLine();
        System.out.print("  Password : ");
        pass = input.readLine();
        System.out.print("  Address  : ");
        alamat = input.readLine();
        System.out.print("  Email    : ");
        email = input.readLine();
        System.out.println("  Successful Registration!!! ");
        User addUser = new User(user, pass, alamat, email);
        dataUser.add(addUser);
    }
    
    public static boolean login() throws IOException{
        String user, pass;
        System.out.println("""
                               O===============================O
                               |      Login Eleganz Watch      |
                               O===============================O""");
        System.out.print("  Username : ");
        user = input.readLine();
        System.out.print("  Password : ");
        pass = input.readLine();
        for (User cekUser : dataUser) {
            if (cekUser.getUsername().equals(user) && cekUser.getPassword().equals(pass)){
                if (dataUser.get(0).getUsername().equals(user) && dataUser.get(0).getPassword().equals(pass)){
                    System.out.println("  Welcome Admin!!!");
                    menuAdmin();
                    return true;
                } else {
                    System.out.println("  Welcome " + user);
                    userAktif = user;
                    menuUser();
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void menuAdmin() throws IOException{
        String pilih1 = "a";
        while(!"E".equals(pilih1)) {
            System.out.println("""
                               O===============================O
                               |             Admin             |
                               O===============================O
                               | 1. Display Data               |
                               | 2. Add Watch                  |
                               | 3. Edit Watch                 |
                               | 4. Delete Watch               |
                               | E. Exit                       |
                               O===============================O""");
            System.out.print("  Input choice : ");
            pilih1 = input.readLine();
            switch(pilih1){

                case "1" -> {
                    System.out.println("""
                               O==============================O
                               |         Display Data         |
                               O==============================O
                               | 1. User                      |
                               | 2. Watch                     |
                               | E. Exit                      |
                               O==============================O""");
                    System.out.print("  Input choice : ");
                    String pilih = input.readLine();
                    if(null == pilih){
                        System.out.println("O===============================O");
                        System.out.println("|        Invalid choice!        |");
                        System.out.println("O===============================O");

                    } else switch (pilih) {

                        case "1" -> lihatUser();

                        case "2" -> lihat();

                        case "E" -> {
                            System.out.println("O===============================O");
                            System.out.println("|    Thank you for visiting!    |");
                            System.out.println("O===============================O");
                        }

                        default -> {
                            System.out.println("O===============================O");
                            System.out.println("|        Invalid choice!        |");
                            System.out.println("O===============================O");
                        }
                    }
                    break;
                }

                case "2" -> {
                    tambah();
                    break;
                }

                case "3" -> {
                    ubah();
                    break;
                }

                case "4" -> {
                    hapus();
                    break;
                }

                case "E" -> {
                    System.out.println("O===============================O");
                    System.out.println("|    Thank you for visiting!    |");
                    System.out.println("O===============================O");
                    break;
                }

                default -> {
                    System.out.println("O===============================O");
                    System.out.println("|        Invalid choice!        |");
                    System.out.println("O===============================O");
                    break;
                }
            }
        }
    }
    
    public static void menuUser() throws IOException{
        
        String pilih1 = "a";
        
        while(!"E".equals(pilih1)) {
            System.out.println("""
                               O===============================O
                               |         Eleganz Watch         |
                               O===============================O
                               | 1. Display                    |
                               | 2. Buy                        |
                               | 3. Payment                    |
                               | E. Exit                       |
                               O===============================O""");
            System.out.print("  Input choice : ");
            pilih1 = input.readLine();
            switch(pilih1){

                case "1" -> {
                    lihat();
                    break;
                }

                case "2" -> {
                    beli();
                    break;
                }

                case "3" -> {
                    bayar();
                    break;
                }

                case "E" -> {
                    System.out.println("O===============================O");
                    System.out.println("|    Thank you for visiting!    |");
                    System.out.println("O===============================O");
                    break;
                }

                default -> {
                    System.out.println("O===============================O");
                    System.out.println("|        Invalid choice!        |");
                    System.out.println("O===============================O");
                    break;
                }
            }
        }
    }
    
    public static void lihatUser(){
        System.out.println("""
                            O==============================O
                            |             User             |
                            O==============================O""");
        for (int i = 1; i < dataUser.size(); i++){
            System.out.println("  Username           : " + dataUser.get(i).getUsername());
            System.out.println("  Password           : " + dataUser.get(i).getPassword());
            System.out.println("  Address            : " + dataUser.get(i).getAddress());
            System.out.println("  Email              : " + dataUser.get(i).getEmail());
            System.out.println("--------------------------------");
        }
        System.out.println("O==============================O");
    }
    
    public static void lihat() throws IOException{
        String pilihtipe = "a";
        while(!"E".equals(pilihtipe)){
            System.out.println("""
                                O===============================O
                                |         Display Watch         |
                                O===============================O
                                | 1. Digital Watch              |
                                | 2. Analog Watch               |
                                | E. Exit                       |
                                O===============================O""");
            System.out.print("  Input choice : ");
            pilihtipe = input.readLine();
            if (null == pilihtipe){
                System.out.println(" Wrong Input! ");
            } else switch (pilihtipe) {
                case "1", "Digital" -> {
                    if(dgtl.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O===============================O
                                            |         Digital Watch         |
                                            O===============================O""");
                        for (int i = 0; i < dgtl.size(); i++){
                            System.out.println("[" + (i+1) +  "] Code          : " + dgtl.get(i).getKode());
                            System.out.println("    Name          : " + dgtl.get(i).getNama());
                            System.out.println("    Merk          : " + dgtl.get(i).getMerk());
                            System.out.println("    Color         : " + dgtl.get(i).getWarna());
                            System.out.println("    Fitur         : " + dgtl.get(i).getFitur());
                            System.out.println("    Price         : Rp." + dgtl.get(i).getHarga());
                            System.out.println("    Quantity      : " + dgtl.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                    }
                }
                case "2", "Analog" -> {
                    if(anlg.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O==============================O
                                            |         Analog Watch         |
                                            O==============================O""");
                        for (int i = 0; i < anlg.size(); i++){
                            System.out.println("[" + (i+1) +  "] Code          : " + anlg.get(i).getKode());
                            System.out.println("    Name          : " + anlg.get(i).getNama());
                            System.out.println("    Merk          : " + anlg.get(i).getMerk());
                            System.out.println("    Color         : " + anlg.get(i).getWarna());
                            System.out.println("    Fitur         : " + anlg.get(i).getFitur());
                            System.out.println("    Price         : Rp." + anlg.get(i).getHarga());
                            System.out.println("    Quantity      : " + anlg.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                    }
                }
                    
                case "E" -> System.out.println("");
                default -> System.out.println(" Wrong Input! ");
            }
        }
    }
    
    public static void tambah() throws IOException{
        String pilihtipe = "a", nama, merk, kode, warna;
        int stok, harga;
        
        while(!"E".equals(pilihtipe)){
            System.out.println("""
                                O===============================O
                                |           Add Watch           |
                                O===============================O
                                | 1. Digital Watch              |
                                | 2. Analog Watch               |
                                | E. Exit                       |
                                O===============================O""");
            System.out.print("  Input choice : ");
            pilihtipe = input.readLine();
            if (null == pilihtipe){
                System.out.println(" Wrong Input! ");
                
            } else switch (pilihtipe) {
                case "1", "Digital" -> {
                    System.out.println("""
                               O================================O
                               |            Add Watch           |
                               O================================O""");
                    System.out.print("  Name               : ");
                    nama = input.readLine();
                    System.out.print("  Merk               : ");
                    merk = input.readLine();
                    
                    int kodeDgtl = kodeDigital();
                    kode = "D1G"+ kodeDgtl;
                    
                    System.out.print("  Color              : ");
                    warna = input.readLine();
                    System.out.print("  Fitur              : ");
                    String fitur = input.readLine();
                    System.out.print("  Price              : Rp.");
                    harga = Integer.parseInt(input.readLine());
                    System.out.print("  Quantity           : ");
                    stok = Integer.parseInt(input.readLine());

                    Digital addDigital = new Digital(nama, merk, kode, warna, harga, stok, fitur);
                    dgtl.add(addDigital);
                    break;
                }
                
                case "2", "Analog" -> {
                    System.out.println("""
                               O================================O
                               |            Add Watch           |
                               O================================O""");
                    System.out.print("  Name               : ");
                    nama = input.readLine();
                    System.out.print("  Merk               : ");
                    merk = input.readLine();
                    
                    int kodeAnlg = kodeAnalog();
                    kode = "4N4"+ kodeAnlg;
                    
                    System.out.print("  Color              : ");
                    warna = input.readLine();
                    System.out.print("  Fitur              : ");
                    String fitur = input.readLine();
                    System.out.print("  Price              : Rp.");
                    harga = Integer.parseInt(input.readLine());
                    System.out.print("  Quantity           : ");
                    stok = Integer.parseInt(input.readLine());

                    Analog addAnalog = new Analog(nama, merk, kode, warna, harga, stok, fitur);
                    anlg.add(addAnalog);
                    break;
                }
                    
                case "E" -> {System.out.println(""); break;}
                
                default -> {System.out.println("  Wrong Type, Input Again!!!"); break;}
            }
        }
    }
    
    public static void ubah() throws IOException{
        String pilihtipe = "a", nama, merk, kode, warna;
        int stok, harga;
        
        while(!"E".equals(pilihtipe)){
            System.out.println("""
                                O==============================O
                                |          Edit Watch          |
                                O==============================O
                                | 1. Digital Watch             |
                                | 2. Analog Watch              |
                                | E. Exit                      |
                                O==============================O""");
            System.out.print("  Input choice : ");
            pilihtipe = input.readLine();
            if (null == pilihtipe){
                System.out.println(" Wrong Input! ");
            } else switch (pilihtipe) {
                case "1", "Digital" -> {
                    if(dgtl.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O===============================O
                                            |         Digital Watch         |
                                            O===============================O""");
                        for (int i = 0; i < dgtl.size(); i++){
                            System.out.println("  Code               : " + dgtl.get(i).getKode());
                            System.out.println("  Name               : " + dgtl.get(i).getNama());
                            System.out.println("  Merk               : " + dgtl.get(i).getMerk());
                            System.out.println("  Color              : " + dgtl.get(i).getWarna());
                            System.out.println("  Fitur              : " + dgtl.get(i).getFitur());
                            System.out.println("  Price              : Rp." + dgtl.get(i).getHarga());
                            System.out.println("  Quantity           : " + dgtl.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        System.out.print(" Input Code : ");
                        String no = input.readLine();
                        for (Digital jamDigital : dgtl) {
                            if (jamDigital.getKode().equals(no)){
                                int kodeDgtl = kodeDigital();
                                kode = "D1G"+ kodeDgtl;

                                System.out.print("  Name               : ");
                                nama = input.readLine();
                                System.out.print("  Merk               : ");
                                merk = input.readLine();
                                System.out.print("  Color              : ");
                                warna = input.readLine();
                                System.out.print("  Fitur              : ");
                                String fitur = input.readLine();
                                System.out.print("  Price              : Rp.");
                                harga = Integer.parseInt(input.readLine());
                                System.out.print("  Quantity           : ");
                                stok = Integer.parseInt(input.readLine());

                                jamDigital.SetEdit("Name", nama, merk, warna, harga, stok);
                                jamDigital.SetEdit("Merk", nama, merk, warna, harga, stok);
                                jamDigital.SetEdit("Warna", nama, merk, warna, harga, stok);
                                jamDigital.SetEdit("Harga", nama, merk, warna, harga, stok);
                                jamDigital.SetEdit("Stok", nama, merk, warna, harga, stok);
                                jamDigital.setFitur(fitur);
                                jamDigital.setKode(kode);
                                System.out.println("""
                                   O===============================O
                                   |         Watch edited!         |
                                   O===============================O""");
                                pilihtipe = "E";
                            }
                        }
                    }
                    break;
                }
                
                case "2", "Analog" -> {
                    if(anlg.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O==============================O
                                            |         Analog Watch         |
                                            O==============================O""");
                        for (int i = 0; i < anlg.size(); i++){
                            System.out.println("  Code               : " + anlg.get(i).getKode());
                            System.out.println("  Name               : " + anlg.get(i).getNama());
                            System.out.println("  Merk               : " + anlg.get(i).getMerk());
                            System.out.println("  Color              : " + anlg.get(i).getWarna());
                            System.out.println("  Fitur              : " + anlg.get(i).getFitur());
                            System.out.println("  Price              : Rp." + anlg.get(i).getHarga());
                            System.out.println("  Quantity           : " + anlg.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        System.out.print(" Input Code : ");
                        String no = input.readLine();
                        for (Analog jamAnalog : anlg) {
                            if (jamAnalog.getKode().equals(no)){
                                int kodeAnlg = kodeAnalog();
                                kode = "4N4"+ kodeAnlg;

                                System.out.print("  Name               : ");
                                nama = input.readLine();
                                System.out.print("  Merk               : ");
                                merk = input.readLine();
                                System.out.print("  Color              : ");
                                warna = input.readLine();
                                System.out.print("  Fitur              : ");
                                String fitur = input.readLine();
                                System.out.print("  Price              : Rp.");
                                harga = Integer.parseInt(input.readLine());
                                System.out.print("  Quantity           : ");
                                stok = Integer.parseInt(input.readLine());

                                jamAnalog.SetEdit("Name", nama, merk, warna, harga, stok);
                                jamAnalog.SetEdit("Merk", nama, merk, warna, harga, stok);
                                jamAnalog.SetEdit("Warna", nama, merk, warna, harga, stok);
                                jamAnalog.SetEdit("Harga", nama, merk, warna, harga, stok);
                                jamAnalog.SetEdit("Stok", nama, merk, warna, harga, stok);
                                jamAnalog.setFitur(fitur);
                                jamAnalog.setKode(kode);
                                System.out.println("""
                                   O===============================O
                                   |         Watch edited!         |
                                   O===============================O""");
                                pilihtipe = "E";
                            }
                        }
                    }
                    break;
                }
                    
                case "E" -> {System.out.println(""); break;}
                
                default -> {System.out.println("  Wrong Type, Input Again!!!"); break;}
            }
        }
    }
    
    public static void hapus() throws IOException{
        String pilihtipe = "a";
        
        while(!"E".equals(pilihtipe)){
            System.out.println("""
                                O==============================O
                                |         Delete Watch         |
                                O==============================O
                                | 1. Digital Watch             |
                                | 2. Analog Watch              |
                                | E. Exit                      |
                                O==============================O""");
            System.out.print("  Input choice : ");
            pilihtipe = input.readLine();
            if (null == pilihtipe){
                System.out.println(" Wrong Input! ");
            } else switch (pilihtipe) {
                case "1", "Digital" -> {
                    if(dgtl.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O===============================O
                                            |         Digital Watch         |
                                            O===============================O""");
                        for (int i = 0; i < dgtl.size(); i++){
                            System.out.println("  Code               : " + dgtl.get(i).getKode());
                            System.out.println("  Name               : " + dgtl.get(i).getNama());
                            System.out.println("  Merk               : " + dgtl.get(i).getMerk());
                            System.out.println("  Color              : " + dgtl.get(i).getWarna());
                            System.out.println("  Fitur              : " + dgtl.get(i).getFitur());
                            System.out.println("  Price              : Rp." + dgtl.get(i).getHarga());
                            System.out.println("  Quantity           : " + dgtl.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        System.out.print(" Input Code : ");
                        String no = input.readLine();
                        for (int i = 0; i < dgtl.size(); i++){
                            if(dgtl.get(i).getKode().equals(no)){
                                dgtl.remove(i);
                                System.out.println("""
                                   O===============================O
                                   |         Watch deleted         |
                                   O===============================O""");
                                break;
                            }
                        }
                    }
                    break;
                }
                
                case "2", "Analog" -> {
                    if(anlg.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O==============================O
                                            |         Analog Watch         |
                                            O==============================O""");
                        for (int i = 0; i < anlg.size(); i++){
                            System.out.println("  Code               : " + anlg.get(i).getKode());
                            System.out.println("  Name               : " + anlg.get(i).getNama());
                            System.out.println("  Merk               : " + anlg.get(i).getMerk());
                            System.out.println("  Color              : " + anlg.get(i).getWarna());
                            System.out.println("  Fitur              : " + anlg.get(i).getFitur());
                            System.out.println("  Price              : Rp." + anlg.get(i).getHarga());
                            System.out.println("  Quantity           : " + anlg.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        System.out.print(" Input Code : ");
                        String no = input.readLine();
                        for (int i = 0; i < anlg.size(); i++){
                            if(anlg.get(i).getKode().equals(no)){
                                anlg.remove(i);
                                System.out.println("""
                                   O===============================O
                                   |         Watch deleted         |
                                   O===============================O""");
                                break;
                            }
                        }
                    }
                    break;
                }
                    
                case "E" -> {System.out.println(""); break;}
                
                default -> {System.out.println("  Wrong Type, Input Again!!!"); break;}
            }
        }
    }
    
    public static void beli() throws IOException{
        String pilihtipe = "a";
        
        while(!"E".equals(pilihtipe)) {
            System.out.println("""
                                O===============================O
                                |           Buy Watch           |
                                O===============================O
                                | 1. Digital Watch              |
                                | 2. Analog Watch               |
                                | E. Exit                       |
                                O===============================O""");
            System.out.print("  Input choice : ");
            pilihtipe = input.readLine();
            if (null == pilihtipe){
                System.out.println(" Wrong Input! ");
            } else switch (pilihtipe) {
                case "1", "Digital" -> {
                    if(dgtl.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O===============================O
                                            |         Digital Watch         |
                                            O===============================O""");
                        for (int i = 0; i < dgtl.size(); i++){
                            System.out.println("[" + (i+1) + "] Code               : " + dgtl.get(i).getKode());
                            System.out.println("    Name               : " + dgtl.get(i).getNama());
                            System.out.println("    Merk               : " + dgtl.get(i).getMerk());
                            System.out.println("    Color              : " + dgtl.get(i).getWarna());
                            System.out.println("    Fitur              : " + dgtl.get(i).getFitur());
                            System.out.println("    Price              : Rp." + dgtl.get(i).getHarga());
                            System.out.println("    Quantity           : " + dgtl.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        
                        System.out.print("  Input Number       : ");
                        int beli = Integer.parseInt(input.readLine());
        
                        if (beli <= dgtl.size() || beli > 0){
                            String namaCust = userAktif, barang = dgtl.get(beli-1).getNama(),
                            merk = dgtl.get(beli-1).getMerk(), kode = dgtl.get(beli-1).getKode(),
                            warna = dgtl.get(beli-1).getWarna(), fitur = dgtl.get(beli-1).getFitur();
                            int harga = dgtl.get(beli-1).getHarga();
                                    
                            System.out.print("  Purchase amount    : ");
                            int jumlah = Integer.parseInt(input.readLine());
                            Transaksi buy = new Transaksi(namaCust, barang, merk, kode, warna, jumlah, harga, fitur);
                            dataTransaksi.add(buy);
                            
                        } else {
                            System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                        }
                    }
                    break;
                }
                
                case "2", "Analog" -> {
                    if(anlg.size() < 1){
                        System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                    } else {
                        System.out.println("""
                                            O==============================O
                                            |         Analog Watch         |
                                            O==============================O""");
                        for (int i = 0; i < anlg.size(); i++){
                            System.out.println("[" + (i+1) + "] Code               : " + anlg.get(i).getKode());
                            System.out.println("    Merk               : " + anlg.get(i).getMerk());
                            System.out.println("    Color              : " + anlg.get(i).getWarna());
                            System.out.println("    Fitur              : " + anlg.get(i).getFitur());
                            System.out.println("    Price              : Rp." + anlg.get(i).getHarga());
                            System.out.println("    Quantity           : " + anlg.get(i).getStok());
                            System.out.println("---------------------------------");
                        }
                        System.out.println("=================================");
                        
                        System.out.print("  Input Number       : ");
                        int beli = Integer.parseInt(input.readLine());
        
                        if (beli <= anlg.size() || beli > 0){
                            
                            String namaCust = userAktif, barang = anlg.get(beli-1).getNama(),
                            merk = anlg.get(beli-1).getMerk(), kode = anlg.get(beli-1).getKode(),
                            warna = anlg.get(beli-1).getWarna(), fitur = anlg.get(beli-1).getFitur();
                            int harga = anlg.get(beli-1).getHarga();
                                    
                            System.out.print("  Purchase amount    : ");
                            int jumlah = Integer.parseInt(input.readLine());
                            Transaksi buy = new Transaksi(namaCust, barang, merk, kode, warna, jumlah, harga, fitur);
                            dataTransaksi.add(buy);
                            
                        } else {
                            System.out.println("""
                                            O===============================O
                                            |      Watch Not Available      |
                                            O===============================O""");
                        }
                    }
                    break;
                }
                    
                case "E" -> {System.out.println(""); break;}
                
                default -> {System.out.println(" Wrong Input! "); break;}
            }
        }
    }
    
    public static void bayar() throws IOException{
        int total = 0, cekKeranjang = 0;
        
        for (int i = 0; i < dataTransaksi.size(); i++){
            if (dataTransaksi.get(i).getNamaCustomer().equals(userAktif)){
                cekKeranjang++;
            }
        }
        
        if (cekKeranjang != 0){
            System.out.println("""
                                O===============================O
                                |            Payment            |
                                O===============================O
                                |         ELeganz Watch         |
                                O===============================O""");
            System.out.println("=================================================================");
            for (int i = 0; i < dataTransaksi.size(); i++){
                if (dataTransaksi.get(i).getNamaCustomer().equals(userAktif)){
                    int totalSatuan = dataTransaksi.get(i).getJumlahBarang() * 
                            dataTransaksi.get(i).getHargaBarang();

                    System.out.println("| " + (i+1) +". " + dataTransaksi.get(i).getNamaCustomer()+
                            " | " + dataTransaksi.get(i).getNamaBarang() + " | " + 
                            dataTransaksi.get(i).getMerkBarang() + " | " + 
                            dataTransaksi.get(i).getKodeBarang() + " | " + 
                            dataTransaksi.get(i).getWarnaBarang() + " | " + 
                            dataTransaksi.get(i).getJumlahBarang() + " | Rp." + 
                            totalSatuan);
                    total += totalSatuan;
                    System.out.println("=================================================================");
                }
            }
            System.out.println("                                     Total = Rp." + total );
            System.out.println("=================================================================");
            int uang = 1;
            while(uang < total){
                System.out.print("  Input : Rp. ");
                uang = Integer.parseInt(input.readLine());
                if (uang < total){
                    System.out.println("  Money is not enough, input again");
                }
            }
            int kembali = uang - total;
            System.out.println("  Change : Rp. " + kembali);
            System.out.println("""
                               Your purchase is being processed
                                          Thank you!           """);
            for (int i = 0; i < dataTransaksi.size(); i++){
                if (dataTransaksi.get(i).getNamaCustomer().equals(userAktif)){
                    dataTransaksi.remove(i);
                }
            }
            for (int i = 0; i < dataTransaksi.size(); i++){
                if (dataTransaksi.get(i).getNamaCustomer().equals(userAktif)){
                    dataTransaksi.remove(i);
                }
            }
        } else {
            System.out.println("  Chart is empty  ");
        }
    }
}
