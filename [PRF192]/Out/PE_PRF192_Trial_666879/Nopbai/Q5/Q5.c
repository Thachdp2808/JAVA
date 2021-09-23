#include<stdio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>
int main(){
	int n;
	scanf("%d",&n);
	char a[n];
	int i;
	for(i=0;i<n;i++){
		scanf("%c",&a[i]);
	}
	int OK=1;
	for(i=0;i<n/2;i++){
		if(a[i]!=a[n-i-1])
			OK=0;//ko phai mang doi xung
	}
	if(OK==1){
		printf("1");
	}else{
		printf("0");
	}
	return 0;
}
