package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremaishangpinView;


/**
 * 热卖商品评论表
 *
 * @author 
 * @email 
 * @date 2023-03-06 14:33:24
 */
public interface DiscussremaishangpinService extends IService<DiscussremaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremaishangpinVO> selectListVO(Wrapper<DiscussremaishangpinEntity> wrapper);
   	
   	DiscussremaishangpinVO selectVO(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
   	
   	List<DiscussremaishangpinView> selectListView(Wrapper<DiscussremaishangpinEntity> wrapper);
   	
   	DiscussremaishangpinView selectView(@Param("ew") Wrapper<DiscussremaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremaishangpinEntity> wrapper);
   	

}

