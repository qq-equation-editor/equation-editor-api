package com.zylear.equation.editor.config;

import com.zylear.equation.editor.filter.GeneralFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiezongyu on 2018/4/28.
 */
@Configuration
public class WebFilterConfig {


    @Bean
    public FilterRegistrationBean generalFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("adminFilter");
        GeneralFilter adminFilter = new GeneralFilter();
        registrationBean.setFilter(adminFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(10);
        return registrationBean;
    }
//
//    @Bean
//    public FilterRegistrationBean bidderFilterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setName("bidderFilter");
//        BidderFilter bidderFilter = new BidderFilter();
//        registrationBean.setFilter(bidderFilter);
//        registrationBean.addUrlPatterns("/bid/*");
//        registrationBean.addUrlPatterns("/bidding/get-bidding-content");
//        registrationBean.addUrlPatterns("/project/show-project");
//        registrationBean.addUrlPatterns("/contract/show-contract");
//        registrationBean.setOrder(12);
//        return registrationBean;
//    }

}
