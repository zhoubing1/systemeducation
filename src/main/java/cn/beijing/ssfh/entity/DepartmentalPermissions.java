package cn.beijing.ssfh.entity;

public class DepartmentalPermissions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmental_permissions.departmental_permissions_id
     *
     * @mbggenerated
     */
    private Integer departmentalPermissionsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmental_permissions.permissions_id
     *
     * @mbggenerated
     */
    private Integer permissionsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmental_permissions.department_id
     *
     * @mbggenerated
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmental_permissions.departmental_permissions_id
     *
     * @return the value of departmental_permissions.departmental_permissions_id
     *
     * @mbggenerated
     */
    public Integer getDepartmentalPermissionsId() {
        return departmentalPermissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmental_permissions.departmental_permissions_id
     *
     * @param departmentalPermissionsId the value for departmental_permissions.departmental_permissions_id
     *
     * @mbggenerated
     */
    public void setDepartmentalPermissionsId(Integer departmentalPermissionsId) {
        this.departmentalPermissionsId = departmentalPermissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmental_permissions.permissions_id
     *
     * @return the value of departmental_permissions.permissions_id
     *
     * @mbggenerated
     */
    public Integer getPermissionsId() {
        return permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmental_permissions.permissions_id
     *
     * @param permissionsId the value for departmental_permissions.permissions_id
     *
     * @mbggenerated
     */
    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmental_permissions.department_id
     *
     * @return the value of departmental_permissions.department_id
     *
     * @mbggenerated
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmental_permissions.department_id
     *
     * @param departmentId the value for departmental_permissions.department_id
     *
     * @mbggenerated
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}