package posttest6pbo;

public abstract class Jam {
    
    protected String namaJam, merkJam, warnaJam;
    protected int hargaJam, stokJam;
    
    // Getter ==================================================================
    protected abstract String getNama();
    
    protected abstract String getMerk();
    
    protected abstract String getWarna();
    
    protected abstract int getHarga();
    
    protected abstract int getStok();
    
    // Setter ==================================================================
    protected abstract void SetEdit(String property, String NamaBaru, String MerkBaru, 
            String WarnaBaru, int HargaBaru, int StokBaru);

    public void tampil(){
        System.out.println("  Name          : " + this.namaJam);
        System.out.println("  Merk          : " + this.merkJam);
        System.out.println("  Color         : " + this.warnaJam);
    }
}
