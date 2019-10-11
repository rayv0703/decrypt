package uyun.decrypt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uyun.decrypt.service.DecryptService;

import java.util.Map;

/**
 * 解密接口
 *
 * @author rayv
 * @create 2019-10-11-0:28
 */
@Controller
@Slf4j
public class DecryptController {

    private DecryptService decryptService;

    public DecryptController(DecryptService decryptService) {
        this.decryptService = decryptService;
    }

    //public static final String ACCOUNTDECRYPT_DECRYPT_API_PATH = "/frontapi/v1/accountDecrypt/decrypt";

    /**
     * 跳转到注册 成功页面
     *
     * @return
     */
    @RequestMapping(value = "index")
    public String index(Map<String, Object> paramMap) {
        return "index";
    }

}
