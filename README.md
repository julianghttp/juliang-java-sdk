## 巨量IP -  API  SDK -  Java

通过SDK可快速调用API接口, [查看详情](https://gitee.com/juliangip/juliang-java-sdk)

### 巨量IP官方代码案例展示  --   Java

### 使用说明

运行环境要求jdk >=  1.8

### 安装s

##### <u>通过Maven安装</u>

- 在Maven中央仓库中搜索juliangip 即可获取SDK依赖jar和dependency依赖下载

- 在pom文件中填写下方依赖配置即可

  ```xml
  <dependency>
    <groupId>com.juliangip</groupId>
    <artifactId>juliang_sdk</artifactId>
    <version>1.0.1</version>
  </dependency>
  ```

##### <u>通过源码安装</u>

前往Gitee 巨量云[JAVA-SDK](https://gitee.com/juliangip/juliang-java-sdk) 下载最新的源代码,然后解压导入到项目中使用

##### <u>使用案例</u>

```java
import com.juliang.JuLiang;
import com.juliang.common.DynamicReplaceWhiteIp;
import com.juliang.common.UsersGetBalance;
import org.junit.Test;

import java.util.Map;

public class test {

    private  String userId = "your User ID";
    private  String AccessKey = "User AccessKey";

    private  String dynamicKey = "dynamicKey";
    private  String dynamicTradeNo = "dynamicTradeNo";

    @Test
    public void test1() throws  Exception{
        String resp = JuLiang.usersGetBalance(new UsersGetBalance()
                .setKey("AccessKey")
                .setUser_id("userId"));
        System.out.println(resp);
    }

    @Test
    public void dyReplaceWhiteIp() throws IllegalAccessException {
        String resp = JuLiang.dynamicReplaceWhiteIp(new DynamicReplaceWhiteIp()
                .setTrade_no(dynamicTradeNo)
                .setKey(dynamicKey)
                .setNew_ip("11.12.13.14,15.16.17.18")
                .setOld_ip("3.3.3.9")
                .setReset("1"));
        System.out.println(resp);
    }
}
```

#### <u>参考资料</u>

- [产品文档](http://www.juliangip.com/help/product/dynamic/)
- [快速入门](http://www.juliangip.com/help/apply/rm/)
- [API接口](http://www.juliangip.com/help/api/api/)
- [开发者指南](http://www.juliangip.com/help/dev/dev/)

