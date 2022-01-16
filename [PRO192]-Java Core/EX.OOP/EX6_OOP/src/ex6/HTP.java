/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HTP {
    private String mahang;
    private String tenhang;
    private long price;
    private Date nsx,hsd;
    public HTP(){
        
    }
    public HTP(String mahang, String tenhang, long price,Date nsx,Date hsd) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.price = price;
        this.nsx=nsx;
        this.hsd=hsd;
    }
    public String getMahang(){
        return mahang;
    }
    public String getTenhang(){
        return tenhang;
    }
    public long getPrice(){
        return price;
    }
    public void setMahang(String mahang){
        this.mahang=mahang;
    }
    public void setTenhang(String tenhang){
        this.tenhang=tenhang;
    }
    public void setPrice(long price){
        this.price=price;
    }
    public Date getNsx(){
        return nsx;
    }
    public void setNsx(Date nsx){
        this.nsx=nsx;
    }
    public Date getHsd(){
        return hsd;
    }
    public void setHsd(Date hsd){
        this.hsd=hsd;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        boolean k =true;
        do{
        System.out.print("Nhập tên hàng: ");
        tenhang=sc.nextLine();
        }while(kiemTraTenHang(k));
        System.out.print("Nhập mã hàng: ");
        mahang=sc.next();
        System.out.print("Nhập giá: ");
        price=sc.nextLong();
    }
    public void hienthi(){
        System.out.println("Tên hàng là: "+tenhang);
        System.out.println("Mã hàng là: "+mahang);
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("Giá: "+formatter.format(price)+" VNĐ");
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        String st1 = sp.format(nsx);
        String st2 = sp.format(hsd);
        System.out.println("Ngày sản xuất: "+ st1);
        System.out.println("Hạn sử dụng: "+ st2);
    }
    //Khởi tạo phương thức để nhập năm tháng ngày sản xuất
    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1 , day);
        this.nsx = calendar.getTime();
    }
 
    //Khởi tạo phương thức để nhập hạn sử dụng
    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);
        this.hsd = calendar.getTime();
    }
    //khởi tạo phương thức kiểm tra tên hàng không được để trống
    public boolean kiemTraTenHang(boolean k) {
        if (this.tenhang == "" || this.tenhang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
 
    //khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
    public boolean kiemTraNgay(boolean t) {
        if (this.getNsx().compareTo(this.getHsd()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
 
    //khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getHsd().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
    
}
