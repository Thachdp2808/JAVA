#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("\nNhap nam bat ky: ");
	scanf("%d",&a);
	again:
	printf("\nNhap thang bat ky: ");
	scanf("%d",&b);
	switch(b){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:printf("Thang nay co 31 ngay.");break;
		case 4:
		case 6:
		case 9:
		case 11:printf("Thang nay co 30 ngay.");break;
		case 2:{
			int c;
			c=a%4 && a%100 && a%400;
			switch(c){
				case 0:printf("Thang nay co 29 ngay.");break;
				default:printf("Thang nay co 28 ngay.");break;
			}
			break;
		}
		default:printf("Khong co thang nay. Vui long nhap lai...");goto again;break;
	}
	return 0;
}
