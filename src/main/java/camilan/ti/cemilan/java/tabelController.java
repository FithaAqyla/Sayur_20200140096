/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan.ti.cemilan.java;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Aqyla-PC
 */

@Controller
public class tabelController {
    @RequestMapping("/cekk")
    public String getData(HttpServletRequest data, Model sayur){
        
        String sayuran = data.getParameter("var_namaSAYUR");
        String Hargasayur = data.getParameter("var_hargaperkilo");
        String jmlhBeli = data.getParameter("var_jumlahbeli");
        String Byar = data.getParameter("var_BAYAR");
        
        cek ck = new cek();
        
        Double Hargaa = ck.Harga(Hargasayur);
        Double Jumlah = ck.HitungJmlh(jmlhBeli);
        Double JmlhBayar = ck.Pembayaran(Jumlah, Hargaa);
        String diskonn = ck.diskon(JmlhBayar);
        Double hargadiskon = ck.BayarDiscount(JmlhBayar,Integer.valueOf(diskonn));
        Double totalBayarcos = ck.Pembayaran(JmlhBayar, hargadiskon);
        
        ck.Hitung(JmlhBayar, Integer.valueOf(diskonn), totalBayarcos, hargadiskon);
        sayur.addAttribute("namaSayur", sayuran);
        sayur.addAttribute("hargaperkilo", Hargasayur);
        sayur.addAttribute("totalSayur", jmlhBeli);
        sayur.addAttribute("harga", Hargaa);
        sayur.addAttribute("diskon", diskonn);
        sayur.addAttribute("Diskonyangdidapat", diskonn + "%");
        sayur.addAttribute("ttl", JmlhBayar);
        sayur.addAttribute("kmbln", ck.money(Double.valueOf(Byar), totalBayarcos));
        
        return "table";
    }
}
