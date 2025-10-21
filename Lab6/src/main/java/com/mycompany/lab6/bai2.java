/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author ICT
 */

class SanPham {
    String tenSp;
    double gia;
    String hang;

    
    public SanPham() {}

    
    public void nhap(Scanner scanner) {
        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        gia = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap hang san pham: ");
        hang = scanner.nextLine();
    }

    
    public void xuat() {
        System.out.println("Ten SP: " + tenSp + ", Gia: " + gia + ", Hang: " + hang);
    }
}

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSach = new ArrayList<>();

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap(scanner);
            danhSach.add(sp);
        }

        
        System.out.println("\nCac san pham thuoc hang Nokia:");
        for (SanPham sp : danhSach) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
        
        
    
        