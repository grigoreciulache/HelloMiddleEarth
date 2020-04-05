package HelloMiddleEarth;

public class HelloMiddleEarth {

	public static void main(String[] args) {
		String names[] = {"Bilbo","Frodo","Aragons","Legolas","Gandalf","you","me"};
		//print greetings
		/*
		for(int i=0; i<names.length; i++) {
			System.out.format("Hello ,%s!\n",names[i]);
		}
		*/
		//change loop for to for each
		for(String name:names) {
			System.out.format("Hello ,%s!\n",name);
		}
	}

}
