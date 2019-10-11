package uyun.decrypt.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;

/**
 * 初始化启动配置类
 *
 * @author rayv
 * @create 2019-10-11-16:23
 */
@Configuration
public class AppInit {

    @EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        String url = "http://localhost:8711";
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
