#include<stdio.h>
#include<math.h>
int main(){
	int n,i,j;
	printf("Nhap n: ");
	scanf("%d",&n);
	i=1;
	int OK;
	while(i<=n){
		if(sqrt(i)*sqrt(i) == n){
	 	  OK=1;
		}
		i++;
	}
	if(OK==1){
		printf("\nn la so chinh phuong");
	} else{
		printf("\nn khong la so chinh phuong");
	}
	
	
	i=1;
	int count=0;
	while(i<=n/2){
		if(n%i==0){
			count++;
		}
		i++;
	}
	if(count==1){
		printf("\nn la so nguyen to");
	} else{
		printf("\nn khong la so nguyen to");
	}
	return 0;
}
