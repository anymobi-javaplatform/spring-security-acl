package io.anymobi.springsecurityacl.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Mick Knutson
 * @since chapter 01.00
 */
@Configuration
@Import({SecurityConfig.class})
public class JavaConfig {

} // The End...
