package io.terrakube.terraform.spring.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "io.terrakube.terraform.flags")
public class TerraformProperties {

    private boolean enableColor;
    private boolean jsonOutput;
    private String terraformReleasesUrl;
    private String tofuReleasesUrl;
}
