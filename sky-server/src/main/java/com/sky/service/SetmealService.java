package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    void saveWithDishes(SetmealDTO setmealDTO);

    PageResult pageQuery(SetmealQueryDTO setmealQueryDTO);

    SetmealVO getByIdWithDish(Long id);

    void updateWithDish(SetmealDTO setmealDTO);

    void startOrStop(Integer status, Long id);

    void deleteBatch(List<Long> ids);
}
