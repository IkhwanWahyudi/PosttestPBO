package posttest4pbo;

public class Digital extends DataJam{
    private String fitur, kode;
    
    public Digital(String nama, String merk, String kode, String warna, int harga, int stok, String fitur){
        super(nama, merk, warna, harga, stok);
        this.fitur = fitur;
        this.kode = kode + "J4M";
    }
    
    public String getKode(){
        return kode;
    }
    
    public String getFitur(){
        return fitur;
    }
    
    public void setKode(String kode){
        this.kode = kode + "J4M";
    }
    
    public void setFitur(String fitur){
        this.fitur = fitur;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("  Fitur         : " + this.fitur);
        System.out.println("  Price         : Rp." + this.hargaJam);
        System.out.println("  Quantity      : " + this.stokJam);
    }
    
    public void tampil(boolean showProps){
        if (showProps) {
            System.out.println("  Code          : " + this.kode);
            tampil();
        }
        else super.tampil();
    }
}