package org.example.configmanagement;

@SpringBootApplication
@RefreshScope
public class MyApplication {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
