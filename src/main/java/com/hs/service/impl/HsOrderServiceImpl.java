package com.hs.service.impl;

import com.hs.pojo.HsOrder;
import com.hs.dao.HsOrderMapper;
import com.hs.service.HsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单总表 服务实现类
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@Service
public class HsOrderServiceImpl extends ServiceImpl<HsOrderMapper, HsOrder> implements HsOrderService {

}
