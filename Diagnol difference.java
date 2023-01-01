import java.util.*;
public class Diagnol{
public static void main(String[] args){
int sumr=0;
	int suml=0;
int[][] a={{5,8},{3,4}};
for(int i=0;i<a.length;i++) {
	for(int j=i;j==i;j++) {
		sumr=sumr+a[i][j];
	}
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		if((i+j)== (a.length-1)) {
		suml=suml+a[i][j];
	}
	}
}
int diff=Math.abs(sumr-suml);

System.out.print("the ans is="+diff);


	}
 }
