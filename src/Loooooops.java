
public class Loooooops {
	public static void main(String[] args) {
		//Complete the exercises.
		
		//1. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 1 (inclusive).
		for(int i = 5; i > 0; i--){
			//System.out.println(i);
		}
        
//        2. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 1 to 10 (inclusive).
		int reee = 1;
		while(reee < 11){
			//System.out.println(reee);
			reee++;
		}
        
//        3. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 15 (inclusive).
        for(int niceMeme = 5; niceMeme < 16; niceMeme++){
//        	System.out.println(niceMeme);
        }
        
//        4. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 10 to 100 by 10’s (inclusive).
        int topKek = 10;
        while(topKek <= 100){
//        	System.out.println(topKek);
        	topKek+=10;
        }
        
//        5. The following code should print the values from 1 to 10 (inclusive) but has errors. 
//           Fix the errors so that the code works as intended. 
        int kek = 1;
        while (kek <= 10)
        {
//            System.out.println(kek);
            kek++;
        }
        
//        6. The following code should print the values from 10 to 5, but it has errors. Fix the errors so that the code works as intended.
        for (int x = 10; x >= 5; x--)
        {
//           System.out.println(x);
        }
        
//        7. The following code should print the values from 10 to 1, but it has errors. Fix the errors so that the code works as intended.
        int meme = 10;
        while (meme > 0)
        {
//        	System.out.println(meme);
            meme--;
        }
        
        //8. Write code to print a countdown from 100 to 0 by 10’s.
        for(int i = 100; i >= 0; i-=10){
//        	System.out.println(i);
        }
        
        
        //9. Finish the wordIterate method so that it prints the String parameter minus 
        //   the last character each time through the loop until there are no more characters in the string.
        //   example: wordIterate("bacon");
        //   bacon
        //   baco
        //   bac
        //   ba
        //   b
//        wordIterate("Reeeee");
        
        //10. Finish the xevenxodd method so that it prints all numbers from x to 0 and also prints 'even' or 'odd' next to the appropriate numner
        //    example: xevenxodd(5);
        //    5 odd
        //    4 even
        //    3 odd
        //    2 even
        //    1 odd
        //    0
        //    assume x > 0 and 0 is neither even or odd
//        xevenxodd(10);
        
        //11. Finish the xTimes10 method so that it prints x * 10 from 0 to x.
        //    example: xTimes10(4);
        //    0
        //    10
        //    20
        //    30
        //    40
        //    assume x > 0
//        xTimes10(5);
        
        //12. Finish the removeXs method so that it removes all x's from strings.
        //    example: String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
        //    System.out.println(s);
        //    stuff
//        System.out.println(removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX"));
        
        //13. Finish the superDecrement method so that it prints x to zero x number of times.
        //    example: superDecrement(6);
        //    666666 55555 4444 333 22 1
//        superDecrement(6);
        
        //14. Finish the starBox method so it prints a box of *'s the size of the specified dimensions
        //    example: starBox(3, 5);
        //    ***
        //    ***
        //    ***
        //    ***
        //    ***
//        starBox(3, 5);
        
        //15. Finish the count vowels method so it returns the number of vowels in a String
        //    example: int v = countVowels("Climbing Mount Everest");
        //    System.out.println(v);
        //    7
        System.out.println(countVowels("Climbing Mount Everest"));
	}
	
	
	public static void wordIterate(String word){
		for(int i = word.length(); i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}
	
	public static void xevenxodd(int x){
		for(int i = x; i > -1; i--){
			System.out.print(i + " ");
			if(i == 0){
				System.out.println();
			}
			else if(i % 2 == 0){
				System.out.println("even");
			}else{
				System.out.println("odd");
			}
		}
		
	}
	
	public static void xTimes10(int x){
		for(int i = 0; i <= x; i++){
			System.out.println(i * 10);
		}
	}
	
	public static String removeXs(String wrd){
		String temp = "";
		for(char c: wrd.toCharArray()){
			if(c != 'x' && c != 'X'){
				temp += c;
			}
		}
		return temp;
	}
	
	public static void superDecrement(int x){
		for(int i = x; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
	
	public static void starBox(int w, int h){
		for(int i = h; i > 0; i--){
			for(int j = w; j > 0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int countVowels(String x){
		int count = 0;
		for(char c: x.toCharArray()){
			switch(c){
			case 'a': count++; break;
			case 'e': count++; break;
			case 'i': count++; break;
			case 'o': count++; break;
			case 'u': count++; break;
			case 'A': count++; break;
			case 'E': count++; break;
			case 'I': count++; break;
			case 'O': count++; break;
			case 'U': count++; break;
			}
		}
		return count;
	}
}
