package facematch;

import model.Match;

public class FaceMatch {

	public static void main(String[] args) {
		System.out.println(returnRandomMatches());
	}
	
	private static Match[] returnRandomMatches(){
		Match[] matches = new Match[1];
		
		matches[0] = new Match();
		
		return matches;
		
	}

}
