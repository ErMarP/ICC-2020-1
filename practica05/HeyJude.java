public class HeyJude {
    public static void main(String [] args) {
	String jude = "Hey Jude, ";
	
	String dont = "don´t ";
	
	String bad = "make it bad ";
	String afraid = "be afraid ";
	String down = "let me down ";

	String sadSong = "Take a sad song and make it better ";
	String getHer = "You were made to go out and get her ";
	String foundHer = "You have found her, now go and get her ";

	String remember = "Remember to ";

	String heart = "let her into your heart ";
	String skin = "let her under your skin ";

	String then = "Then you ";

	String start = "can start ";
	String begin = "begin ";

	String makeBetter = "to make it better ";

	String better = "better ";
	String oh = "oh";

	String Na = "Na ";
	String na = "na ";

	int p = 0;
        
	while (p < 7){
	    if(p == 0 || p == 1 || p == 3 || p == 5) {
		System.out.print(jude);
	    }
            if (p == 0 || p == 1 || p == 3 || p == 5) {
		System.out.print(dont);
	    }
	    if (p == 0 || p == 5) {
                 System.out.println(bad);
	    }
	    if (p == 1) {
                System.out.println(afraid);
	    }
	    if (p == 3) {
                System.out.println(down);
	    }

	    if (p == 0 || p == 5) {
		System.out.println(sadSong); 
	    }
	    if (p == 1) {
		System.out.println(getHer);
	    }
	    if (p == 3) {
		System.out.println(foundHer);
	    }
	    if (p == 0 || p == 1 || p == 3 || p == 5) {
                System.out.print(remember);
	    }
            if (p == 0 || p == 3) {
                System.out.println(heart);
	    }
            if (p == 1 || p == 5) {
                System.out.println(skin);
	    }
            if (p == 0 || p == 1 || p == 3 || p == 5) {
                System.out.print(then);
	    }
            if (p == 0 || p == 3) {
                System.out.print(start);
	    }
            if (p == 1 || p == 5) {
                System.out.print(begin);
	    }
            if (p == 0 || p == 1 || p == 3 || p == 5) {
                System.out.println(makeBetter);
	    }
	    if (p == 2 || p == 4 || p == 6) {
		System.out.print(Na);
	    }
            if (p == 2 || p == 4) {
                int n = 0;
		    while (n < 9){
		        System.out.print(na);
		        n ++;
		}
		System.out.println();
	    }
	      if (p == 6) {
                int n2 = 0;
                    while (n2 < 9){
                        System.out.print(na);
                        n2 ++;
	        }
	    }
	    if (p == 5) {
		int b = 0;
		    while (b < 5){
			System.out.print(better);
			b ++;
		    }
	    }
	    if (p == 5) {
		System.out.println(oh);
	    }
	    if (p == 6) {
		System.out.print(jude);
	    }
	    System.out.println();
	    p =  p + 1;
	}   
	
    }
}
