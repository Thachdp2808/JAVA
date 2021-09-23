#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Chieu dai hinh chu nhat: ");
	scanf("%d",&a);
	printf("Chieu rong hinh chu nhat: ");
	scanf("%d",&b);
	int P=(a+b)*2;
	printf("\nChu vi hinh chu nhat la: %d",P);
	printf("\nDien tich hinh chu nhat la: %d",a*b);
	float dc=sqrt(pow(a,2)+pow(b,2));
	printf("\nDuong cheo hinh chu nhat la: %f",dc);
	return 0;
}
