package com.qtyx.mhwang.netinterface;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.qtyx.mhwang.service.INetService;
import com.qtyx.mhwang.service.NetServiceUtil;

import java.util.Map;

/**
 * 公司：广州成林科技信息
 * 作者：王明海
 * 时间：7/12/21 10:50 AM
 * 用途：
 **/
@Route(path = NetServiceUtil.PATH_SERVICE)
public class NetHelper implements INetService {
    @Override
    public boolean connect(Map<String, Object> params) {
        return true;
    }

    @Override
    public void init(Map<String, Object> params) {

    }

    @Override
    public void login(Map<String, Object> params) {

    }

    @Override
    public void logout(Map<String, Object> params) {

    }

    @Override
    public void heartBeat(Map<String, Object> params) {

    }

    @Override
    public void auth(Map<String, Object> params) {

    }

    @Override
    public void register(Map<String, Object> params) {

    }

    @Override
    public void qrCode(Map<String, Object> params) {

    }

    @Override
    public void cardCode(Map<String, Object> params) {

    }

    @Override
    public void barCode(Map<String, Object> params) {

    }

    @Override
    public void productDone(Map<String, Object> params) {

    }

    @Override
    public void stateReport(Map<String, Object> params) {

    }

    @Override
    public void statusReport(Map<String, Object> params) {

    }

    @Override
    public void supplyReport(Map<String, Object> params) {

    }

    @Override
    public void eventReport(Map<String, Object> params) {

    }

    @Override
    public void init(Context context) {

    }
}
