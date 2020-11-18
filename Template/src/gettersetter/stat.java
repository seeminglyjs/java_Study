package gettersetter;

public class stat {
	private int power;
	private int dex;
	private int intel;
	
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		if(power < 0) {
			this.power = 0;
		}else {
			this.power = power;
		}
	}
	//0 미만의 값이 들어갈 경우 버그가 생기지 않도록
	//해당 값을 0으로 초기화 시킴
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		if(dex < 0) {
			this.dex = 0;
		}else {
			this.dex = dex;
		}
	}
	//0 미만의 값이 들어갈 경우 버그가 생기지 않도록
	//해당 값을 0으로 초기화 시킴
	
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		if(intel < 0) {
			this.intel = 0;
		}else {
			this.intel = intel;
		}
	}
	//0 미만의 값이 들어갈 경우 버그가 생기지 않도록
	//해당 값을 0으로 초기화 시킴
	
}
