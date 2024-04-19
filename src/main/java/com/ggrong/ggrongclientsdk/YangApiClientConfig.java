package com.ggrong.ggrongclientsdk;


import com.ggrong.ggrongclientsdk.client.YangApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 客户端配置
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YangApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public YangApiClient yuApiClient(){
        return new YangApiClient(accessKey,secretKey);
    }

}
