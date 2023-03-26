package posttest4pbo;

public class DataJam {
    
    protected String namaJam, merkJam, warnaJam;
    protected int hargaJam, stokJam;
    
    public DataJam(String nama, String merk, String warna, int harga, int stok) {
        this.namaJam = nama;
        this.merkJam = merk;
        this.warnaJam = warna;
        this.hargaJam = harga;
        this.stokJam = stok;
    }
    
    // Getter ==================================================================
    public String getNama(){return namaJam;}
    
    public String getMerk(){return merkJam;}
    
    public String getWarna(){return warnaJam;}
    
    public int getHarga(){return hargaJam;}
    
    public int getStok(){return stokJam;}
    
    // Setter ==================================================================
    public void SetEdit(String property, String NamaBaru, String MerkBaru, String WarnaBaru, int HargaBaru, int StokBaru){
        switch (property) {
            case "Name":
                this.namaJam = NamaBaru;
                break;
                
            case "Merk":
                this.merkJam = MerkBaru;
                break;
            
            case "Warna":
                this.warnaJam = WarnaBaru;
                break;
                
            case "Harga":
                this.hargaJam = HargaBaru;
                break;
                
            case "Stok":
                this.stokJam = StokBaru;
                break;
                
            default:
                break;
        }
    }

    public void tampil(){
        System.out.println("  Name          : " + this.namaJam);
        System.out.println("  Merk          : " + this.merkJam);
        System.out.println("  Color         : " + this.warnaJam);
    }
}
