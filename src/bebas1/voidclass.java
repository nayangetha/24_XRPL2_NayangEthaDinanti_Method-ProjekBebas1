package bebas1;

//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class voidclass {
    
    //method void buka untuk menampilkan judul / tulisan di awal program
    void buka(){
        
        System.out.println("                  Selamat Datang di Warung Murah                   ");
        System.out.println("===================================================================");
        System.out.println("Apakah Anda ingin memesan makanan? (Ya/Tidak)");
    }
    
    //method user untuk input user dalam program
    void user(){
        
        //scanner input untuk memasukkan input dari user
        Scanner input=new Scanner(System.in);
        
        System.out.print("Jawab : ");
        String jawab = input.next();
        System.out.println("");
        
        //percabangan dan equals string
        if(jawab.equalsIgnoreCase("Ya")){
            
            System.out.println("Silahkan Memilih Menu");
            System.out.println("___________________________________________________________________");
            
            String menu[] ={"Sate","Soto","Mie","Bakso","Gorengan"};
            int[]harga = {5000,6000,7000,4000,2000};
            
            //perulalngan untuk menu dan harga
            for (int i = 0; i <menu.length; i++)
            System.out.println(i+"."+menu[i]+" ---> Rp."+harga[i]);
            
            System.out.println("___________________________________________________________________");
            
            System.out.print("Angka Menu Pilihan : ");
            int pilihan = input.nextInt();
            
            //deklarasi variabel lokal
            int jumlah;
            double total;
            
            System.out.println("Menu pilihan anda adalah "+menu[pilihan]+" seharga Rp."+harga[pilihan]); 

            System.out.println("___________________________________________________________________");
            System.out.print("Jumlah Pesanan "+menu[pilihan]+"        = ");
            jumlah = input.nextInt();
        
            total = harga[pilihan]*jumlah;
            System.out.println("Total Harga Pembelian "+menu[pilihan]+" = Rp."+total);
        
            System.out.println("Silahkan Lanjutkan Transaksi Anda");
            System.out.println("___________________________________________________________________");
        
            System.out.println("Pesanan            = "+menu[pilihan]);
            System.out.println("Harga              = Rp."+harga[pilihan]);
            System.out.println("Jumlah Pesanan     = "+jumlah);
            System.out.println("Total Pembayaran   = Rp."+total);
            System.out.print("Masukkan Uang Anda = Rp.");
            int uang = input.nextInt();

         String nama;
            
            //percabangan untuk menentukan kembalian dan menampilkan nota pembayaran
            if(uang>=total){
                
                //perhitungan menggunakan tipe data double untuk menghitung kembalian
                double kembali = uang-total;
                System.out.println("Kembali            = Rp."+kembali);
                        
                System.out.println("___________________________________________________________________");
                System.out.println("***************************Nota Pembayaran*************************");
        
                System.out.print("Nama Pelanggan     = ");
                nama = input.next();
                       
                System.out.println("Pesanan            = "+menu[pilihan]);
                System.out.println("Harga              = Rp."+harga[pilihan]);
                System.out.println("Jumlah Pesanan     = "+jumlah+" porsi");
                System.out.println("Total Pembayaran   = Rp."+total);
                System.out.println("Tunai              = Rp."+uang);
                System.out.println("Kembali            = Rp."+kembali);
      
            }else if(uang<total){
                
                double kurang = total-uang;
                System.out.println("Uang Anda Kurang = Rp."+kurang);
                
                System.out.println("MAAF UANG ANDA TIDAK CUKUP, SILAHKAN MENGULANG KEMBALI");
        }      
            
        }else if(jawab.equalsIgnoreCase("Tidak")){
            System.out.println("Silahkan Datang Kembali Lain Waktu");
        }            
    }

    //method void tutup untuk menampilkan tulisan pada akhir program
    void tutup (){
        System.out.println("");
        System.out.println("                 Selamat Menikmati Makanan Anda");
        System.out.println("");
        System.out.println("===================================================================");
        System.out.println("             Warung Murah Melayani Pemesanan Catering              ");
        System.out.println("                   |Hubungi Kontak Dibawah Ini|                    ");
    }
    
    //method nonvoid string yang akan ditambahkan pada method static 
    String instagram(){
        return "@warungmurah";
    }
    String facebook(){
        return "Warung Murah Jombang";
    }
    String whatsapp(){
        return "08587872837";
    }
}
