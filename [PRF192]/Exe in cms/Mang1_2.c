#include<stdio.h>
#include<math.h>
int main(){
	int n,i,j;
	int a[100];
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%d",&a[i]);
	}
	int count=0;
	for(i=0;i<=n;i++){
		if(a[i]%2==0 && i%2!=0){
			count++;
		}
	}
	int S=0;
	for(i=0;i<=n;i++){
		if(i%2!=0 && a[i]%2==0){
			S=S+a[i];
		}
	}
	printf("\nTrung binh cac phan tu chan co chi so le la: %f",(float)S/count);
	for(i=1;i<=n;i++){
		if(a[i]%2==0 && a[i]%3!=0){
			printf("\nPhan tu thu %d: %d",i,a[i]);
		}	
	}
	return 0;
}
