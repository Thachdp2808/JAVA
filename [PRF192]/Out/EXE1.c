#include<stdio.h>
#include<math.h>
int main(){
	int a,b;
	printf("Nhap toa do diem: ");
	scanf("%d%d",&a,&b);
	if(a>0 && b>0){
		printf("\nToa do diem(%d,%d) nam trong goc phan tu thu nhat.",a,b);
	} else{
		if(a>0 && b<0){
			printf("\nToa do diem(%d,%d) nam trong goc phan tu thu hai.",a,b);
		} else{
			if(a<0 && b<0){
				printf("\nToa do diem(%d,%d) nam trong goc phan tu thu ba.",a,b);
			} else{
				printf("\nToa do diem(%d,%d) nam trong goc phan tu thu tu.",a,b);
			}
		}
	}
	return 0;
}
