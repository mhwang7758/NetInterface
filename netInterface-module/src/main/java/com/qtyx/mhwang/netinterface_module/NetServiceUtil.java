package com.qtyx.mhwang.netinterface_module;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 公司：广州成林科技信息
 * 作者：王明海
 * 时间：7/8/21 3:14 PM
 * 用途：
 **/
public class NetServiceUtil {
    public final static String PATH_SERVICE = "/net/service";
    public static INetService getService(){
        return (INetService) ARouter.getInstance().build(PATH_SERVICE).navigation();
    }
}
