package tObject;

import java.util.Comparator;

public class compare implements Comparator<compare>{
	
	private int num;


	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	//��ü�� num�� ����ũ�⸦ ���ϱ����� compare ��������
	@Override
	public int compare(compare o1, compare o2) {
		if(o1.getNum() > o2.getNum()) {
			return 1;
		}else if(o1.getNum() == o2.getNum()) {
			return 0;
		}else {
			return -1;
		}
			
	}
}
