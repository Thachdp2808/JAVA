#include<stdio.h>
#include<math.h>
int main(){
	int a[100];
	int n,i;
	printf("Enter n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		printf("\nNhap phan tu thu %d: ",i);
		scanf("%d",&a[i]);
	}
	int max=0;
	for(i=1;i<=n;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	printf("\nVi tri %d la phan tu lon nhat trong day: %d",i-3,max);
	return 0;
}
