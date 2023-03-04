
// Sistem Pengelolaan Jam Tangan di toko Eleganz Watch

package posttest1pbo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest1PBO {
    public static void main(String[] args) throws IOException {
        
        String pilih = "a", nama, merk, tipe, kode;
        int stok, harga;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DataJam> dj= new ArrayList<>();
        
        while(!"E".equals(pilih)) {
            System.out.println("""
                               =================================
                               |         Eleganz Watch         |
                               =================================
                               | 1. Display                    |
                               | 2. Add                        |
                               | 3. Edit                       |
                               | 4. Delete                     |
                               | E. Exit                       |
                               =================================""");
            System.out.print("  Input choice : ");
            pilih = br.readLine();
            
            switch(pilih){
                case "1" -> {
                    System.out.println("""
                           =================================
                           |         Display Watch         |
                           =================================""");
                    for (int i = 0; i < dj.size(); i++){
                        dj.get(i).display();
                    }
                    System.out.println("=================================");
                }
                
                case "2" -> {
                    System.out.println("""
                               ==================================
                               |            Add Watch           |
                               ==================================""");
                    System.out.print("  Name               : ");
                    nama = br.readLine();
                    System.out.print("  Code               : ");
                    kode = br.readLine();
                    System.out.print("  Merk               : ");
                    merk = br.readLine();
                    System.out.print("  Type(Casual/Sport) : ");
                    tipe = br.readLine();
                    System.out.print("  Price              : Rp.");
                    harga = Integer.parseInt(br.readLine());
                    System.out.print("  Quantity           : ");
                    stok = Integer.parseInt(br.readLine());
                    
                    DataJam dataJam = new DataJam(nama, kode, merk, tipe, harga, stok);
                    dj.add(dataJam);
                    System.out.println("=================================");
                    System.out.println("           Watch added           ");
                    System.out.println("=================================");
                    break;
                }
                    
                case "3" -> {
                    System.out.println("""
                               =================================
                               |           Edit Watch          |
                               =================================""");
                    for (int i = 0; i < dj.size(); i++){
                        dj.get(i).display();
                    }
                    System.out.println("=================================");
                    System.out.print(" Input Code : ");
                    String no = br.readLine();
                    for (DataJam datajam : dj) {
                        if (datajam.kodeJam.equals(no)){
                            String name, code, merek, type;
                            int price, quantity;
                            
                            System.out.print("  Name               : ");
                            name = br.readLine();
                            System.out.print("  Code               : ");
                            code = br.readLine();
                            System.out.print("  Merk               : ");
                            merek = br.readLine();
                            System.out.print("  Type(Casual/Sport) : ");
                            type = br.readLine();
                            System.out.print("  Price              : Rp.");
                            price = Integer.parseInt(br.readLine());
                            System.out.print("  Quantity           : ");
                            quantity = Integer.parseInt(br.readLine());
                            
                            datajam.edit("Name", name, code, merek, type, price, quantity);
                            datajam.edit("Code", name, code, merek, type, price, quantity);
                            datajam.edit("Merk", name, code, merek, type, price, quantity);
                            datajam.edit("Type", name, code, merek, type, price, quantity);
                            datajam.edit("Price", name, code, merek, type, price, quantity);
                            datajam.edit("Quantity", name, code, merek, type, price, quantity);
                        }
                    }
                    System.out.println("=================================");
                    System.out.println("          Watch edited!          ");
                    System.out.println("=================================");
                    break;
                }
                
                case "4" -> {
                    System.out.println("""
                               =================================
                               |          Delete Watch         |
                               =================================""");
                    for (int i = 0; i < dj.size(); i++){
                        dj.get(i).display();
                    }
                    System.out.println("=================================");
                    System.out.print(" Input Code : ");
                    String del = br.readLine();
                    for (int i = 0; i < dj.size(); i++){
                        if(dj.get(i).kodeJam.equals(del)){
                            dj.remove(i);
                            break;
                        }
                    }
                    System.out.println("=================================");
                    System.out.println("          Watch deleted          ");
                    System.out.println("=================================");
                    break;
                }
                
                default -> {
                    System.out.println("=================================");
                    System.out.println("         Invalid choice!         ");
                    System.out.println("=================================");
                    break;
                }
                
            }
        }
    }
    
}
