package com.qtyx.mhwang.service;

import com.alibaba.android.arouter.facade.template.IProvider;

import java.util.Map;

/**
 * 公司：广州成林科技信息
 * 作者：王明海
 * 时间：7/7/21 4:20 PM
 * 用途：
 **/
public interface INetService extends IProvider {
    public boolean connect(Map<String,Object> params);
    public void init(Map<String,Object> params);
    public void login(Map<String,Object> params);
    public void logout(Map<String,Object> params);
    public void heartBeat(Map<String,Object> params);
    public void auth(Map<String,Object> params);
    public void register(Map<String,Object> params);
    public void qrCode(Map<String,Object> params);
    public void cardCode(Map<String,Object> params);
    public void barCode(Map<String,Object> params);
    public void productDone(Map<String,Object> params);
    public void stateReport(Map<String,Object> params);
    public void statusReport(Map<String,Object> params);
    public void supplyReport(Map<String,Object> params);
    public void eventReport(Map<String,Object> params);

    public void uniSearchProSkuSale(Map<String,Object> params);
    public void commonSubmitOrder(Map<String,Object> params);
    public void uniQueryMemberInfo(Map<String,Object> params);
    public void couponWithdraw(Map<String,Object> params);
    public void setErrMsg(Map<String,Object> params);
    public void getErrMsg(Map<String,Object> params);
}
