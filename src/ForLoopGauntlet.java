
public class ForLoopGauntlet {
public static void main(String[] args) {
	
	for(int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for(int j = 100; j < 0; j--) {
		System.out.println(j);
	}
	
	for(int k = 2; k < 101; k++) {
		if(k%2 == 0) {
			System.out.println(k);
		} else {
		}
		}
	
	for (int l = 1; l < 101; l++) {
		if(l%2 == 1) {
			System.out.println(l);
		} else {
		}
		}
	for (int m = 1; m < 501; m++) {
		if(m%2 == 0) {
			System.out.println(m + " is even");
		} else {
			System.out.println(m + " is odd");
		}
	}
	for(int n = 0; n < 778; n++) {
		if(n%7 == 0) {
			System.out.println(n);
		}
	}
	for (int i = 2002; i< 2019; i++ ) {
		int age = i - 2002;
		System.out.println("In the year " + i +" I was " + age);
	}

	for(int i=0; i < 9; i+=3) {
		for( int j = 1; j < 4; j++) {
			System.out.print(j + i);
		} System.out.println();	
	}
	for(int i = 0; i < 100; i+=10) {
		for(int j = 1; j < 11; j++) {
			if (i + j < 10) {
				System.out.print(" ");
			}
		System.out.print(j + i + " ");
	} System.out.println();

}
	for(int i = 0; i < 1; i++) {
		System.out.print("*");
		System.out.println();
		for(int j = 1; j < 6; j+=4) {
			System.out.print("*");
			
		} System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();
		System.out.print("******");
	}
}}


