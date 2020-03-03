package zchi.mymangademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MymangademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymangademoApplication.class, args);
    }

}
