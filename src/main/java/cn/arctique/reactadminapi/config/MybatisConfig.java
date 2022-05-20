package cn.arctique.reactadminapi.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author cy
 * @date 2021-11-22 15:37
 */
@EnableTransactionManagement
@Configuration
public class MybatisConfig {

    /**
     * MyBatis-Plus 分页插件
     *
     * @return {@link PaginationInterceptor}
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * Mybatis-Plus SQL注入器
     *
     * @return {@link ISqlInjector}
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
