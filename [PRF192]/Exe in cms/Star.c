#include<stdio.h>
#include<stdio.h>
int main(){
	int n,m,i,j;
	printf("Nhap n: ");
	scanf("%d",&n);
    for(i=1;i<=n;i++){
    	for(j=1;j<=2*i-1;j++){// hien 1 3 5 7 sao
    		printf("* ");
		}
			printf("\n");
	}
	printf("\nNhap m: ");
	scanf("%d",&m);
	for(i=1;i<=n;i++){
		for(j=1;j<=m;j++){
			if(i==1 || i==n || j==1 || j==m){
				printf("*");
			} else{
				printf(" ");
			}
		}
		printf("\n");
	}
	
	return 0;
}
