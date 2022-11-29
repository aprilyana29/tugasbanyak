public class Bos {
    public  void tampilSemuaKaryawan(Karyawan k){
        System.out.println(k.getDataKaryawan());
        if(k instanceof PegawaiTetap){
            System.out.println("Perlu digaji nih");
        }else{
            System.out.println("Tidak Mendapat Gaji");
        }
    }
}
