#include<stdio.h>
#include<math.h>
int MTH(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
	
}
void TH(int n){
	if(MTH(n)==1 ){
		printf("n la so nguyen to");
	} else{
		printf("n ko phai so nguyen to");
	}
}
int main(){
	int n;
	printf("Nhap n: ");
	scanf("%d",&n);
	TH(n);
	return 0;
}
