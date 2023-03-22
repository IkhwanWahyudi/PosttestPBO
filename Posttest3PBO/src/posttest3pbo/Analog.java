package posttest3pbo;

public class Analog extends DataJam{
    private String kode, fitur;
    
    public Analog(String nama, String merk, String kode, String warna, int harga, int stok, String fitur){
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
}
