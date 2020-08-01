package com.agaoglu.caching.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheHelper {

    @CachePut(cacheNames = "testcache", key = "#testKey")
    public String saveToCache(String testKey, String value){
        return value;
    }

    @Cacheable(cacheNames = "testcache", key = "#testKey")
    public String getFromCache(String testKey){
        return null;
    }
}
