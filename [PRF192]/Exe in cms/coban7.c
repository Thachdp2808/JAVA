#include<stdio.h>
#include<math.h>
int main(){
	int xA,yA;
	int xB,yB;
	printf("Nhap toa do diem A: ");
	scanf("%d%d",&xA,&yA);
	printf("Nhap toa do diem B: ");
	scanf("%d%d",&xB,&yB);
	float dAB=sqrt(pow((xB-xA),2)+pow((yB-yA),2));
	printf("\nKhoang cach giua 2 diem A va B la: %f",&dAB);
	int xM=(xB-xA)/2;
	int yM=(yB-yA)/2;
	printf("\nToa do diem M cua hai diem A va B la: %d,%d",xM,yM);
	return 0;
}
