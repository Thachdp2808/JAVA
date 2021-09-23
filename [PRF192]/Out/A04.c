#include<stdio.h>
#include<math.h>
int main(){
	int n,i;
	int sum=0;
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		if(i%7!=0){
			sum=sum+i;
		}
	}
	printf("\nTong= %d",sum);
	return 0;
}
