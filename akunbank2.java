public class akunbank2 {
    int saldoAwal;
    int ambilUang;
    int simpanUang;
    int saldoSetelahAmbil;
    int saldoSetelahSimpan;

    public static void main(String[] args) {
        akunbank2 akun= new akunbank2();
        
        akun.saldoAwal = 100000; // saldo awal sebagai integer
        akun.ambilUang = 50000; // Jumlah uang yang ingin diambil
        akun.simpanUang = 150000; // Jumlah uang yang ingin disimpan

        // Hitung saldo setelah pengambilan uang
        akun.saldoSetelahAmbil = akun.saldoAwal - akun.ambilUang;

        // Hitung saldo setelah menyimpan uang
        akun.saldoSetelahSimpan = akun.saldoSetelahAmbil + akun.simpanUang;

        // Output saldo dan nilai uang yang diambil dan disimpan
        System.out.println("SELAMAT DATANG DI BANK KRUT UHUYY"); 
        System.out.println("Saldo awal: " + akun.saldoAwal);
        System.out.println("Jumlah uang yang ingin diambil: " + akun.ambilUang);
        System.out.println("Saldo setelah pengambilan uang: " + akun.saldoSetelahAmbil);
        System.out.println("Jumlah uang yang ingin disimpan: " + akun.simpanUang);
        System.out.println("Saldo setelah menyimpan uang: " + akun.saldoSetelahSimpan);
    }
}
