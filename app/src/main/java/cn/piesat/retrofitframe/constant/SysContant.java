package cn.piesat.retrofitframe.constant;

/**
 * @author lq
 * @fileName 系统常量类
 * @data on  2019/2/18 10:38
 * @describe 保存配置
 */
public class SysContant {



    public interface Contats{
        String db_name="AppDatabase";
        int db_version=1;
    }

    /**
     * 用户配置
     */
   public interface userInfo{
        String USER_TOKEN="user_token";

    }

}

