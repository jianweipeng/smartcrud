package com.shanghai.unicom.micro.smartcrud.utils;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class DateGetUtil extends SimpleDateFormat {


    public String getTimeStamp(){
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    }

    /**
     * 获取时间戳的前八位 yyyymmdd
     * @return
     */
    public String getTimeStampyyyyMMdd(){
        return getTimeStamp().substring(0,8);
    }

    public String getCurrentTime(){
        return DateFormat.getDateTimeInstance().format(new Date());
    }




}
