package com.hs.service.impl;

import com.hs.pojo.HsRoleAccess;
import com.hs.dao.HsRoleAccessMapper;
import com.hs.service.HsRoleAccessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 使用联合主键，三个字段的值加一起唯一，不允许重复 服务实现类
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@Service
public class HsRoleAccessServiceImpl extends ServiceImpl<HsRoleAccessMapper, HsRoleAccess> implements HsRoleAccessService {

}
