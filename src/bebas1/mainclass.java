package bebas1;

public class mainclass {

    //Method static
    static void tampilan(){
        
        //objek
        voidclass tampil = new voidclass();
        
        //pemanggilan method void dari kelas voidclass menggunakan objek tampil
        tampil.buka();         //pemanggilan method void buka
        tampil.user();         //pemanggilan method void user
        tampil.tutup();        //pemanggilan method void tutup
        
        //pemanggilan method non void dari kelas voidclass menggunakan objek tampil
        System.out.println("            #Instagram = "+tampil.instagram());     //pemanggilan method nonvoid string instagram
        System.out.println("            #Facebook = "+tampil.facebook());       //pemanggilan method nonvoid string facebook
        System.out.println("            #WhatsApp = "+tampil.whatsapp());       //pemanggilan method nonvoid string whatsapp
        
    }
    
}
