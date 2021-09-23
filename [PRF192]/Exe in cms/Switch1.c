#include<stdio.h>
#include<math.h>
int main()
{
	int a,b;
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("Nhap b: ");
	scanf("%d",&b);
	again:
	printf("\nMenu: ");
	printf("\n1: Tong");
	printf("\n2: Hieu");
	printf("\n3: Tich");
	printf("\n4: Thuong");
	printf("\nChoose an option: ");
    int option;
	scanf("%d", &option);
	switch(option){
		case 1:printf("\nTong= %d",a+b);break;
		case 2:printf("\nHieu= %d",a-b);break;
		case 3:printf("\nTich= %d",a*b);break;
		case 4:printf("\nThuong= %d",a/b);break;
		default:printf("\nNhap lai");goto again;break;
	}
	return 0;
}

// coi n la diem thi cua chung ta
//xep loai hoc luc theo tieu chi sau
//1. diem<=4: yeu kem
//2. 4<diem<7:trung binh
//3. 7<= diem<8: kha
//4. 8<= diem<9: gioi
//5 diem>=9: xuat sac

	
