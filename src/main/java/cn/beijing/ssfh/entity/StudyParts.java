package cn.beijing.ssfh.entity;

public class StudyParts {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_parts.study_parts_id
     *
     * @mbggenerated
     */
    private Integer studyPartsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_parts.production_id
     *
     * @mbggenerated
     */
    private Integer productionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_parts.phase_name
     *
     * @mbggenerated
     */
    private String phaseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_parts.phase_duration
     *
     * @mbggenerated
     */
    private Integer phaseDuration;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_parts.study_parts_id
     *
     * @return the value of study_parts.study_parts_id
     *
     * @mbggenerated
     */
    public Integer getStudyPartsId() {
        return studyPartsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_parts.study_parts_id
     *
     * @param studyPartsId the value for study_parts.study_parts_id
     *
     * @mbggenerated
     */
    public void setStudyPartsId(Integer studyPartsId) {
        this.studyPartsId = studyPartsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_parts.production_id
     *
     * @return the value of study_parts.production_id
     *
     * @mbggenerated
     */
    public Integer getProductionId() {
        return productionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_parts.production_id
     *
     * @param productionId the value for study_parts.production_id
     *
     * @mbggenerated
     */
    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_parts.phase_name
     *
     * @return the value of study_parts.phase_name
     *
     * @mbggenerated
     */
    public String getPhaseName() {
        return phaseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_parts.phase_name
     *
     * @param phaseName the value for study_parts.phase_name
     *
     * @mbggenerated
     */
    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName == null ? null : phaseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_parts.phase_duration
     *
     * @return the value of study_parts.phase_duration
     *
     * @mbggenerated
     */
    public Integer getPhaseDuration() {
        return phaseDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_parts.phase_duration
     *
     * @param phaseDuration the value for study_parts.phase_duration
     *
     * @mbggenerated
     */
    public void setPhaseDuration(Integer phaseDuration) {
        this.phaseDuration = phaseDuration;
    }
}