package pers.li.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by lishengbo 2018/11/18
 *
 * 线程不安全的单例模式问题测试:
 * 测试结果：
 *  Thread-1和Thread-0报java.lang.NumberFormatException: multiple points错误，直接挂死
 *  并发时会出现数据混乱错误和挂死错误
 */
public class SecondDateUtilTest {

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            new TestSimpleDateFormatThreadSafe().start();
        }
    }

    public static class TestSimpleDateFormatThreadSafe extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    //等待两秒后开始抢占锁
                    this.join(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                try {
                    System.out.println(this.getName()+":"+SecondDateUtil.parse("2013-05-24 06:02:20"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
