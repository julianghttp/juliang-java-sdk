import com.juliang.JuLiang;
import com.juliang.common.DynamicGetIps;

public class Test {

    @org.junit.jupiter.api.Test
    public void dynamicGetIps() throws IllegalAccessException {
        String key = "e90222dfd88f48e7b02abf39b2d10b7b";
        String a = JuLiang.dynamicGetIps(new DynamicGetIps()
                .setNum(10).setTrade_no("").setSplit(1).setKey(key));
        System.out.println(a);
    }

}
