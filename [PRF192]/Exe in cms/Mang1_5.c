#include<stdio.h>
#include<math.h>
void input(int a[],int n){
	int i;
	for(i=1;i<=n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%d",&a[i]);
	}
}
void Show(int a[],int n){
	int i;
	printf("\nMang so nguyen vua nhap la: ");
	for(i=1;i<=n;i++){
		printf(" %d",a[i]);
	}
}
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
int CheckSCP(int n){
	int a=sqrt(n);
	int OK;
	if(a*a==n){
		OK=1;
	}else{
		OK=0;
	}
	return OK;
}
void SNN0(int a[],int n){
	int i;
	int min=0;
	int Check=0;
	for(i=1;i<=n;i++){
		if(CheckSCP(a[i])==0){
			Check=1;
			min=a[i];
			break;
		}
	}
	if(Check==1){
	for(i=1;i<=n;i++){
		if(a[i]<min && CheckSCP(a[i])==0){
			min=a[i];
		}
	}
	printf("\nMin la: %d",min);
	}else{
		printf("\nKhong co");
	}
}
void SX(int a[],int n){
	int i,j;
	for(i=0;i<n;i++){
		if(CheckSNT(a[i])==0 && CheckSCP(a[i])==0){
			for(i=0;i<=n-2;i++){
				for(j=i+1;j<=n-1;j++){
					if(a[i]>a[j]){
						int tg=a[i];
						a[i]=a[j];
						a[j]=tg;
			}
		}
	}
}
}
	printf("\nMang sau khi sap xe tang dan: ");
	for(i=1;i<=n;i++){
		printf(" %d",a[i]);
	}
		
	
}
int main(){
	int n,i;
	int a[100];
	printf("Nhap n: ");
	scanf("%d",&n);
	input(a,n);
	Show(a,n);
	int count=0;
	for(i=1;i<=n;i++){
		if(CheckSNT(i)==1){
			count++;
		}
	}
	printf("\nCo %d phan tu co chi so la so nguyen to",count);
	SNN0(a,n);
	SX(a,n);
	return 0;
}
