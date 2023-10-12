/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FurnitureItem;
import Penjualan.transaksi;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class menampilkan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        
        while (loop){
        System.out.println("||==========================================||");
        System.out.println("||         YOURSUN GALLERY FURNITURE        ||");
        System.out.println("||==========================================||");
        System.out.println("|| 1. Daftar karyawan                       ||");
        System.out.println("|| 2. Daftar produk                         ||");
        System.out.println("|| 3. Daftar transaksi                      ||");
        System.out.println("|| 4. Keluar                                ||");
        System.out.println("||==========================================||");
        System.out.println("");
        System.out.println("Silahkan inputkan pilihannya yaa kak ^-^ : ");
        int pilih = input.nextInt();
        if (pilih == 1){
            System.out.println("======================================= ==");
            System.out.println("||          Daftar Karyawan             ||");
            System.out.println("======================================= ==");
            
            karyawan karyawann = new karyawan();
            data_galeri dg = new data_galeri();
            data_galeri dg1 = new data_galeri();
            
            dg.nama = "Reza";
            dg.jabatan = "Manajer";
            dg.lamamasakerja = "2 tahun\n";
            
            dg1.nama = "Ria";
            dg1.jabatan = "Admin";
            dg1.lamamasakerja = "10 bulan";
            
            dg.tampil();
            dg1.tampil();     
            }
        else if(pilih == 2){
            daftar_furniture produk1 = new daftar_furniture ();
            daftar_furniture1 produk2 = new daftar_furniture1();
            produk1.setNama("Halifax Storage");
            produk1.setKategori("Rak");
            produk1.setStyle("Retro");
            produk1.setStok("7");
            produk2.setKeawetan("-+ 10 tahun");
            produk1.setHarga("Rp.700.000");
            
            daftar_furniture produk3 = new daftar_furniture ();
            daftar_furniture1 produk4 = new daftar_furniture1 ();
            produk3.setNama("Linsy Dresser");
            produk3.setKategori("Meja Rias");
            produk3.setStyle("Modern");
            produk3.setStok("4");
            produk4.setKeawetan("-+ 10 tahun");
            produk3.setHarga("Rp.900.000");
            
            System.out.println("||==========================================||");
            System.out.println("||         YOURSUN GALLERY FURNITURE        ||");
            System.out.println("||==========================================||");
            produk_terlaris pt = new produk_terlaris();
            System.out.println("||======= PRODUK FURNITURE TERLARIS ========||");
            System.out.println("Nama produk : " + pt.nama);
            System.out.println("Kategori : " + pt.kategori);
            System.out.println("Style : " + pt.style);
            System.out.println("Stok : " + pt.stok);
            System.out.println("Harga : " + pt.harga);
            System.out.println("Frekuensi penjualan -+ 5 produk/minggu");
            System.out.println("");
            System.out.println("Nama produk : " + produk1.getNama());
            System.out.println("Kategori : " + produk1.getKategori());
            System.out.println("Style : " + produk1.getStyle());
            System.out.println("Stok : " + produk1.getStok());
            System.out.println("Keawetan : " + produk2.getKeawetan() );
            System.out.println("Harga : " + produk1.getHarga());
            System.out.println("");
            System.out.println("Nama produk : " + produk3.getNama());
            System.out.println("Kategori : " + produk3.getKategori());
            System.out.println("Style : " + produk3.getStyle());
            System.out.println("Stok : " + produk3.getStok());
            System.out.println("Keawetan : " + produk4.getKeawetan() );
            System.out.println("Harga : " + produk3.getHarga());
            System.out.println("||==========================================||");    
            }
        
        else if(pilih == 3){
            transaksi tr = new transaksi();
            tr.nama_pelanggan = "Saniii";
            tr.produk_terbeli = "MICKE White Desk";
            tr.metode_pembayaran ="Tunai";
            tr.jumlah = 1;
            tr.total_belanja = "Rp.999.000";
            System.out.println("||============= STRUK BELANJA =============||");
            System.out.println("Nama pelanggan : " + tr.nama_pelanggan);
            System.out.println("Produk yang dibeli : " + tr.produk_terbeli);
            System.out.println("Metode pembayaran : " + tr.metode_pembayaran);
            System.out.println("Jumlah : " + tr.jumlah);
            System.out.println("Total belanja : " + tr.total_belanja); 
            }
        
        else if(pilih == 4){
                System.out.println("Anda telah keluar dari program ^-^");
                
                loop = false;
                }
        else{
            System.out.println("\n Silahkan inputkan pilihan yang benar yaa kak ^-^");
                }
        }
    }   
}
