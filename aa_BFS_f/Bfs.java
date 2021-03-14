package aa_BFS_f;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {

	static int nV; // ������ ��
	static int nE; // ������ ��
	static int [][] arr2d; // ������ ������� ���� �迭
	static boolean [] check; // �湮�� ���� üũ �迭

	static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		// ���Լ���( �������°��� ���� ������.)
		// �� Ư¡�� ������ ť�� Ȱ���ؼ� bfs Ž���� ����
		q.offer(i);
		// ó�� �������� ť�� �ִ´�.

		while(!q.isEmpty()) {
			// ť�� �ִ� ��� ������ �湮�Ҷ����� �ݺ�
			int temp = q.poll();
			// ť�� �ִ� �湮�� ������ �ϳ� ����
			System.out.println("�湮�� ������ -> " + temp + " ");
			for(int j = 1; j < nV + 1; j++) {
				if(arr2d[temp][j] == 1 && check[j] == false) {
					// ���� �������� ���� j �� ������ ����Ǿ����� üũ
					// ����Ǿ�����, ������ �湮�� �������� üũ
					q.offer(j);
					// ��� ���̸� �ش� ���� ť�� �־���
					check[j] = true;
					// ť�� ���� Ȯ���湮 �����̱� ������
					// �湮�迭 üũ.
				}
			}
		}
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		nV = scan.nextInt(); // �����Է�
		nE = scan.nextInt(); // �����Է�
		
		arr2d = new int [nV+1][nV+1];
		check = new boolean [nV+1];
		// 0�� �ƴ� 1���� ���� �ű� ������ 
		// ��� 1�� ������
		
		for(int i = 0; i < nE; i++) {
			int temp1 = scan.nextInt();
			int temp2 = scan.nextInt();
			
			arr2d[temp1][temp2] = arr2d[temp1][temp2] = 1;
			// �������� ������� üũ ����� ��� üũ
		}
		
		System.out.println("Ž��������ġ �Է� - > ");
		int start = scan.nextInt();
		bfs(start);
	}

}
//�Է¿���
//4 4
//1 2
//1 4
//2 3
//3 4
//
//1

