package cn.arctique.reactadminapi.service.impl;

import cn.arctique.reactadminapi.entity.Admin;
import cn.arctique.reactadminapi.mapper.AdminMapper;
import cn.arctique.reactadminapi.service.AdminService;
import cn.arctique.reactadminapi.util.Result;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author cy
 * @date 2021-12-08 11:35
 */
@Service
@Slf4j
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    /**
     * 查询管理员列表
     *
     * @param page
     * @return {@link IPage<Admin>}
     */
    @Override
    public IPage<Admin> getAdminList(Page page) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return baseMapper.selectPage(page, queryWrapper);
    }

    /**
     * 根据id删除管理员
     *
     * @param id
     * @return {@link boolean}
     */
    @Override
    public boolean delAdminById(Integer id) {
        int delete = baseMapper.deleteById(id);
        return delete == 1 ? true : false;
    }

    /**
     * 添加管理员
     *
     * @param admin
     * @return {@link boolean}
     */
    @Override
    public Result addAdmin(Admin admin) {

        if (StringUtils.isEmpty(admin.getName())) {
            return Result.failure("数据不能为空");
        }

        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", admin.getName());
        queryWrapper.eq("mobile", admin.getMobile());
        Integer count = baseMapper.selectCount(queryWrapper);
        if (count > 0) {
            return Result.failure("添加失败，存在相同管理员数据");
        }

        log.info("[admin] : {}", admin);

        return Result.success("添加成功", baseMapper.insert(admin));
    }
}
