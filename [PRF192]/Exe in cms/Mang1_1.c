#include<stdio.h>
#include<math.h>
int main(){
	int n,i,j;
	int a[100];
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<=n-2;i++){
		for(j=i+1;j<=n-1;j++){
			if(a[i]<a[j]){
				int tg=a[i];
				a[i]=a[j];
				a[j]=tg;
			}
		}
	}
	printf("\nMang sau khi sap xe giam dan: ");
	for(i=0;i<n;i++){
		printf(" %d",a[i]);
	}
	return 0;
}
