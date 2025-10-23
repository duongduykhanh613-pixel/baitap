public class LapTrinhVien extends NhanVien {
    
    private int soGioOT;
    private static final double LUONG_OT_MOT_GIO = 200000;

    public LapTrinhVien(String maNV, String ten, double luongCoBan, int soGioOT) {
        super(maNV, ten, luongCoBan);
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.soGioOT * LUONG_OT_MOT_GIO;
    }
}