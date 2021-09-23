#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Nhap a: ");
	scanf("%d",&a);
	printf("Nhap b: ");
	scanf("%d",&b);
	if(a%b==0){
		printf("\nb la uoc cua a");
	} else{
		if(b%a==0){
			printf("\na la uoc cua b");
		} else {
			printf("\na va b ko phai uoc cua nhau");
		}
	}
	return 0;
}
