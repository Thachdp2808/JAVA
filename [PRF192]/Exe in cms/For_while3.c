#include<stdio.h>
#include<math.h>
int main(){
	int n,i,j;
	int sum=0;
	for(i=1;i<=100;i++){
		if(i%3==0){
			sum=sum+i;
		}
	}
	printf("Cac so chia het cho 3 tu 1 den 100 la: %d",sum);
	return 0;
}
