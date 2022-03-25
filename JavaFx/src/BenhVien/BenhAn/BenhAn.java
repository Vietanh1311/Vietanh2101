package BenhVien.BenhAn;

import java.util.Objects;

import java.util.Objects;

public class BenhAn {
    private String ten,cmt,gt,b;
    private int ns,tuoi;

    public BenhAn() {
        this("","","",0,"");
    }

    public BenhAn(String cmt, String ten, String gt, int ns, String b) {
        this.ten = ten;
        this.cmt = cmt;
        this.gt=gt;
        this.ns = ns;
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi=java.time.LocalDate.now().getYear()-ns;
    }

    @Override
    public String toString() {
        return "CMT: "+cmt+" - Tên: "+ten+" - Giới tính: "+gt+" - Tuổi: "+getTuoi()+" - Bệnh: "+b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BenhAn)) return false;
        BenhAn benhAn = (BenhAn) o;
        return ns == benhAn.ns && tuoi == benhAn.tuoi && ten.equals(benhAn.ten) && cmt.equals(benhAn.cmt) && gt.equals(benhAn.gt) && b.equals(benhAn.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten, cmt, gt, b, ns, tuoi);
    }
}
