package com.zylear.equation.editor.config;

import com.zylear.equation.editor.util.MybatisDataSourceConfigHelper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

/**
 * @author 28444
 * @date 2018/1/10.
 */
@Configuration
@MapperScan(basePackages = DataSourceEquationEditorConfig.SCAN_PACKAGE)
@EnableTransactionManagement
public class DataSourceEquationEditorConfig {

    public final static String DATA_SOURCE = "dataSourceEquationEditor";
    public final static String SCAN_PACKAGE = "com.zylear.equation.editor.dao.mybatis.equation.editor";
    public final static String SQL_SESSION_FACTORY = "sqlSessionFactoryEquationEditor";
    public final static String TX_MANAGER = "txManagerEquationEditor";
    public final static String SQL_SESSION_TEMPLATE = "sqlSessionTemplateEquationEditor";
    public final static List<String> XML_PATHS = Arrays.asList("classpath:com/zylear/equation/editor/dao/mybatis/equation/editor/*.xml");
    @Value("${database.equation.editor.username}")
    private String username;
    @Value("${database.equation.editor.password}")
    private String password;
    @Value("${database.equation.editor.url}")
    private String url;
    @Value("${mybatis.config.path}")
    private String configPath;

    @Bean(DATA_SOURCE)
    public DataSource dataSource() {
        return MybatisDataSourceConfigHelper.createDruidDataSource(url, username, password);
    }

    @Bean(SQL_SESSION_FACTORY)
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE) DataSource dataSource) {
        return MybatisDataSourceConfigHelper.getSqlSessionFactory(XML_PATHS, configPath, dataSource);
    }

    @Bean(TX_MANAGER)
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier(DATA_SOURCE) DataSource dataSource) {
        return MybatisDataSourceConfigHelper.getTransactionManager(dataSource);
    }

    @Bean(SQL_SESSION_TEMPLATE)
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier(SQL_SESSION_FACTORY) SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
