package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    /**
     * 新增菜品和响应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);


    void deleteBatch(List<Long> ids);

    /**
     * 根据ID查询菜品和对应的口味数据
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);


    /**
     * 根据Idx修改菜品基本信息和对应的口味信息
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);
}
