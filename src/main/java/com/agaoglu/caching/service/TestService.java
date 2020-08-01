package com.agaoglu.caching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    CacheHelper cacheHelper;

    public void putToCache(String key, String value){
        cacheHelper.saveToCache(key, value);
    }

    public String fromCache(String key){
        return cacheHelper.getFromCache(key);
    }

    @Scheduled(fixedDelay = 100000L)
    public void scheduledTest(){
        putToCache("normalservicekey", "normalservicevalue");
    }
}
