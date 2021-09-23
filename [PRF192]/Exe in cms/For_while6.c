#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("\nNhap b: ");
	scanf("%d",&b);
	int a1=a;
	int b1=b;
	int i=1;
	while(a!=b){
		if(a>b){
			a=a-b;
		}else{
			b=b-a;
		}
		i++;
	}
	printf("UCLN(%d,%d)= %d",a1,b1,a);
	
	int a2,b2;
	printf("\nNhap a2: ");
	scanf("%d",&a2);
	printf("\nNhap b: ");
	scanf("%d",&b2);
	int a3=a2;
	int b3=b2;
	i=1;
	while(a2!=b2){
		if(a2>b2){
			b2=b2+b3;
		}else{
			a2=a2+a3;
		}
		i++;
	}
	printf("BCNN(%d,%d)= %d",a3,b3,a2);
	return 0;
}
