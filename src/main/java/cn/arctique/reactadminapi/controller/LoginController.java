package cn.arctique.reactadminapi.controller;

import cn.arctique.reactadminapi.dto.LoginReqDTO;
import cn.arctique.reactadminapi.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arctique
 * @date 2021/12/4 23:50:23
 */
@Slf4j
@RestController
@RequestMapping(value = "/admin")
@Api(value = "登录api")
public class LoginController {

    @PostMapping(value = "/login")
    @ApiOperation(value = "登录")
    public Result login(@RequestBody LoginReqDTO loginReqDTO) {
        log.info("[loginReqDTO] : {}", loginReqDTO);
        return Result.success("success", "success");
    }
}

