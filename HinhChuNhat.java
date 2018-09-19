package baiTapCodegym;

public class HinhChuNhat {
    private double width, height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getDienTich() {
        return width * height;

    }

    public double getChuVi() {
        return (width + height) * 2;
    }

    public String display() {
        return "hinh chu nhat co chieu dai " + height + " chieu rong la " + width;
    }
}
