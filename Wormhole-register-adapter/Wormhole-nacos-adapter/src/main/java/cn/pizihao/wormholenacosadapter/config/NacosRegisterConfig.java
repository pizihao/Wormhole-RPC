package cn.pizihao.wormholenacosadapter.config;

import cn.pizihao.wormholenacosadapter.register.NacosServiceDiscoveryAdapter;
import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(NacosDiscoveryProperties.class)
public class NacosRegisterConfig {


    @Bean
    @ConditionalOnBean({NacosDiscoveryProperties.class, NacosServiceDiscovery.class})
    public NacosServiceDiscoveryAdapter serviceRegister(NacosServiceDiscovery nacosServiceDiscovery) {
        return new NacosServiceDiscoveryAdapter(nacosServiceDiscovery);
    }


}
