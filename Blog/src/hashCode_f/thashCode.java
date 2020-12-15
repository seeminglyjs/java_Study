package hashCode_f;

public class thashCode {
	public String key;
	
	public thashCode(String key) {
		this.key = key;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof thashCode) {
			thashCode trueKey = (thashCode) obj;
			if(key.equals(trueKey.key)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	
}
