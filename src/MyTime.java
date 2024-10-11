import java.util.Calendar;
import java.util.TimeZone;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Moscow"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public MyTime(long elapseTime) {
        setTime(elapseTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        this.hour = (int) (totalMinutes / 60) % 24;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}