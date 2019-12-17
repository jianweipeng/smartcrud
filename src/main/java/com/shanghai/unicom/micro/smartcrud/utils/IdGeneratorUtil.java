package com.shanghai.unicom.micro.smartcrud.utils;


import com.shanghai.unicom.micro.smartcrud.constant.SystemCodeConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class IdGeneratorUtil {
    /**
     * 用户类别编码
     */
    private static final String USER_TYPE_CODE = "01";
    /**
     * 客户类别编码
     */
    private static final String CUSTOMER_TYPE_CODE = "02";
    /**
     * 账户类别编码
     */
    private static final String ACCOUNT_TYPE_CODE = "03";

    @Autowired
    private DateGetUtil dateGetUtil;

    @Autowired
    private GetFixLenthRandom getFixLenthRandom;



    /**
     * 获取用户编码
     * @return
     */
    public String getUserIdCode(){
        return  SystemCodeConstant.PROVINCE_CODE + USER_TYPE_CODE + dateGetUtil.getTimeStampyyyyMMdd()
                +getFixLenthRandom.getFixLenthRandomString();
    }

    /**
     * 获取客户编码
     * @return
     */
    public String getCustIdCode(){
        return  SystemCodeConstant.PROVINCE_CODE + CUSTOMER_TYPE_CODE + dateGetUtil.getTimeStampyyyyMMdd()
                +getFixLenthRandom.getFixLenthRandomString();
    }

    /**
     * 获取账户编码
     * @return
     */
    public String getAcctIdCode(){
        return  SystemCodeConstant.PROVINCE_CODE + ACCOUNT_TYPE_CODE + dateGetUtil.getTimeStampyyyyMMdd()
                +getFixLenthRandom.getFixLenthRandomString();
    }

}
