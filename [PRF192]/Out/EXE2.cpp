#include<stdio.h>
#include<math.h>
int main(){
	int a,b,c;
	printf("Nhap diem Toan: ");
	scanf("%d",&a);
	printf("Nhap diem Vat ly: ");
	scanf("%d",&b);
	printf("Nhap diem Hoa: ");
	scanf("%d",&c);
	if(a>=65 && b>=55 && c>=50 && a+b+c>=190 || a+b>=140){
		printf("The candidate is eligible");
	} else{
		printf("The candidate is not eligible");
	}
	return 0;
}
