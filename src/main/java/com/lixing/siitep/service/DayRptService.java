package com.lixing.siitep.service;

import com.lixing.siitep.entity.TbDayrpt;



import java.util.List;
import java.util.Map;

/**
 * @Author: cc
 * @Date: 2020/2/23
 */
public interface DayRptService {

    // 宏观统计 总人数、隔离人数、发烧人数
    Map<String,Object> sum(String day);

    List<TbDayrpt> selectByExample(TbDayrpt tbDayrpt);
    //学生省份物理分布
    List<TbDayrpt> StuInProvince(String day);
    //学生发烧人数分布省份
    List<TbDayrpt> StuHotInProvince(String day);
    //学生隔离人数分布省份
    List<TbDayrpt> StuIsolatedInProvince(String day);
    //重点关注学生
    List<TbDayrpt> FocusStu(String day);
    //体温等级比例
    List<TbDayrpt> getTemperatureGradeRatio(String day);
    //最后创建表时间
    String NewTime();

    //查询是否存在某日的数据
    int isExist(String tableName);
    //每天在苏人数
    List<TbDayrpt> StuInSuZhou(String city,String province);

    //发烧人数趋势
    List<TbDayrpt> StuFeverTrend();


    //隔离人数
    List<TbDayrpt> StuIsolated();
}
