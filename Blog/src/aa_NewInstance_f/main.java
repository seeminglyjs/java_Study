package aa_NewInstance_f;

public class main {

	public static void main(String[] args) {
		
		
		try {
			Class clazz1 = Class.forName("NewInstance.BodyInfo");
			Info info =(Info) clazz1.newInstance();
			//���ϰ��� Object�̱� ������ Info�� �� �� �����ش�.
			info.myInfo();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try {
			Class clazz2 = Class.forName("NewInstance.PersonalInfo");
			Info info =(Info) clazz2.newInstance();
			//���ϰ��� Object�̱� ������ Info�� �� �� �����ش�.
			info.myInfo();
		}catch(Exception e){
			e.printStackTrace();
		}
		//������ ��� ClassNotFoundException / InstantiationException / IllegalAccessException ���� �߻��� �� ����
		//�ٵ� �ѹ��� ó���ϱ� ���ؼ� �׳� Exception�� ����	
	}

}
