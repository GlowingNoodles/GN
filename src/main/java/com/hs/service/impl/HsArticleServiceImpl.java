package com.hs.service.impl;

import com.hs.pojo.HsArticle;
import com.hs.dao.HsArticleMapper;
import com.hs.service.HsArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章内容表 服务实现类
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@Service
public class HsArticleServiceImpl extends ServiceImpl<HsArticleMapper, HsArticle> implements HsArticleService {

}
