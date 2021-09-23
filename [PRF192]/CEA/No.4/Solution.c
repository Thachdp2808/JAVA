#include<stdio.h>
#include<math.h>
int main(){
	int n;
	printf("Nhap n: ");
	scanf("%d",&n);
	int i;
	int sum=0;
	for(i=1;i<=n;i=i+3){
		sum=sum+i;
	}
	printf("%d",sum);
	return 0;
}
