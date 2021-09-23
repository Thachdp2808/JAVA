#include<stdio.h>
int main(){
	int a,b;
	printf("Nhap a=");
	scanf("%d",&a);
	printf("Nhap b=");
	scanf("%d",&b);
	printf("a=%d",a);
	printf("\nb=%d",b);
	printf("\n%d+%d=%6d",a,b,a+b);
	printf("\n%d-%d=%6d",a,b,a-b);
	printf("\n%d*%d=%6d",a,b,a*b);
	float chia=(b==0)?0:(float)a/b;
	printf("\n%d/%d=%6.2f",a,b,chia);
	int du=(b==0)?0:a%b;
	printf("\n%d%%%d=%6d",a,b,du);
	(a==b)?printf("\na bang b"):((a>b)?printf("\na lon hon b"):printf("\na nho b"));
	// Nhap tong so giay ra( gio:phut:giay)
	
	return 0;
}
