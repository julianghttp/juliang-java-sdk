import com.juliang.JuLiang;
import com.juliang.common.Auth;
import com.juliang.common.DynamicGetIps;

public class Test {

    @org.junit.jupiter.api.Test
    public void dynamicGetIps() throws IllegalAccessException {
//        Auth auth = new Auth("1135123858735679", "e90222dfd88f48e7b02abf39b2d10b7b");
//        JuLiang juLiang = new JuLiang(auth);
        String key = "e90222dfd88f48e7b02abf39b2d10b7b";
        String a = JuLiang.dynamicGetIps(new DynamicGetIps()
                .setNum(10).setSplit(1), key);
        System.out.println(a);
    }

}
