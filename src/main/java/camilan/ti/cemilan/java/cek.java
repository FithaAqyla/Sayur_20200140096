/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan.ti.cemilan.java;

/**
 *
 * @author Aqyla-PC
 */
public class cek {
    public Double Harga(String inputHarga){
        Double Harga = Double.valueOf(inputHarga);
        return Harga;
    }
    public Double HitungJmlh(String Kilo){
        Double Hitungjmlh = Double.valueOf(Kilo);
        return Hitungjmlh;
    }

    public  String diskon(Double Bayarr2){ 
        String discount= null; 
        if(Bayarr2>25000){
            discount= "15";
        }
        
        else if((Bayarr2>16000 ) && (Bayarr2< 25000)){
            discount="10";
        }
        else if (Bayarr2<16000){
            discount="0";
        }
        return discount; 
        
    }
    public Double BayarDiscount( Double Bayarr2,Integer disk){
        Double hargadiskon = Bayarr2*disk/100;
        return hargadiskon;
    }
    public Double Pembayaran(Double jumlah,Double hargaa){
        Double jumlahbyr = hargaa * jumlah;
        return jumlahbyr;
    }
    
    public Double Totalbyr(Double Bayarr2,Double discountt){
        Double totalbayar = Bayarr2 - discountt; 
        return totalbayar;
    }
    
    
     public void Hitung(Double Bayarr3,Integer diskonn, Double totalbayar,Double hargadiskon){
        if(Bayarr3>25000){
            diskonn = 15;
            totalbayar = Bayarr3 - (Bayarr3*diskonn/100);
            hargadiskon = Bayarr3*diskonn/100;
        }
        
        else if((Bayarr3>16000 ) && (Bayarr3< 25000)){
            diskonn = 10;
            totalbayar = Bayarr3 - (Bayarr3*diskonn/100);
            hargadiskon = Bayarr3*diskonn/100;
        }
        else if (Bayarr3<16000){
            totalbayar = Bayarr3 - (Bayarr3*diskonn/100);
            hargadiskon = Bayarr3*diskonn/100;
        }
    }
    
    public String  money(Double TotalBayar, Double duit){
        Double kmbln = duit - TotalBayar;
        if(duit > TotalBayar){
            return "Kembalian Anda Rp."+kmbln;
        }
        else{
            return "Uang Anda Kurang Rp."+kmbln;
        }
    }
}
