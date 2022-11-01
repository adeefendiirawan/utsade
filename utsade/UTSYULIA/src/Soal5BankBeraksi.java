/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author YULIA
 */
public class Soal5BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Soal5Bank bank = new Soal5Bank(100_000);
        bank.getSaldo();
        bank.simpanUang(500_000);
        bank.ambilUang(800_000);
        
    }
    
}
