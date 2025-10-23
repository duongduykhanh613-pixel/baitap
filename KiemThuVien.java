public class KiemThuVien extends NhanVien {
    
    private int soBugTimDuoc;
    private static final double THUONG_MOT_BUG = 50000;

    public KiemThuVien(String maNV, String ten, double luongCoBan, int soBugTimDuoc) {
        super(maNV, ten, luongCoBan);
        this.soBugTimDuoc = soBugTimDuoc;
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.soBugTimDuoc * THUONG_MOT_BUG;
    }
}