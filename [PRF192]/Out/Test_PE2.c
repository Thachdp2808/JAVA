#include<stdio.h>
#include<math.h>
int main(){
	int n;
	printf("Enter n: ");
	scanf("%d",&n);
	int sum=0;
	int i;
	for(i=0;i<=n;i++){
		if(i%2==0){
			sum=sum+i;
		}
	}
	printf("\n%d",sum);
	return 0;
}
