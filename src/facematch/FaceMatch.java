package facematch;

import model.Match;

public class FaceMatch {

	public static void main(String[] args) {
		System.out.println(returnRandomMatches());
	}
	
	private static Match[] returnRandomMatches(){
		Match[] matches = new Match[2];
		
		matches[0] = new Match();
		matches[1] = new Match();
		
		return matches;
		
	}
	

	public void doSomething(){
	
	}

}
