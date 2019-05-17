package model;


public class RidehistoryModel {

    Integer i1,i2,i3;
    String txtmall,txthome,txtdate,txtprice;

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public Integer getI2() {
        return i2;
    }

    public void setI2(Integer i2) {
        this.i2 = i2;
    }

    public Integer getI3() {
        return i3;
    }

    public void setI3(Integer i3) {
        this.i3 = i3;
    }

    public String getTxtmall() {
        return txtmall;
    }

    public void setTxtmall(String txtmall) {
        this.txtmall = txtmall;
    }

    public String getTxthome() {
        return txthome;
    }

    public void setTxthome(String txthome) {
        this.txthome = txthome;
    }

    public String getTxtdate() {
        return txtdate;
    }

    public void setTxtdate(String txtdate) {
        this.txtdate = txtdate;
    }

    public String getTxtprice() {
        return txtprice;
    }

    public void setTxtprice(String txtprice) {
        this.txtprice = txtprice;
    }

    public RidehistoryModel(Integer i1, Integer i2, Integer i3, String txtmall, String txthome, String txtdate, String txtprice) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.txtmall = txtmall;
        this.txthome = txthome;
        this.txtdate = txtdate;
        this.txtprice = txtprice;
    }
}
