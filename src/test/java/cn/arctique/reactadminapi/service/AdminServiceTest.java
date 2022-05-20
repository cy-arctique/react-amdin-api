package cn.arctique.reactadminapi.service;

import cn.arctique.reactadminapi.entity.Admin;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author cy
 * @date 2021-12-08 11:44
 */
@SpringBootTest
@Slf4j
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    /**
     * 获取管理员列表
     */
    @Test
    public void getAdminListTest() {
        Page page = new Page(1, 10);
        IPage<Admin> adminList = adminService.getAdminList(page);
        log.info("[adminList] : {}", adminList.getRecords());
    }
}
