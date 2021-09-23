#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Enter a: ");
	scanf("%d",&a);
	printf("ENter b: ");
	scanf("%d",&b);
	if(a==b){
		printf("a=b");
	}else{
		if(a>b){
			printf("a>b");
		} else{
			printf("a<b");
		}
	}
	return 0;
}
