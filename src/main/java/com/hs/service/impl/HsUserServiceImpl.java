package com.hs.service.impl;

import com.hs.pojo.HsUser;
import com.hs.dao.HsUserMapper;
import com.hs.service.HsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@Service
public class HsUserServiceImpl extends ServiceImpl<HsUserMapper, HsUser> implements HsUserService {

}
