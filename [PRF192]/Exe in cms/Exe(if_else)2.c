#include<stdio.h>
#include<math.h>
int main(){
	int a;
	printf("So nuoc thang truoc: ");
	scanf("%d",&a);
	int b;
	printf("So nuoc thang nay: ");
	scanf("%d",&b);
	int SD= b-a;
	printf("\nSo nuoc su dung: %d",SD);
	if(SD<=100){
		printf("\nSo tien phai tra: %dVND",800*SD);
	} else{
		if(101<=SD && SD<=150){
			printf("\nSo tien phai tra: %dVND",1200*SD);
		} else{
				printf("\nSo tien phai tra: %dVND",1500*SD);
		}
	}
	return 0;
}
