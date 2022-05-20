package cn.arctique.reactadminapi.controller;

import cn.arctique.reactadminapi.entity.Admin;
import cn.arctique.reactadminapi.service.AdminService;
import cn.arctique.reactadminapi.util.Result;
import cn.arctique.reactadminapi.vo.AdminListResVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arctique
 * @date 2021/12/7 22:24:11
 */
@Slf4j
@RestController
@RequestMapping(value = "/admin")
@Api(value = "管理员api")
@AllArgsConstructor
public class AdminController {

    private final AdminService adminService;

    /**
     * 查询管理员列表
     *
     * @param page
     * @return
     */
    @GetMapping("/list")
    @ApiOperation(value = "获取管理员列表")
    public Result<IPage<Admin>> getAdminList(Page page) {
        return Result.success("查询成功", adminService.getAdminList(page));
    }

    /**
     * 根据id删除管理员
     *
     * @param id
     * @return {@link boolean}
     */
    @PostMapping("/delete")
    @ApiOperation(value = "根据id删除管理员")
    public Result delAdmin(@RequestParam Integer id) {
        return Result.success("删除成功", adminService.delAdminById(id));
    }

    /**
     * 添加管理员
     *
     * @param admin
     * @return
     */
    @PostMapping("/addAdmin")
    @ApiOperation(value = "添加管理员")
    public Result addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }
}
