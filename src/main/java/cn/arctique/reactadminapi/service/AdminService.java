package cn.arctique.reactadminapi.service;

import cn.arctique.reactadminapi.entity.Admin;
import cn.arctique.reactadminapi.util.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author cy
 * @date 2021-12-08 11:32
 */
public interface AdminService extends IService<Admin> {

    /**
     * 查询管理员列表
     *
     * @param page
     * @return {@link IPage<Admin>}
     */
    IPage<Admin> getAdminList(Page page);

    /**
     * 根据id删除管理员
     *
     * @param id
     * @return {@link boolean}
     */
    boolean delAdminById(Integer id);

    /**
     * 添加管理员
     *
     * @param admin
     * @return {@link boolean}
     */
    Result addAdmin(Admin admin);
}
