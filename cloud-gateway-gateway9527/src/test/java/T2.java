import java.time.ZonedDateTime;

/**
 * @Author arhaiyun
 * @Since 2020/4/30
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2020-03-12T15:44:15.064+08:00[Asia/Shanghai]
    }
}
