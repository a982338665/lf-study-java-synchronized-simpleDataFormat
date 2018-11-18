package pers.li.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by lishengbo 2018/11/18
 *
 * 线程不安全的单例模式
 * 在生产环境中一定负载情况下时，会出现各种不同的情况，比如转化的时间不正确，比如报错，比如线程被挂死等等
 * 线程测试如下:
 * {@link SecondDateUtilTest}
 */
public class SecondDateUtil {

    private static final  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static  String formatDate(Date date)throws ParseException{
        return sdf.format(date);
    }

    public static Date parse(String strDate) throws ParseException{

        return sdf.parse(strDate);
    }
}
