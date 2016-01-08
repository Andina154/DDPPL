package patok_tanah;
class Data {
    String no, noTanah, nama, alamat, persil, kelas, luas, riwayat;

    public Data(){}
            
    public Data(String no, String noTanah, String nama, String alamat, String persil, String kelas, String luas, String riwayat) {
        this.no = no;
        this.noTanah = noTanah;
        this.nama = nama;
        this.alamat = alamat;
        this.persil = persil;
        this.kelas = kelas;
        this.luas = luas;
        this.riwayat = riwayat;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    public String getNoTanah() {
        return noTanah;
    }

    public void setNoTanah(String noTanah) {
        this.noTanah = noTanah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPersil() {
        return persil;
    }

    public void setPersil(String persil) {
        this.persil = persil;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }

    public String getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(String riwayat) {
        this.riwayat = riwayat;
    }
    
    
}
