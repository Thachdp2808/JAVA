/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4_4;

/**
 *
 * @author Dell
 */
public class phanso {
    private int tu, mau;
    
    public phanso(int tu,int mau){
        super();
        this.tu= tu;
        this.mau= mau;
    }
    public int gettu(){
        return tu;
    }
    public int getmau(){
        return mau;
    }
    public void settu(int tu){
        this.tu=tu;
    }
    public void setmau(int mau){
        this.mau=mau;
    }
    public int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void toigianphanso(){
        int i= timUCLN(this.gettu(), this.getmau());
        this.settu(this.gettu() /i);
        this.setmau(this.getmau()/i);
    }
    
    public void congphanso(phanso ps){
        int ts =this.gettu() * ps.getmau() + ps.gettu() * this.getmau();
        int ms = this.getmau() * ps.getmau();
        phanso phansotong= new phanso(ts,ms);
        phansotong.toigianphanso();
        System.out.println("Tổng 2 phân số là: "+ phansotong.tu + "/" + phansotong.mau);
    }
    public void truphanso(phanso ps){
        int ts = this.gettu() * ps.getmau() - ps.gettu() * this.getmau();
        int ms = this.getmau() * ps.getmau();
        phanso phansohieu= new phanso(ts,ms);
        phansohieu.toigianphanso();
        System.out.println("Hiệu 2 phân số là: " + phansohieu.tu + "/" + phansohieu.mau);
    }
    public void tichphanso(phanso ps){
        int ts = this.gettu() * ps.gettu();
        int ms= this.getmau() * ps.getmau();
        phanso phansotich= new phanso(ts,ms);
        phansotich.toigianphanso();
        System.out.println("Tích 2 phân số là: " + phansotich.tu + "/" + phansotich.mau);
    }
    public void chiaphanso(phanso ps){
        int ts= this.gettu() * ps.getmau();
        int ms= this.getmau() * ps.gettu();
        phanso phansothuong= new phanso(ts,ms);
        phansothuong.toigianphanso();
        System.out.println("Thương 2 phân số là: " + phansothuong.tu + "/" + phansothuong.mau);
    }
    
}
