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
		//예외의 경우 ClassNotFoundException / InstantiationException / IllegalAccessException 들이 발생할 수 있음
		//근데 한번에 처리하기 위해서 그냥 Exception을 넣음
		
		
		
	}

}
