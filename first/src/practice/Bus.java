//자식Bus
package practice;
public class Bus extends Vehicle {
	private String ceiling;
	private String windows;
	public Bus() {
		super(8);
		this.ceiling = "있다.";
		this.windows = "매우 많다.";
	}
	public Bus(String ceiling, String windows) {
		super(4);
		this.ceiling = ceiling;
		this.windows = windows;
	}
	public String getCeiling() {
		return ceiling;
	}
	public void setCeiling(String ceiling) {
		this.ceiling = "있다.";
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = "매우 많다.";
	}
}
