package NewInstance;

import ClassGetName.Action;

public class main {

	public static void main(String[] args) {
		
		
		try {
			Class clazz = Class.forName("ClassGetName.SendAction");
			Action a =(Action) clazz.newInstance();
			a.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try {
			Class clazz2 = Class.forName("ClassGetName.ReceiveAction");
			Action a =(Action) clazz2.newInstance();
			a.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		//������ ��� ClassNotFoundException / InstantiationException / IllegalAccessException ���� �߻��� �� ����
		//�ٵ� �ѹ��� ó���ϱ� ���ؼ� �׳� Exception�� ����
		
		
		
	}

}
