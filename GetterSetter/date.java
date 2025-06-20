import java.util.Date;

class Log {
    private Date timestamp;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

public class date{
    public static void main(String[] args) {
        Log log = new Log();
        log.setTimestamp(new Date());
        System.out.println("Timestamp: " + log.getTimestamp());
    }
}
