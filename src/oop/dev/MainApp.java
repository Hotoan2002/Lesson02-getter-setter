package oop.dev;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap vao nguoi thu" + (i+1));
			arr[i] = new Person();
			System.out.println("Nhap ten");
			arr[i].setName(sc.nextLine());
			
			System.out.println("Nhap tuoi");
			arr[i].setOld(sc.nextInt());
			
			System.out.println("Toan");
			arr[i].setToan(sc.nextFloat());
			
			System.out.println("Ly");
			arr[i].setLy(sc.nextFloat());
			
			System.out.println("Hoa");
			arr[i].setHoa(sc.nextFloat());
		}
		//in ra danh sach sinh vien
		for (int i = 0; i < arr.length; i++) {
			System.out.format("Name:%s - Old:%d - DTB:%.2f" , arr[i].getName(), arr[i].getOld(), arr[i].dtb());
		}
		//tim dtb cao nhat
		float dtb = arr[0].dtb();
		for (int i = 0; i < arr.length; i++) {
			if(dtb < arr[i].dtb());
				dtb = arr[i].dtb();
			//in ra danh sach co dtb cao nhat
				Print(arr);
			//sap xep
			for (int j = 0; j < arr.length; j++) {
					if(arr[i].dtb() < arr[j].dtb()){
						Person sv = arr[i];
						arr[i] = arr[j];
						arr[j] = sv;		
				}
			}			
		}			
	}

	private static void Print(Person[] arr) {
		// TODO Auto-generated method stub	
	}
}
