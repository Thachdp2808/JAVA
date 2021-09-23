#include<stdio.h>
#include<stdio.h>
int GT(int n){
	int i;
	int giaithua=1;
	for(i=1;i<=n;i++){
		giaithua=giaithua*i;
	}
	return giaithua;
}
void MTH(int n){
	int i;
	int giaithua =1;
	int KQ;
		KQ=GT(n)*GT(n-1);
	printf("KQ giai thua: %d",KQ);
}
int main(){
	int n;
	printf("Nhap n: ");
	scanf("%d",&n);
	MTH(n);
	return 0;
}
