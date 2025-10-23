import java.io.Serializable;

public abstract class NhanVien implements Serializable {
    
    // Rất quan trọng cho việc Serialization
    private static final long serialVersionUID = 1L; 
    
    protected String maNV;
    protected String ten;
    protected double luongCoBan;

    public NhanVien(String maNV, String ten, double luongCoBan) {
        this.maNV = maNV;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    
    public abstract double tinhLuong();
    
    public String getTen() { return this.ten; }
    public String getMaNV() { return this.maNV; }
}