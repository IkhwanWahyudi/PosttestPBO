package posttest1pbo;

public class DataJam {
    
    String namaJam, merkJam, tipeJam, kodeJam;
    int hargaJam, stokJam;
    
    public DataJam(String nama, String kode, String merk, String tipe, int harga, int stok) {
        this.namaJam = nama;
        this.kodeJam = kode;
        this.merkJam = merk;
        this.tipeJam = tipe;
        this.hargaJam = harga;
        this.stokJam = stok;
    }
    
    void display(){
        System.out.println("  Name               : " + this.namaJam);
        System.out.println("  Code               : " + this.kodeJam);
        System.out.println("  Merk               : " + this.merkJam);
        System.out.println("  Type(Casual/Sport) : " + this.tipeJam);
        System.out.println("  Price              : Rp." + this.hargaJam);
        System.out.println("  Quantity           : " + this.stokJam);
        System.out.println("---------------------------------");
    }
    
    void edit(String property, String name, String code, String merk, String type, int price, int quantity){
        switch (property) {
            case "Name":
                this.namaJam = name;
                break;
            case "Code":
                this.kodeJam = code;
                break;
            case "Merk":
                this.merkJam = merk;
                break;
            case "Type":
                this.tipeJam = type;
                break;
            case "Price":
                this.hargaJam = price;
                break;
            case "Quantity":
                this.stokJam = quantity;
                break;
            default:
                break;
        }
    }
}
