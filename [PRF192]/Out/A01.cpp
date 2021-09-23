#include<stdio.h>
#include<math.h>
int main(){
	int n;
	int i;
	int sum=1;
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		sum=sum+(1/i);
	}
	printf("S=%f",(float)sum);
	return 0;
}
