package maum.maumpaymentmanagementsystem.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ApplicationConstans {

    @Autowired
    private Environment env;

    public static final String SERVICE_TYPE = "service_type";
}
