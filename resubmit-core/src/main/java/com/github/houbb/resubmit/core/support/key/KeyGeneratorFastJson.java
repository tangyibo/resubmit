package com.github.houbb.resubmit.core.support.key;

import com.alibaba.fastjson.JSON;
import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.heaven.util.secrect.Md5Util;
import com.github.houbb.resubmit.api.support.IKeyGenerator;

import java.lang.reflect.Method;

/**
 * @author binbin.hou
 * @since 0.0.1
 */
@ThreadSafe
public class KeyGeneratorFastJson implements IKeyGenerator {

    @Override
    public String gen(Method method, Object[] params) {
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String paramJson = JSON.toJSONString(params);
        String fullText = className+methodName+paramJson;
        return Md5Util.md5(fullText);
    }

}
