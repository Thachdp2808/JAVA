#include<stdio.h>
#include<math.h>
int main(){
	int i,n;
	int S=0;
	printf("Nhap n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		S=S+i;
	}
	printf("S= %d",S);
	
	int S1=0;
	for(i=1;i<=n;i++){
		if(i%2!=0){
			S1=S1+i;
		}
	}
	printf("\nS1= %d",S1);
	
	int S2=0;
	for(i=1;i<=n;i++){
		if(i%2==0){
			S2=S2+i;
		}
	}
	printf("\nS2= %d",S2);
	return 0;
}
