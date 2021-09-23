#include<stdio.h>
#include<math.h>
int main(){
	int n;
	int i;
	float sum=1;
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=2;i<=n;i++){
		sum=sum+(1.0/i);
	}
	printf("S=%f",sum);
	return 0;
}
