package aa_BFS_f;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {

	static int nV; // 정점의 수
	static int nE; // 간선의 수
	static int [][] arr2d; // 정점간 연결관계 저장 배열
	static boolean [] check; // 방문한 정점 체크 배열

	static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		// 선입선출( 먼저들어온것이 먼저 나간다.)
		// 의 특징을 가지는 큐를 활용해서 bfs 탐색을 시작
		q.offer(i);
		// 처음 시작지점 큐에 넣는다.

		while(!q.isEmpty()) {
			// 큐에 있는 모든 정점에 방문할때까지 반복
			int temp = q.poll();
			// 큐에 있는 방문한 정점을 하나 빼줌
			System.out.println("방문한 정점은 -> " + temp + " ");
			for(int j = 1; j < nV + 1; j++) {
				if(arr2d[temp][j] == 1 && check[j] == false) {
					// 현재 정점에서 다음 j 에 정점과 연결되었는지 체크
					// 연결되었으며, 기존에 방문한 정점인지 체크
					q.offer(j);
					// 모두 참이면 해당 정점 큐에 넣어줌
					check[j] = true;
					// 큐에 들어가면 확정방문 정점이기 때문에
					// 방문배열 체크.
				}
			}
		}
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		nV = scan.nextInt(); // 정점입력
		nE = scan.nextInt(); // 간선입력
		
		arr2d = new int [nV+1][nV+1];
		check = new boolean [nV+1];
		// 0이 아닌 1부터 비교할 거기 때문에 
		// 모두 1씩 더해줌
		
		for(int i = 0; i < nE; i++) {
			int temp1 = scan.nextInt();
			int temp2 = scan.nextInt();
			
			arr2d[temp1][temp2] = arr2d[temp1][temp2] = 1;
			// 간선간의 연결관계 체크 양방향 모두 체크
		}
		
		System.out.println("탐색시작위치 입력 - > ");
		int start = scan.nextInt();
		bfs(start);
	}

}
//입력예제
//4 4
//1 2
//1 4
//2 3
//3 4
//
//1

