package Generic2_f;

public class specice <T> {
		private String name;
		private T[] specices;
		
		public specice(String name, int num) {
			this.name = name;
			specices = (T[])(new Object[num]);
			// ���׸� Ÿ���� �迭�� ����ȯ�� ���ش�.
		}
		
		public String getName() {
			return name;
		}
		
		public T[] getSpecices() {
			return specices;
		}
		
		public void add(T t) {
			for(int i = 0; i < specices.length; i++) {
				if(specices[i] == null) {
					specices[i] = t;
					break;
				}
			}
		}	
}
