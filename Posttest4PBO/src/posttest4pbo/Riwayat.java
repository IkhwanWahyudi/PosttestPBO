package posttest4pbo;

public class Riwayat extends Transaksi {
    
    public Riwayat(String nama, String barang, String merk, String kode, String warna, int jumlah, int harga, String fitur) {
        super(nama, barang, merk, kode, warna, jumlah, harga, fitur);
    }
    
    public void tampil(){
        System.out.println("  Customer Name : " + this.getNamaCustomer());
        System.out.println("  Product Name  : " + this.getNamaBarang());
        System.out.println("  Merk          : " + this.getMerkBarang());
        System.out.println("  Color         : " + this.getWarnaBarang());
        System.out.println("  Fitur         : " + this.getFitur());
        System.out.println("  Price         : Rp." + this.getHargaBarang());
        System.out.println("  Quantity      : " + this.getJumlahBarang());
    }
}