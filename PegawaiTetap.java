public class PegawaiTetap extends Karyawan implements Gaji{
    private  int gaji;

    public PegawaiTetap(String nama,int gaji){
        this.nama =nama;
        this.gaji=gaji;
    }

    public int getGaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }

    public int getTotalGaji(){
        return (int)(gaji+0.05*gaji);
    }

    public String getDataKaryawan(){
        String info = super.getDataKaryawan()+"\n";info+="Menjadi Karyawan tetap dengan gaji"+gaji;
        return info;
    }
}
