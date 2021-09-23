#include<stdio.h>
#include<math.h>
int main(){
	int n,i;
	printf("Nhap n: ");
	scanf("%d",&n);
	int OK=1;
	if(n%2==0){
		for(i=1;i<=n;i++){
			if(i%2==0){
				OK=OK*i;
			}
		}
		printf("\nn!= %d",OK);
	}else{
		for(i=1;i<=n;i++){
			if(i%2!=0){
				OK=OK*i;
			}
		}
		printf("\nn!= %d",OK);
	}
	return 0;
}
