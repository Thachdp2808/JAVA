#include<stdio.h>
#include<math.h>
int Sn(int n){
	int i;
	int S=0;
	for(i=1;i<=n;i++){
		S=S+i;
	}
	return S;
}
int main(){
	int c;
	printf("Enter c: ");
	scanf("%d",&c);
	int i;
	for(i=0;i<=c;i++){
		if(Sn(i)<=c){
			printf("\nn = %d",i);
		}
	}
	return 0;
}
