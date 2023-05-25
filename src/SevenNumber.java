
public class SevenNumber {

	public static void main(String[] args) {
		for (int i = 1 ; i<=100 ; i++) {
			if ((i%7==0) || ((i-7)%10)==0 || (i>=70 && i<=79)) {
				System.out.println("clap!");
			} else {
					System.out.println(i);
				}
			}

	/*	for(int i = 1; i <= 100; i++) {
        	if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
            	System.out.println("clap!");
        	} else {
            		System.out.println(i);
        		}
    		}
	*/
		}

	}


