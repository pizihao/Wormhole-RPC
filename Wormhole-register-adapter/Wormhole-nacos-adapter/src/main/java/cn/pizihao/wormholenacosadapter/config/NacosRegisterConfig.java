package cn.pizihao.wormholenacosadapter.config;

import cn.pizihao.wormholenacosadapter.register.NacosServiceRegister;
import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(NacosDiscoveryProperties.class)
public class NacosRegisterConfig {


    @Bean
    @ConditionalOnBean({NacosDiscoveryProperties.class, NacosServiceRegistry.class})
    public NacosServiceRegister serviceRegister(NacosServiceRegistry nacosServiceRegistry) {
        return new NacosServiceRegister(nacosServiceRegistry);
    }


}
