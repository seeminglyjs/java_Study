package Generic2_f;

public class specice <T> {
		private String name;
		private T[] specices;
		
		public specice(String name, int num) {
			this.name = name;
			specices = (T[])(new Object[num]);
			// 제네릭 타입의 배열로 형변환을 해준다.
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
