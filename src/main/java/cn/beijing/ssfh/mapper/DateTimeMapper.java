package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DateTime;

public interface DateTimeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer dateTimeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    int insert(DateTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    int insertSelective(DateTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    DateTime selectByPrimaryKey(Integer dateTimeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DateTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table date_time
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DateTime record);
}