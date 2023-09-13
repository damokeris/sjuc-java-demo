package com.sjuchat.sjucjava.sjucdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description : OpenApi配置
 * @Author lipeng
 * @Date 2023/9/11 19:28
 */
@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("SJUC-springboot--在线API文档")
                    .description(" 后端api文档,供参考 ")
                    .version("v0.0.1"));
    }

}
