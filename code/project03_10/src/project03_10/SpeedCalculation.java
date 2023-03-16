package project03_10;

public class SpeedCalculation {
	float speed;
	float distance;
	float time;

	public SpeedCalculation(float speed) {
		this.speed = speed;
	}

	public SpeedCalculation(float distance, float time) {
		speed = calculateSpeed(distance, speed);
		this.distance = distance;
		this.time = time;
	}

	public SpeedCalculation() {
		speed = 0;
		distance = 0;
		time = 0;
	}

	// speed
	public float calculateSpeed(float distance, float time) {
		speed = distance / time;
		return speed;
	}

	// distance
	public float kilometerToMeter(float distance) {
		return distance * 1000;
	}

	public float meterToKilometer(float distance) {
		return distance / (float) 1000;
	}

	// time
	public float hourToMinute(float time) {
		return time * 60;
	}

	public float minuteToSecond(float time) {
		return time * 60;
	}

	public float hourToSecond(float time) {
		return time * 60 * 60;
	}

	public float secondToMillisecond(float time) {
		return time * 1000;
	}

	public String maxSpeed(float speed1, float speed2, float speed3) {
		float[] arr = new float[3];
		float max = 0;
		int k = 0;
		arr[0] = speed1 * calculateSpeed(1, secondToMillisecond(1));
		arr[1] = speed2 * calculateSpeed(kilometerToMeter(1), hourToSecond(secondToMillisecond(1)));
		arr[2] = speed3;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				k = i;
			}
		}
		switch (k) {
		case 0:
			return speed1 + "m/s";
		case 1:
			return speed2 + "km/h";
		case 2:
			return speed3 + "m/ms";
		default:
			return "error";
		}
	}

	// get
	public float getSpeed() {
		return speed;
	}

	public float getDistance() {
		return distance;
	}

	public float getTime() {
		return time;
	}

	// set
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public void setTime(float time) {
		this.time = time;
	}
}
