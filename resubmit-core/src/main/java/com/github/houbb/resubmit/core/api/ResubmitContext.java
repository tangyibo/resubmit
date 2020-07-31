package com.github.houbb.resubmit.core.api;

import com.github.houbb.resubmit.api.core.IResubmitContext;
import com.github.houbb.resubmit.api.support.ICache;
import com.github.houbb.resubmit.api.support.IKeyGenerator;
import com.github.houbb.resubmit.api.support.ITokenGenerator;

import java.util.Arrays;

/**
 * @author binbin.hou
 * @since 0.0.1
 */
public class ResubmitContext implements IResubmitContext {

    /**
     * 请求参数
     * @since 0.0.1
     */
    private Object[] params;

    /**
     * 存活时间
     * @since 0.0.1
     */
    private int ttl;

    /**
     * key 生成结果
     * @since 0.0.1
     */
    private IKeyGenerator keyGenerator;

    /**
     * 密匙生成策略
     * @since 0.0.1
     */
    private ITokenGenerator tokenGenerator;

    /**
     * 缓存信息
     * @since 0.0.1
     */
    private ICache cache;

    public static ResubmitContext newInstance() {
        return new ResubmitContext();
    }

    @Override
    public Object[] params() {
        return params;
    }

    public ResubmitContext params(Object[] params) {
        this.params = params;
        return this;
    }

    @Override
    public int ttl() {
        return ttl;
    }

    public ResubmitContext ttl(int ttl) {
        this.ttl = ttl;
        return this;
    }

    @Override
    public IKeyGenerator keyGenerator() {
        return keyGenerator;
    }

    public ResubmitContext keyGenerator(IKeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
        return this;
    }

    @Override
    public ITokenGenerator tokenGenerator() {
        return tokenGenerator;
    }

    public ResubmitContext tokenGenerator(ITokenGenerator tokenGenerator) {
        this.tokenGenerator = tokenGenerator;
        return this;
    }

    @Override
    public ICache cache() {
        return cache;
    }

    public ResubmitContext cache(ICache cache) {
        this.cache = cache;
        return this;
    }

    @Override
    public String toString() {
        return "ResubmitContext{" +
                "params=" + Arrays.toString(params) +
                ", ttl=" + ttl +
                ", keyGenerator=" + keyGenerator +
                ", tokenGenerator=" + tokenGenerator +
                ", cache=" + cache +
                '}';
    }

}
