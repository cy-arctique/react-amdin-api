package cn.arctique.reactadminapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author arctique
 * @date 2021/12/4 23:50:23
 */
@SpringBootApplication
@EnableSwagger2
public class ReactAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactAdminApiApplication.class, args);
    }

}
