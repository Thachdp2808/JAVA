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
int GT(int n){
	int i;
	int GT=1;
	for(i=1;i<=n;i++){
		GT=GT*i;
	}
	return GT;
}
void TH(int n){
	if(MTH(n)==1){
		printf("\n%d la so nguyen to",n);
	} else{
		printf("\n%d khong la so nguyen to",n);
	}
}
void SCP(int n){
	int a=sqrt(n);
	if(a*a==n){
		printf("\n%d la so chinh phuong",n);
	}else{
		printf("\n%d khong la so chinh phuong",n);
	}
}
void GiaiT(int n){
	int i;
	int giaithua=1;
	for(i=1;i<=n;i++){
		giaithua=giaithua*i;
	}
	printf("\nGiai thua cua %d la: %d",n,giaithua);
}
void S(int n){
	int i;
	int giaithua=1;
	float Tong=0;
	for(i=1;i<=n;i++){
		giaithua=giaithua*i;
		Tong=Tong+(float)1.0/(GT(2*i));
	}
	printf("\nS= %f\n",Tong);
}
void TGC(int n){
	int i,j;
	for(i=1;i<=n;i++){		
		for(j=1;j<=n-i;j++)
			printf(" ");
		for(j=1;j<=2*i-1;j++)
			printf("*");
			printf("\n");

}
}
void DSNT(int n){
	int count;
	int dem=0;
	int i;
	for(i=1;i<n;i++){
		if(MTH(i)==1 && i>20){
			dem++;
		}
	}
	printf("\nCo %d",dem);
}
void TSCPL(int n){
	int a=sqrt(n);
	int i;
	int TongL=0;
	for(i=1;i<=n;i++){
		if(sqrt(i)*sqrt(i)==i && i%2!=0){
			TongL=TongL+i;
		}
	}
	printf("\nTong so chinh phuong le tu 1 den n la: %d",TongL);
		
	
}
int main(){
	int n;
	do{
		printf("\nNhap n: ");
		scanf("%d",&n);
		if(n>=10 || n<=0){
			printf("Nhap n trong khoang 10>n>0");
		}
	}
	while(n>=10 || n<=0);
	TH(n);
	SCP(n);
	GiaiT(n);
	S(n);
	TGC(n);
	DSNT(60);
	TSCPL(n);
	return 0;
}
