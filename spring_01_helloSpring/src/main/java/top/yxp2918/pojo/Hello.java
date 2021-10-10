package top.yxp2918.pojo;

/**
 * @author yxp2918
 * @date 2021-10-10-8:23
 */
public class Hello {
    private String str;

    public Hello() {
    }

    public Hello(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
