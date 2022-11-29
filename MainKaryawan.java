public class MainKaryawan {
    public static void main(String[] args){
        Bos boss = new Bos();
        PegawaiTetap pt = new PegawaiTetap("Aprianna",2000000);
        boss.tampilSemuaKaryawan(pt);
        KaryawanMagang km =new
                KaryawanMagang("Irawati",6);
        boss.tampilSemuaKaryawan(km);
    }
}
