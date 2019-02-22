import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeNow {

    public static void main(String[] args) {
	    
	    String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
	    System.out.println("Data odierna: " + timeStamp);
    }
}