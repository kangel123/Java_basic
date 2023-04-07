package project03_10;

public class TimeCalculator {
	int time;

	public TimeCalculator(int time) {
		 this.time = time;
	 }
	
	public TimeCalculator() {
		 time = 0;
	 }

	public int hourToMinute() {
		return (time / 10000) * 60;
	}

	public int minuteToSecond() {
		return (time / 100) * 60;
	}

	public int hourToSecond() {
		return (time / 10000) * 60 * 60;
	}

	public int timeToSecond() {
		return hourToSecond() + minuteToSecond() + (time % 100);
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}
}
