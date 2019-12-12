/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_mentoring;

/**
 *
 * @author Yusuf Hijriah
 */
public class Tugas_mentoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] data = {
        {"|1", "Muhammad Audi Pramudia\t\t", "1", "\tIlkom|"},
        {"|2", "Juniadi\t\t\t\t", "2", "\tIlkom|"},
        {"|3", "Muhammad Pandu Surya Pranata\t", "3", "\tEntah|"},
        {"|4", "Beta Riadi\t\t\t", "4", "\tEntah|"},
        {"|5", "Muhammad Yusuf Hijrah\t\t", "5", "\tIlkom|"},
        {"|6", "Crishtuaji Satrio Edi Mudjiatmiko", "6", "\tIlkom|"},
        {"|7", "Muhammad Agus Alfan Salim Hamid\t", "7", "\tIlkom|"},
        {"|8", "Gia Fergio\t\t\t", "8", "\tEntah|"}};
        System.out.println("______________________________________________________________________");
        System.out.println("|No\t" + "Nama\t\t\t\t\t" + "Absen\t\t" + "Kelas|");
        System.out.println("|____________________________________________________________________|");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3] + "\t");
            System.out.println("|____________________________________________________________________|");
        }
    }
}
