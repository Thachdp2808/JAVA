#include<stdio.h>
#include<math.h>
int CheckSNT(int n){
	int i;
	int count=0;
	for(i=1;i<=n/2;i++){
		if(n%i==0){
			count++;
		}
	}
	return count;
}
int main(){
	int n;
	printf("Enter n: ");
	scanf("%d",&n);
	if(CheckSNT(n)==1){
		printf("\n%d is a prime number",n);
	}else{
		printf("\n%d is not a prime number",n);
	}
	return 0;
}
