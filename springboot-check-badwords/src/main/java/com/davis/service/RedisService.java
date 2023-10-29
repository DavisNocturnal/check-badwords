package com.davis.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.davis.constant.Cache;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService {
	

//	@Autowired
//	private RedisTemplate redisTemplate;
//
//	@Autowired
//	public RedisService(StringRedisTemplate redisTemplate) {
//		this.redisTemplate = redisTemplate;
//	}
	
	@Autowired
	CacheService cacheService;

	
    
    
    
    
    
    
    
    
    
    
    
}
