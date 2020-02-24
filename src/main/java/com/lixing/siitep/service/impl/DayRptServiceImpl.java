package com.lixing.siitep.service.impl;

import com.lixing.siitep.entity.TbDayrpt;
import com.lixing.siitep.entity.TbDayrptExample;
import com.lixing.siitep.mapper.TbDayrptMapper;
import com.lixing.siitep.mapper.TblRecordMapper;
import com.lixing.siitep.service.DayRptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: cc
 * @Date: 2020/2/23
 */
@Service
public class DayRptServiceImpl implements DayRptService
{
    @Autowired
    private TblRecordMapper tblRecordMapper;

    @Autowired
    private TbDayrptMapper tbDayrptMapper;

    @Override
    public Map<String, Object> sum() {
        TbDayrptExample example = new TbDayrptExample();
        TbDayrptExample.Criteria criteria = example.createCriteria();
        example.setTableName(tblRecordMapper.selectTableName());
        return tbDayrptMapper.sum(example);
    }

    @Override
    public List<TbDayrpt> selectByExample(TbDayrpt tbDayrpt) {
        TbDayrptExample example = new TbDayrptExample();
        TbDayrptExample.Criteria criteria = example.createCriteria();
        example.setTableName(tblRecordMapper.selectTableName());
        return tbDayrptMapper.selectByExample(example);
    }
}