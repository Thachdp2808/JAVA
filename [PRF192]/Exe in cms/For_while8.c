#include<stdio.h>
#include<math.h>
int main(){
	int n,i;
	printf("Nhap n: ");
	scanf("%d",&n);
	printf("\nCac so nguyen to nho hon n la:");
	for(i=1;i<=n;i++){
		if(i%1==0 && i%i==0){
			printf(" %d",i);
		}
	}
	return 0;
}
