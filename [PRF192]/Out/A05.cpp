#include<stdio.h>
#include<math.h>
int main(){
	int a,b,c;
	do{
		printf("\nNhap a,b,c la do dai 3 canh tam giac: ");
		scanf("%d%d%d",&a,&b,&c);
		if(a+b<c || a+c<b || b+c<a){
			printf("\nTong cua 2 canh bat ky lon hon canh con lai.Nhap lai....");
		}
	}
	while(a+b<c || a+c<b || b+c<a);
	return 0;
}
