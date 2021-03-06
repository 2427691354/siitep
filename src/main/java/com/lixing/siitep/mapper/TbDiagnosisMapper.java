package com.lixing.siitep.mapper;

import com.lixing.siitep.entity.TbDiagnosis;
import com.lixing.siitep.entity.TbDiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDiagnosisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    long countByExample(TbDiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByExample(TbDiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insert(TbDiagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insertSelective(TbDiagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    List<TbDiagnosis> selectByExample(TbDiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    TbDiagnosis selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbDiagnosis record, @Param("example") TbDiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExample(@Param("record") TbDiagnosis record, @Param("example") TbDiagnosisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKeySelective(TbDiagnosis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_diagnosis
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKey(TbDiagnosis record);

    List<TbDiagnosis> selectFromTitle();
}