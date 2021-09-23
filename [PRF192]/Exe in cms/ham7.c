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
void Dem(int n){
	int i;
	printf("\nn so nguyen to dau tien la: ");
	for(i=1;i<100;i++){
		if(MTH(i)==1 && i<2*n){
			printf(" %d",i);
		}
	}
	
}
void SCPL(int n){
	int count=0;
	int i;
	for(i=1;i<=n;i++){
		if(sqrt(i)*sqrt(i)==i && i%2!=0){
			//neu can i*can i =n thi no chi hien cai so n day co phai so chinh phuong hay ko
			//dung can i* can i=i thi no se hien so nho hon
			count++;
		}
	}
	printf("\nCo %d so chinh phuong le nho hon n",count);
}
void Tong(int n){
	int i;
	int S=0;
	for(i=1;i<=n;i++){
		if(n%i==0 && MTH(i)==1){
			S=S+i;
		}
	}
	printf("\nTong nhung uoc so la so nguyen to cua n: %d",S);
}
void BS(int n){	
	int i;
	printf("\n%d boi so dau tien cua n:",n);
	for(i=1;i<=1000;i++){
		if(i%n==0 && i<(n+1)*n ){// 8*8=64 hien ra 7 so thi lay 8*9=72 la duoc
			printf(" %d",i);
		}
	}
}
void S(int n){
	float S=2019;
	int giaithua=1;
	int i;
	for(i=2;i<=n;i++){
		S=S+(float)1/(GT(2*i+1));
	}
	printf("\nS= %f",S);
}
int main(){
	int n;
	do{
		printf("\nNhap n: ");
		scanf("%d",&n);
		if(n%2!=0 || n<0){
			printf("Nhap n duong chan");
		}
	}
	while(n%2!=0 || n<0);
	Dem(n);
	SCPL(n);
	Tong(n);
	BS(n);
	S(n);
	return 0;
}
