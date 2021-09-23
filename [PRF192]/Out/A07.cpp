#include<stdio.h>
#include<math.h>
int main(){
	int a,c,b,d;
	printf("Nhap a,b,c,d: ");
	scanf("%d%d%d%d",&a,&b,&c,&d);
	int max=a;
	if(a>b && a>c && a>d){
		max=a;
	} else{
		if(b>a && b>c && b>d){
			max=b;
		} else{
			if(c>a && c>b && c>d){
				max=c;
			} else{
				max=d;
			}
		}
	}
	printf("Max= %d",max);
	return 0;
}
