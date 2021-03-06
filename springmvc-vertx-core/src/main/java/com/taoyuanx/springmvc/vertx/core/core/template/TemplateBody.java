package com.taoyuanx.springmvc.vertx.core.core.template;


import com.taoyuanx.springmvc.vertx.core.core.VertxConstant;

import java.lang.annotation.*;

/**
 * @author dushitaoyuan
 * @desc 模板渲染标记
 * @date 2020/4/23
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TemplateBody {
    /**
     * 解析引擎名称
     */
    String engineName() default VertxConstant.DEFAULT_TEMPLATE_ENGINE_NAME;
}
