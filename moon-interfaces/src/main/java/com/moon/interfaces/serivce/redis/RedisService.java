package com.moon.interfaces.serivce.redis;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zxin on 2018/5/4.
 */
public interface RedisService {

    public void remove(final String... keys);

    public void removePattern(final String pattern);

    public void remove(final String key);

    public boolean exists(final String key);

    public Serializable get(final String key);

    public boolean set(final String key,Serializable value);

    public boolean set(final String key,Serializable value,Long expireTime);

    /**
     * 存储map
     * @param key
     * @param map
     * @param expireTime
     * @param <K>
     * @param <HK>
     * @param <HV>
     * @return
     */
    public <K,HK,HV> boolean setMap(K key, Map<HK,HV> map, Long expireTime);

    /**
     * 获取map
     * @param key
     * @param <K>
     * @param <HK>
     * @param <HV>
     * @return
     */
    public <K,HK,HV> Map<HK,HV> getMap(final K key);

}
