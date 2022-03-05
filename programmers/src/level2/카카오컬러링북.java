package level2;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author jenny
 * @date 2022. 2. 27. - 오후 2:46:57
 * @subject 프로그래머스 Level2
 * @content 카카오 프렌즈 컬러링북
 */
public class 카카오컬러링북 {

	public static void main(String[] args) {
		int m = 13, n = 16;
		int[][] picture =  {
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0},
				{0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0},
				{0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}
		}; //  12, 120
		
		int numberOfArea = 0; // 영역의 개수
		int maxSizeOfOneArea = 0; 
		
		boolean[][] visited = new boolean[m][n];

		// 시작 노드부터 체크.
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// 방문한적 없고 색칠된 영역이면 탐색
				if( !visited[i][j] && picture[i][j] != 0 ) {
					maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs( i, j, picture, visited ));
					numberOfArea++;
				}
			}
		}

		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;

		System.out.println(Arrays.toString(answer));

	}

	public static int bfs(int x, int y, int[][] picture, boolean[][] visited) {
		int count = 1;
		int[] moveX = { 0, 1, 0, -1 };
		int[] moveY = { 1, 0, -1, 0 };

		LinkedList<Node> list = new LinkedList<>();

		list.add( new Node( x, y) );
		visited[x][y] = true;

		int m = picture.length;
		int n = picture[0].length;
		
		while( !list.isEmpty() ) {
			Node curNode = list.poll();
			int curX = curNode.x;
			int curY = curNode.y;

			for (int i = 0; i < 4; i++) {
				int nextX = curX + moveX[i];
				int nextY = curY + moveY[i];

				if( nextY >= 0 && nextY < n && nextX >= 0 && nextX < m ) { 
					if( picture[nextX][nextY] == picture[curX][curY] && !visited[nextX][nextY] ) { // 이전 좌표 값과 값이 같고, 방문한적 X 
						visited[nextX][nextY] = true;
						list.add( new Node( nextX, nextY ) );
						count++;
					}
				}
			}

		}

		return count;
	}

	//좌표의 위치를 나타내주는 클래스 
	static class Node {
		int x;
		int y;

		public Node( int x, int y ) {
			this.x = x;
			this.y = y;
		}
	}
	
}

