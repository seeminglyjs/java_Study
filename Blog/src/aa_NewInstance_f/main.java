package aa_NewInstance_f;

public class main {

	public static void main(String[] args) {
		
		
		try {
			Class clazz1 = Class.forName("NewInstance.BodyInfo");
			Info info =(Info) clazz1.newInstance();
			//리턴값이 Object이기 때문에 Info로 한 번 감싸준다.
			info.myInfo();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try {
			Class clazz2 = Class.forName("NewInstance.PersonalInfo");
			Info info =(Info) clazz2.newInstance();
			//리턴값이 Object이기 때문에 Info로 한 번 감싸준다.
			info.myInfo();
		}catch(Exception e){
			e.printStackTrace();
		}
		//예외의 경우 ClassNotFoundException / InstantiationException / IllegalAccessException 들이 발생할 수 있음
		//근데 한번에 처리하기 위해서 그냥 Exception을 넣음	
	}

}
