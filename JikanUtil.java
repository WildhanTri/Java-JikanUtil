import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JikanUtil {
    /**
     * This class provides the various methods 
     * needed to assist in the process
     * of dealing with time data types
     *
     * @author Wildhan Triherlian Saputrawan
     * @version 1.00, 2022=09-13
     * @since JDK1.1
     */

    public static void main(String[] args) {

        // // TEST getDateType
        // System.out.println("getCurrentTime(TIME_YYYY) => " + currTimeInDate(TIME_YYYY));
        // System.out.println("getCurrentTime(TIME_YYYYMM) => " +
        // currTimeInDate(TIME_YYYYMM));
        // System.out.println("getCurrentTime(TIME_YYYYMMDD) => " +
        // currTimeInDate(TIME_YYYYMMDD));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHH) => " +
        // currTimeInDate(TIME_YYYYMMDDHH));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMM) => " +
        // currTimeInDate(TIME_YYYYMMDDHHMM));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMMSS) => " +
        // currTimeInDate(TIME_YYYYMMDDHHMMSS));

        // System.out.println("getCurrentTime(TIME_HH) => " + currTimeInDate(TIME_HH));
        // System.out.println("getCurrentTime(TIME_HHMM) => " + currTimeInDate(TIME_HHMM));
        // System.out.println("getCurrentTime(TIME_MMSS) => " + currTimeInDate(TIME_MMSS));
        // System.out.println("getCurrentTime(TIME_SS) => " + currTimeInDate(TIME_SS));

        // // TEST getLongType
        // System.out.println("getCurrentTime(TIME_YYYY) => " + currTimeInLong(TIME_YYYY));
        // System.out.println("getCurrentTime(TIME_YYYYMM) => " +
        // currTimeInLong(TIME_YYYYMM));
        // System.out.println("getCurrentTime(TIME_YYYYMMDD) => " +
        // currTimeInLong(TIME_YYYYMMDD));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHH) => " +
        // currTimeInLong(TIME_YYYYMMDDHH));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMM) => " +
        // currTimeInLong(TIME_YYYYMMDDHHMM));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMMSS) => " +
        // currTimeInLong(TIME_YYYYMMDDHHMMSS));

        // System.out.println("getCurrentTime(TIME_HH) => " + currTimeInLong(TIME_HH));
        // System.out.println("getCurrentTime(TIME_HHMM) => " + currTimeInLong(TIME_HHMM));
        // System.out.println("getCurrentTime(TIME_MMSS) => " + currTimeInLong(TIME_MMSS));
        // System.out.println("getCurrentTime(TIME_SS) => " + currTimeInLong(TIME_SS));

        // TEST getStringType simplified
        // System.out.println("getCurrentTime(TIME_YYYY) => " + currTimeInString(TIME_YYYY,
        // true));
        // System.out.println("getCurrentTime(TIME_YYYYMM) => " +
        // currTimeInString(TIME_YYYYMM, true));
        // System.out.println("getCurrentTime(TIME_YYYYMMDD) => " +
        // currTimeInString(TIME_YYYYMMDD, true));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHH) => " +
        // currTimeInString(TIME_YYYYMMDDHH, true));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMM) => " +
        // currTimeInString(TIME_YYYYMMDDHHMM, true));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMMSS) => " +
        // currTimeInString(TIME_YYYYMMDDHHMMSS, true));

        // System.out.println("getCurrentTime(TIME_HH) => " + currTimeInString(TIME_HH,
        // true));
        // System.out.println("getCurrentTime(TIME_HHMM) => " + currTimeInString(TIME_HHMM,
        // true));
        // System.out.println("getCurrentTime(TIME_MMSS) => " + currTimeInString(TIME_MMSS,
        // true));
        // System.out.println("getCurrentTime(TIME_SS) => " + currTimeInString(TIME_SS,
        // true));

        // TEST getStringType non-simplified
        // System.out.println("getCurrentTime(TIME_YYYY) => " + currTimeInString(TIME_YYYY,
        // false));
        // System.out.println("getCurrentTime(TIME_YYYYMM) => " +
        // currTimeInString(TIME_YYYYMM, false));
        // System.out.println("getCurrentTime(TIME_YYYYMMDD) => " +
        // currTimeInString(TIME_YYYYMMDD, false));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHH) => " +
        // currTimeInString(TIME_YYYYMMDDHH, false));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMM) => " +
        // currTimeInString(TIME_YYYYMMDDHHMM, false));
        // System.out.println("getCurrentTime(TIME_YYYYMMDDHHMMSS) => " +
        // currTimeInString(TIME_YYYYMMDDHHMMSS));

        // System.out.println("getCurrentTime(TIME_HH) => " + currTimeInString(TIME_HH,
        // false));
        // System.out.println("getCurrentTime(TIME_HHMM) => " + currTimeInString(TIME_HHMM,
        // false));
        // System.out.println("getCurrentTime(TIME_MMSS) => " + currTimeInString(TIME_MMSS,
        // false));
        // System.out.println("getCurrentTime(TIME_SS) => " + currTimeInString(TIME_SS,
        // false));
    }

    // YEAR VARIANT
    public static final String TIME_YYYY = "yyyy";
    public static final String TIME_YYYYMM = "yyyy-MM";
    public static final String TIME_YYYYMMDD = "yyyy-MM-dd";
    public static final String TIME_YYYYMMDDHH = "yyyy-MM-dd HH";
    public static final String TIME_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";
    public static final String TIME_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    // HOUR VARIANT
    public static final String TIME_HH = "HH";
    public static final String TIME_HHMM = "HH:mm";
    public static final String TIME_MMSS = "mm:ss";
    public static final String TIME_SS = "ss";

    public static Date currTimeInDate(String format) {
        return getDate(format);
    }

    public static Long currTimeInLong(String format) {
        return getDate(format).getTime();
    }

    public static String currTimeInString(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(getDate(format));
    }
    
    public static String currTimeInString(String format, Boolean isSimplified) {
        if (isSimplified) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(getDate(format));
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(getDate(format));
        }
    }

    private static Date getDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        Date currentTime = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        String str = sdf.format(currentTime);

        try {
            currentTime = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return currentTime;
    }
}
