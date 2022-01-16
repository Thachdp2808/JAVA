/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Dell
 */
public class Account {
    private long stk;
    private String nametk;
    private double moneygoc=50;
    public Account(){
        
    }
    public Account(long stk,String nametk,double moneygoc){
        this.stk=stk;
        this.nametk=nametk;
        this.moneygoc=moneygoc;
    }
    public long getStk(){
        return stk;
    }
    public String getNametk(){
        return nametk;
    }
    public double getMoneygoc(){
        return moneygoc;
    }
    public void setStk(long stk){
        this.stk=stk;
    }
    public void setNametk(String nametk){
        this.nametk=nametk;
    }
    public void setMoneygoc(double moneygoc){
        this.moneygoc=moneygoc;
    }
    @Override
    public String toString(){
        return "Tên chủ Tk: "+ nametk + "\n" +"Số tài khoản: " + stk + "\n" + "Số tiền trong TK: " + moneygoc + " VND" ;
    }
    public void naptien(int amount){
        if(amount>0){
             moneygoc += amount;
        }else{
            System.out.println("Không hợp lệ");
        }
    }
    public void ruttien(int amount){
        if(amount>0){
            moneygoc -= (amount+1100);
        }else{
            System.out.println("Không hợp lệ");
        }
    }
    public void daohan(){
        moneygoc=moneygoc + moneygoc *0.035;
    }
    public void chuyenkhoan(int amount){
        if(amount>0){
        moneygoc=moneygoc-amount;
        } else{
            System.out.println("Không hợp lệ");
        }
    }
    
}

