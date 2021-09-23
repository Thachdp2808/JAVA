#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Nhap giao dich dau: ");
	scanf("%d",&a);
	printf("Nhap giao dich cuoi: ");
	scanf("%d",&b);
	if(b>a){
		printf("\nYou can booked your profit amount: %d ",b-a);
	} else{
		printf("\nYou can booked your hole amount: %d",a-b);
	}
	return 0;
}
