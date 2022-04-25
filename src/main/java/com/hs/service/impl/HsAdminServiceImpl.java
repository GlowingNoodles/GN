package com.hs.service.impl;

import com.hs.pojo.HsAdmin;
import com.hs.dao.HsAdminMapper;
import com.hs.service.HsAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@Service
public class HsAdminServiceImpl extends ServiceImpl<HsAdminMapper, HsAdmin> implements HsAdminService {

}
