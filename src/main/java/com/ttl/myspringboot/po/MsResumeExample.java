package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsResumeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNull() {
            addCriterion("vocation_id is null");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNotNull() {
            addCriterion("vocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andVocationIdEqualTo(Integer value) {
            addCriterion("vocation_id =", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotEqualTo(Integer value) {
            addCriterion("vocation_id <>", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThan(Integer value) {
            addCriterion("vocation_id >", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vocation_id >=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThan(Integer value) {
            addCriterion("vocation_id <", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("vocation_id <=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIn(List<Integer> values) {
            addCriterion("vocation_id in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotIn(List<Integer> values) {
            addCriterion("vocation_id not in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdBetween(Integer value1, Integer value2) {
            addCriterion("vocation_id between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vocation_id not between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNull() {
            addCriterion("work_age is null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNotNull() {
            addCriterion("work_age is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeEqualTo(Integer value) {
            addCriterion("work_age =", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotEqualTo(Integer value) {
            addCriterion("work_age <>", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThan(Integer value) {
            addCriterion("work_age >", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_age >=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThan(Integer value) {
            addCriterion("work_age <", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("work_age <=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIn(List<Integer> values) {
            addCriterion("work_age in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotIn(List<Integer> values) {
            addCriterion("work_age not in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("work_age between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("work_age not between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andLiveinIdIsNull() {
            addCriterion("livein_id is null");
            return (Criteria) this;
        }

        public Criteria andLiveinIdIsNotNull() {
            addCriterion("livein_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiveinIdEqualTo(Integer value) {
            addCriterion("livein_id =", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdNotEqualTo(Integer value) {
            addCriterion("livein_id <>", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdGreaterThan(Integer value) {
            addCriterion("livein_id >", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("livein_id >=", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdLessThan(Integer value) {
            addCriterion("livein_id <", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdLessThanOrEqualTo(Integer value) {
            addCriterion("livein_id <=", value, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdIn(List<Integer> values) {
            addCriterion("livein_id in", values, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdNotIn(List<Integer> values) {
            addCriterion("livein_id not in", values, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdBetween(Integer value1, Integer value2) {
            addCriterion("livein_id between", value1, value2, "liveinId");
            return (Criteria) this;
        }

        public Criteria andLiveinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("livein_id not between", value1, value2, "liveinId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdIsNull() {
            addCriterion("job_feature_id is null");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdIsNotNull() {
            addCriterion("job_feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdEqualTo(Integer value) {
            addCriterion("job_feature_id =", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdNotEqualTo(Integer value) {
            addCriterion("job_feature_id <>", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdGreaterThan(Integer value) {
            addCriterion("job_feature_id >", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_feature_id >=", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdLessThan(Integer value) {
            addCriterion("job_feature_id <", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_feature_id <=", value, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdIn(List<Integer> values) {
            addCriterion("job_feature_id in", values, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdNotIn(List<Integer> values) {
            addCriterion("job_feature_id not in", values, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdBetween(Integer value1, Integer value2) {
            addCriterion("job_feature_id between", value1, value2, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andJobFeatureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_feature_id not between", value1, value2, "jobFeatureId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdIsNull() {
            addCriterion("expect_work_district_id is null");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdIsNotNull() {
            addCriterion("expect_work_district_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdEqualTo(Integer value) {
            addCriterion("expect_work_district_id =", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdNotEqualTo(Integer value) {
            addCriterion("expect_work_district_id <>", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdGreaterThan(Integer value) {
            addCriterion("expect_work_district_id >", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("expect_work_district_id >=", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdLessThan(Integer value) {
            addCriterion("expect_work_district_id <", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("expect_work_district_id <=", value, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdIn(List<Integer> values) {
            addCriterion("expect_work_district_id in", values, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdNotIn(List<Integer> values) {
            addCriterion("expect_work_district_id not in", values, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("expect_work_district_id between", value1, value2, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectWorkDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("expect_work_district_id not between", value1, value2, "expectWorkDistrictId");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNull() {
            addCriterion("expect_salary is null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNotNull() {
            addCriterion("expect_salary is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryEqualTo(String value) {
            addCriterion("expect_salary =", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotEqualTo(String value) {
            addCriterion("expect_salary <>", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThan(String value) {
            addCriterion("expect_salary >", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("expect_salary >=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThan(String value) {
            addCriterion("expect_salary <", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThanOrEqualTo(String value) {
            addCriterion("expect_salary <=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLike(String value) {
            addCriterion("expect_salary like", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotLike(String value) {
            addCriterion("expect_salary not like", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIn(List<String> values) {
            addCriterion("expect_salary in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotIn(List<String> values) {
            addCriterion("expect_salary not in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryBetween(String value1, String value2) {
            addCriterion("expect_salary between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotBetween(String value1, String value2) {
            addCriterion("expect_salary not between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusIsNull() {
            addCriterion("work_apply_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusIsNotNull() {
            addCriterion("work_apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusEqualTo(String value) {
            addCriterion("work_apply_status =", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusNotEqualTo(String value) {
            addCriterion("work_apply_status <>", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusGreaterThan(String value) {
            addCriterion("work_apply_status >", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("work_apply_status >=", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusLessThan(String value) {
            addCriterion("work_apply_status <", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusLessThanOrEqualTo(String value) {
            addCriterion("work_apply_status <=", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusLike(String value) {
            addCriterion("work_apply_status like", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusNotLike(String value) {
            addCriterion("work_apply_status not like", value, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusIn(List<String> values) {
            addCriterion("work_apply_status in", values, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusNotIn(List<String> values) {
            addCriterion("work_apply_status not in", values, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusBetween(String value1, String value2) {
            addCriterion("work_apply_status between", value1, value2, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andWorkApplyStatusNotBetween(String value1, String value2) {
            addCriterion("work_apply_status not between", value1, value2, "workApplyStatus");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Byte value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Byte value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Byte value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Byte value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Byte> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Byte> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Byte value1, Byte value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andResumeStatusIsNull() {
            addCriterion("resume_status is null");
            return (Criteria) this;
        }

        public Criteria andResumeStatusIsNotNull() {
            addCriterion("resume_status is not null");
            return (Criteria) this;
        }

        public Criteria andResumeStatusEqualTo(Byte value) {
            addCriterion("resume_status =", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusNotEqualTo(Byte value) {
            addCriterion("resume_status <>", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusGreaterThan(Byte value) {
            addCriterion("resume_status >", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("resume_status >=", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusLessThan(Byte value) {
            addCriterion("resume_status <", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("resume_status <=", value, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusIn(List<Byte> values) {
            addCriterion("resume_status in", values, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusNotIn(List<Byte> values) {
            addCriterion("resume_status not in", values, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusBetween(Byte value1, Byte value2) {
            addCriterion("resume_status between", value1, value2, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("resume_status not between", value1, value2, "resumeStatus");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNull() {
            addCriterion("resume_name is null");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNotNull() {
            addCriterion("resume_name is not null");
            return (Criteria) this;
        }

        public Criteria andResumeNameEqualTo(String value) {
            addCriterion("resume_name =", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotEqualTo(String value) {
            addCriterion("resume_name <>", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThan(String value) {
            addCriterion("resume_name >", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThanOrEqualTo(String value) {
            addCriterion("resume_name >=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThan(String value) {
            addCriterion("resume_name <", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThanOrEqualTo(String value) {
            addCriterion("resume_name <=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLike(String value) {
            addCriterion("resume_name like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotLike(String value) {
            addCriterion("resume_name not like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameIn(List<String> values) {
            addCriterion("resume_name in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotIn(List<String> values) {
            addCriterion("resume_name not in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameBetween(String value1, String value2) {
            addCriterion("resume_name between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotBetween(String value1, String value2) {
            addCriterion("resume_name not between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(Integer value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(Integer value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(Integer value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(Integer value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<Integer> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<Integer> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}