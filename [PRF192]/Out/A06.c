#include<stdio.h>
#include<math.h>
int main(){
	int n,i;
	printf("Nhap n: ");
	scanf("%d",&n);
	int count=0;
	for(i=1;i<=n;i++){
		if(i%3==1 && i>1){
			count++;
		}
	}
	printf("Co %d so tu nhien nho hon n va chia 3 du 1",count);
	
	return 0;
}
