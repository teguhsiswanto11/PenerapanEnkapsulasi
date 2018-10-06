public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Objek Persegi Panjang Diinstansiasi");
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    public double hitungLuas(){
        return panjang*lebar;
    }
}
