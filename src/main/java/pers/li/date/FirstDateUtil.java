package pers.li.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by lishengbo 2018/11/18
 *
 * 应当尽量少的创建SimpleDateFormat 实例,可优化
 * 将有线程安全问题的对象由共享变为局部或私有都可以解决线程安全问题，不过会加重创建对象的负担
 */
public class FirstDateUtil {

    public static  String formatDate(Date date)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Date parse(String strDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(strDate);
    }
}
