package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Major;

public interface MajorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer majorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    int insert(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    int insertSelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    Major selectByPrimaryKey(Integer majorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Major record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Major record);
}