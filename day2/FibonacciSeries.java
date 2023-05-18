package week1.day2;
public class FibonacciSeries {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int firstNum=0,secNum=1,n,i,range=8;
	System.out.println(firstNum+"");
	for(i=1;i<range;++i) {
		n =firstNum+secNum;
		System.out.println(""+n);
		firstNum = secNum;
		secNum=n;
	}
	}

}
