package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GradeState;

public interface GradeStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer gradeStateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    int insert(GradeState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    int insertSelective(GradeState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    GradeState selectByPrimaryKey(Integer gradeStateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GradeState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade_state
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GradeState record);
}