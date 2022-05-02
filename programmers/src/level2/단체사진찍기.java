package level2;

public class 단체사진찍기 {

	private String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
	
	public static void main(String[] args) {
		int n = 2;
		String[] data = { "N~F=0", "R~T>2" };
		int answer = 0;
		
		boolean[] isVisited = new boolean[8];
		//answer = dfs("", isVisited, data);
		
		System.out.println(answer);
	}

	
}
