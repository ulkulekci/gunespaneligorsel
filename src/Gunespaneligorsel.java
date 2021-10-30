
//import gunespaneligorsel.gorsel;
import gunespaneligorsel.baglanti;
import gunespaneligorsel.gorsel;
import java.io.IOException;




//package gunespaneligorsel;


public class Gunespaneligorsel {

    public static void main(String[] args) throws InterruptedException, IOException {
    //int a=1000;
    
baglanti baglantim=new baglanti();
baglantim.initialize();
gorsel gorselim=   new gorsel()  ;
   // gorselim.voltaj();
    gorselim.setVisible(true);
   //Thread.sleep(a);
    //gorselim.setVisible(false);
    }
    
}
