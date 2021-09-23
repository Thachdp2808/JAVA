//m le
//n le
#include<stdio.h>
#include<math.h>
int main(){
	int i,j,n,m;
	printf("Nhap n: ");
	scanf("%d",&n);
	printf("\nNhap m: ");
	scanf("%d",&m);
	for(i=1;i<=n;i++){
		for(j=1;j<=m;j++){
			if(i==1 || i==n || j==1 || j==m){
				printf("*");
			}else{
				if(i==(n/2)+1 && j==(m/2)+1){
					printf("*");
				} else{
					printf(" ");
				}
			}
		}
		printf("\n");
	}
	return 0;
}
