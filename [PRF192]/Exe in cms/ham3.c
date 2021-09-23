#include<stdio.h>
#include<math.h>
void MTH(int n){
	int i;
	printf("\nUoc cua %d la:",n);
	for(i=1;i<=n;i++){
		if(n%i==0){
			printf(" %d",i);
		}
	}
}
int main(){
	int n;
	printf("Nhap n: ");
	scanf("%d",&n);
	MTH(n);
	return 0;
}
