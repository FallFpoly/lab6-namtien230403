/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine().trim(); 

        
        int viTriDau = hoTen.indexOf(" ");
        int viTriCuoi = hoTen.lastIndexOf(" ");

        
        String ho = hoTen.substring(0, viTriDau);
        String tenDem = hoTen.substring(viTriDau + 1, viTriCuoi);
        String ten = hoTen.substring(viTriCuoi + 1);

        
        System.out.println("Ho: " + ho.toUpperCase());
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten.toUpperCase());
    }
}
