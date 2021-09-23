#include<stdio.h>
#include<math.h>
int main(){
	int a;
	printf("Nhap dien tich hinh tron: ");
	scanf("%d",&a);
	float R=sqrt(a/3.14);
	printf("\nBan kinh tron la: %f",R);
	printf("\nChu vi hinh tron la: %f",2*3.14*R);
	return 0;
}
