#include<stdio.h>
#include<math.h>
int CheckSNT(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
}
int main(){
	int n;
	int i;
	float a[100];
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%f",&a[i]);
	}
	int count=0;
	for(i=0;i<=n;i++){
		if(i%2!=0 && a[i]<0){
			count++;
		}
	}
	printf("\nCo %d phan tu am co chi so le",count);
	int S=0;
	for(i=0;i<=n;i++){
		if(CheckSNT(a[i])==1){
			S=S+a[i];
		}
	}
	printf("\nTong phan tu la so nguyen to la: %d",S);
	return 0;
}
