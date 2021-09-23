//m chan
//n le
#include<stdio.h>
#include<math.h>
int main(){
	int i,j,m,n,g;
	printf("Nhap n: ");
	scanf("%d",&n);
	printf("Nhap m: ");
	scanf("%d",&m);
	for(i=1;i<=n;i++){
		for(j=1;j<=m;j++){
			if(i==1 || i==n || j==1 || j==m){
				printf("*");
				
			} else{
				   if(i==(n/2)+1 && j==m/2){
				   	for(g=1;g<=(m/2);g++){
					  printf("*");
				   }
			    } else{
			    	printf(" ");
				}
				}
		}
		printf("\n");
	}
	return 0;
}
