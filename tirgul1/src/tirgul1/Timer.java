package tirgul1;

public class Timer {
	private int m, s;

	public Timer(int m1, int s1) {
		m = m1;
		s = s1;

	}
	public Timer(int s) {
		m=s/60;
		this.s=s%60;
	}

	public String toString() {
		if(s<10)
			return "(" + m + ":" +"0" + s + ")";
		else
			return "(" + m + ":" + s + ")";
	}
	public int totalSeconds() {
		return (m*60+s);
	}
	public void printInfo() {
		System.out.println(toString() + " in total seconds: " + totalSeconds());
	}
	public boolean tickDown() {
		if(m==0 && s==0)
			return false;
		else if(s==0) {
			m--;
			s=s+59;
			return true;
		}
		else {
			s--;
			return true;
		}
	}
	public Timer diff(Timer other) {
		if(other.totalSeconds() > totalSeconds())
			return null;
		return new Timer(totalSeconds() - other.totalSeconds());
	}
}
