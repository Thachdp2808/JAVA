#include<stdio.h>
#include<math.h>
int main(){
	int n;
	again:
	printf("\nNhap thu bang so: ");
	scanf("%d",&n);
	switch(n){
		case 2:
			printf("\nMonday");break;
		case 3:
			printf("\nTuesday");break;
		case 4:
			printf("\nWednesday");break;
		case 5:
			printf("Thursday");break;
		case 6:
			printf("Friday");break;
		case 7:
			printf("Saturday");break;
		case 8:
			printf("Sunday");break;
		default:
			printf("Khong co trong tuan. Vui long nhap lai...");goto again;break;
	}
	return 0;
}
