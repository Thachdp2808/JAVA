#include<stdio.h>
#include<math.h>
int MTH(int a,int b,int c){
	int max;
	if(a>b && a>c){
		max=a;
	} else{
		if(b>a && b>c){
			max=b;
		} else{
			max=c;
		}
	}
	printf("Max(a,b,c): %d",max);
	return max;

}
int main(){
	int a,b,c;
	printf("Nhap a,b,c: ");
	scanf("%d%d%d",&a,&b,&c);
	MTH(a,b,c);
	return 0;
}
