/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ICT
 */
public class bai3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSach = new ArrayList<>();

        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String regexSDT = "^(0|\\+84)[0-9]{9,10}$";
        String regexCMND = "^[0-9]{9,12}$";

        for (int i = 1; i <= 5; i++) {
            System.out.println("Nhap thong tin sinh vien " + i + "");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();

            String email;
            while (true) {
                System.out.print("Email: ");
                email = scanner.nextLine();
                if (Pattern.matches(regexEmail, email)) {
                    break;
                } else {
                    System.out.println("Nhap sai !");
                }
            }

            String sdt;
            while (true) {
                System.out.print("So dien thoai: ");
                sdt = scanner.nextLine();
                if (Pattern.matches(regexSDT, sdt)) {
                    break;
                } else {
                    System.out.println("Nhap sai !)");
                }
            }

            String cmnd;
            while (true) {
                System.out.print("CMND/CCCD: ");
                cmnd = scanner.nextLine();
                if (Pattern.matches(regexCMND, cmnd)) {
                    break;
                } else {
                    System.out.println("Nhap sai !");
                }
            }

            danhSach.add(new SinhVien(hoTen, email, sdt, cmnd));
        }

        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");
        for (SinhVien sv : danhSach) {
            sv.xuat();
        }
    }
}
class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
        System.out.println("-------------------------");
    }
}
