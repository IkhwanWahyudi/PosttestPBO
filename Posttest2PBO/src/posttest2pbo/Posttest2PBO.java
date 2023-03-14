
// Sistem Pengelolaan Jam Tangan di toko Eleganz Watch

package posttest2pbo;
import java.io.*;
import java.util.*;

public class Posttest2PBO {
    public static void main(String[] args) throws IOException {
        
        String pilih = "a", nama, merk, tipe, kode, warna;
        int stok, harga, incrementKodeCasual = 1, incrementKodeSport = 1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DataJam> dj = new ArrayList<>();
        
        while(!"E".equals(pilih)) {
            System.out.println("""
                               O===============================O
                               |         Eleganz Watch         |
                               O===============================O
                               | 1. Display                    |
                               | 2. Add                        |
                               | 3. Edit                       |
                               | 4. Delete                     |
                               | E. Exit                       |
                               O===============================O""");
            System.out.print("  Input choice : ");
            pilih = br.readLine();
            
            switch(pilih){
                
                case "1" -> {
                    System.out.println("""
                                        O===============================O
                                        |         Display Watch         |
                                        O===============================O""");
                    for (int i = 0; i < dj.size(); i++){
                        System.out.println("  Code               : " + dj.get(i).getKode());
                        System.out.println("  Name               : " + dj.get(i).getNama());
                        System.out.println("  Merk               : " + dj.get(i).getMerk());
                        System.out.println("  Type(Casual/Sport) : " + dj.get(i).getTipe());
                        System.out.println("  Color              : " + dj.get(i).getWarna());
                        System.out.println("  Price              : Rp." + dj.get(i).getHarga());
                        System.out.println("  Quantity           : " + dj.get(i).getStok());
                        System.out.println("---------------------------------");
                    }
                    System.out.println("=================================");
                }
                
                case "2" -> {
                    System.out.println("""
                               O================================O
                               |            Add Watch           |
                               O================================O""");
                    System.out.print("  Name               : ");
                    nama = br.readLine();
                    System.out.print("  Merk               : ");
                    merk = br.readLine();
                    String salah = "a";
                    while(!"Casual".equals(salah) || !"Sport".equals(salah)){
                        System.out.print("  Type(Casual/Sport) : ");
                        tipe = br.readLine();

                        if("Casual".equals(tipe)){
                            // Pengkodean Jam ===================================
                            kode = "C4S"+ incrementKodeCasual;
                            incrementKodeCasual++;
                            
                            System.out.print("  Color              : ");
                            warna = br.readLine();
                            System.out.print("  Price              : Rp.");
                            harga = Integer.parseInt(br.readLine());
                            System.out.print("  Quantity           : ");
                            stok = Integer.parseInt(br.readLine());

                            DataJam dataJam = new DataJam(nama, kode, merk, tipe, warna, harga, stok);
                            dj.add(dataJam);
                            break;
                        } else if ("Sport".equals(tipe)){
                            // Pengkodean Jam ===================================
                            kode = "5P0"+ incrementKodeSport;
                            incrementKodeSport++;
                            
                            System.out.print("  Color              : ");
                            warna = br.readLine();
                            System.out.print("  Price              : Rp.");
                            harga = Integer.parseInt(br.readLine());
                            System.out.print("  Quantity           : ");
                            stok = Integer.parseInt(br.readLine());

                            DataJam dataJam = new DataJam(nama, kode, merk, tipe, warna, harga, stok);
                            dj.add(dataJam);
                            break;
                        } else {
                            System.out.println("Wrong Type, Input Again!!!");
                        }
                    }
                    System.out.println("""
                                        O===============================O
                                        |          Watch added          |
                                        O===============================O""");
                    break;
                }
                    
                case "3" -> {
                    System.out.println("""
                               O===============================O
                               |           Edit Watch          |
                               O===============================O""");
                    for (int i = 0; i < dj.size(); i++){
                        System.out.println("  Name               : " + dj.get(i).getNama());
                        System.out.println("  Code               : " + dj.get(i).getKode());
                        System.out.println("  Merk               : " + dj.get(i).getMerk());
                        System.out.println("  Type(Casual/Sport) : " + dj.get(i).getTipe());
                        System.out.println("  Color              : " + dj.get(i).getWarna());
                        System.out.println("  Price              : Rp." + dj.get(i).getHarga());
                        System.out.println("  Quantity           : " + dj.get(i).getStok());
                        System.out.println("---------------------------------");
                    }
                    System.out.println("=================================");
                    System.out.print(" Input Code : ");
                    String no = br.readLine();

                    for (DataJam datajam : dj) {
                        if (datajam.getKode().equals(no)){
                            String name, code, merek, type;
                            int price, quantity;

                            System.out.print("  Name               : ");
                            name = br.readLine();
                            System.out.print("  Merk               : ");
                            merek = br.readLine();
                            String salah = "a";
                            while(!"Casual".equals(salah) || !"Sport".equals(salah)){
                                System.out.print("  Type(Casual/Sport) : ");
                                type = br.readLine();

                                if("Casual".equals(type)){
                                    // Pengkodean Jam ===================================
                                    code = "C4S"+ incrementKodeCasual;
                                    incrementKodeCasual++;
                                    
                                    System.out.print("  Color              : ");
                                    warna = br.readLine();
                                    System.out.print("  Price              : Rp.");
                                    price = Integer.parseInt(br.readLine());
                                    System.out.print("  Quantity           : ");
                                    quantity = Integer.parseInt(br.readLine());

                                    datajam.SetEdit("Name", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Code", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Merk", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Type", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Price", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Quantity", name, code, merek, type, warna, price, quantity);
                                    break;
                                } else if ("Sport".equals(type)){
                                    // Pengkodean Jam ===================================
                                    code = "5P0"+ incrementKodeSport;
                                    incrementKodeSport++;
                                    
                                    System.out.print("  Color              : ");
                                    warna = br.readLine();
                                    System.out.print("  Price              : Rp.");
                                    price = Integer.parseInt(br.readLine());
                                    System.out.print("  Quantity           : ");
                                    quantity = Integer.parseInt(br.readLine());

                                    datajam.SetEdit("Name", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Code", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Merk", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Type", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Price", name, code, merek, type, warna, price, quantity);
                                    datajam.SetEdit("Quantity", name, code, merek, type, warna, price, quantity);
                                    break;
                                } else {
                                    System.out.println("Wrong Type, Input Again!!!");
                                }
                            }
                        }
                    }
                    System.out.println("""
                                       O===============================O
                                       |         Watch edited!         |
                                       O===============================O""");
                    break;
                }
                
                case "4" -> {
                    System.out.println("""
                               O===============================O
                               |          Delete Watch         |
                               O===============================O""");
                    for (int i = 0; i < dj.size(); i++){
                        System.out.println("  Name               : " + dj.get(i).getNama());
                        System.out.println("  Code               : " + dj.get(i).getKode());
                        System.out.println("  Merk               : " + dj.get(i).getMerk());
                        System.out.println("  Type(Casual/Sport) : " + dj.get(i).getTipe());
                        System.out.println("  Color              : " + dj.get(i).getWarna());
                        System.out.println("  Price              : Rp." + dj.get(i).getHarga());
                        System.out.println("  Quantity           : " + dj.get(i).getStok());
                        System.out.println("---------------------------------");
                    }
                    System.out.println("=================================");
                    System.out.print(" Input Code : ");
                    String del = br.readLine();
                    for (int i = 0; i < dj.size(); i++){
                        if(dj.get(i).getKode().equals(del)){
                            dj.remove(i);
                            break;
                        }
                    }
                    System.out.println("O===============================O");
                    System.out.println("|         Watch deleted         |");
                    System.out.println("O===============================O");
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
}
