package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MsAppointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsAppointExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andAppointTitleIsNull() {
            addCriterion("appoint_title is null");
            return (Criteria) this;
        }

        public Criteria andAppointTitleIsNotNull() {
            addCriterion("appoint_title is not null");
            return (Criteria) this;
        }

        public Criteria andAppointTitleEqualTo(String value) {
            addCriterion("appoint_title =", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleNotEqualTo(String value) {
            addCriterion("appoint_title <>", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleGreaterThan(String value) {
            addCriterion("appoint_title >", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleGreaterThanOrEqualTo(String value) {
            addCriterion("appoint_title >=", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleLessThan(String value) {
            addCriterion("appoint_title <", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleLessThanOrEqualTo(String value) {
            addCriterion("appoint_title <=", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleLike(String value) {
            addCriterion("appoint_title like", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleNotLike(String value) {
            addCriterion("appoint_title not like", value, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleIn(List<String> values) {
            addCriterion("appoint_title in", values, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleNotIn(List<String> values) {
            addCriterion("appoint_title not in", values, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleBetween(String value1, String value2) {
            addCriterion("appoint_title between", value1, value2, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andAppointTitleNotBetween(String value1, String value2) {
            addCriterion("appoint_title not between", value1, value2, "appointTitle");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andWelfareListIsNull() {
            addCriterion("welfare_list is null");
            return (Criteria) this;
        }

        public Criteria andWelfareListIsNotNull() {
            addCriterion("welfare_list is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareListEqualTo(String value) {
            addCriterion("welfare_list =", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListNotEqualTo(String value) {
            addCriterion("welfare_list <>", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListGreaterThan(String value) {
            addCriterion("welfare_list >", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListGreaterThanOrEqualTo(String value) {
            addCriterion("welfare_list >=", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListLessThan(String value) {
            addCriterion("welfare_list <", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListLessThanOrEqualTo(String value) {
            addCriterion("welfare_list <=", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListLike(String value) {
            addCriterion("welfare_list like", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListNotLike(String value) {
            addCriterion("welfare_list not like", value, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListIn(List<String> values) {
            addCriterion("welfare_list in", values, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListNotIn(List<String> values) {
            addCriterion("welfare_list not in", values, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListBetween(String value1, String value2) {
            addCriterion("welfare_list between", value1, value2, "welfareList");
            return (Criteria) this;
        }

        public Criteria andWelfareListNotBetween(String value1, String value2) {
            addCriterion("welfare_list not between", value1, value2, "welfareList");
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

        public Criteria andPayDescIsNull() {
            addCriterion("pay_desc is null");
            return (Criteria) this;
        }

        public Criteria andPayDescIsNotNull() {
            addCriterion("pay_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPayDescEqualTo(String value) {
            addCriterion("pay_desc =", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotEqualTo(String value) {
            addCriterion("pay_desc <>", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescGreaterThan(String value) {
            addCriterion("pay_desc >", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescGreaterThanOrEqualTo(String value) {
            addCriterion("pay_desc >=", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLessThan(String value) {
            addCriterion("pay_desc <", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLessThanOrEqualTo(String value) {
            addCriterion("pay_desc <=", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLike(String value) {
            addCriterion("pay_desc like", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotLike(String value) {
            addCriterion("pay_desc not like", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescIn(List<String> values) {
            addCriterion("pay_desc in", values, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotIn(List<String> values) {
            addCriterion("pay_desc not in", values, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescBetween(String value1, String value2) {
            addCriterion("pay_desc between", value1, value2, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotBetween(String value1, String value2) {
            addCriterion("pay_desc not between", value1, value2, "payDesc");
            return (Criteria) this;
        }

        public Criteria andCharacterIdIsNull() {
            addCriterion("character_id is null");
            return (Criteria) this;
        }

        public Criteria andCharacterIdIsNotNull() {
            addCriterion("character_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterIdEqualTo(Integer value) {
            addCriterion("character_id =", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdNotEqualTo(Integer value) {
            addCriterion("character_id <>", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdGreaterThan(Integer value) {
            addCriterion("character_id >", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("character_id >=", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdLessThan(Integer value) {
            addCriterion("character_id <", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdLessThanOrEqualTo(Integer value) {
            addCriterion("character_id <=", value, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdIn(List<Integer> values) {
            addCriterion("character_id in", values, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdNotIn(List<Integer> values) {
            addCriterion("character_id not in", values, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdBetween(Integer value1, Integer value2) {
            addCriterion("character_id between", value1, value2, "characterId");
            return (Criteria) this;
        }

        public Criteria andCharacterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("character_id not between", value1, value2, "characterId");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAppointStatusIsNull() {
            addCriterion("appoint_status is null");
            return (Criteria) this;
        }

        public Criteria andAppointStatusIsNotNull() {
            addCriterion("appoint_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppointStatusEqualTo(Byte value) {
            addCriterion("appoint_status =", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusNotEqualTo(Byte value) {
            addCriterion("appoint_status <>", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusGreaterThan(Byte value) {
            addCriterion("appoint_status >", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("appoint_status >=", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusLessThan(Byte value) {
            addCriterion("appoint_status <", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusLessThanOrEqualTo(Byte value) {
            addCriterion("appoint_status <=", value, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusIn(List<Byte> values) {
            addCriterion("appoint_status in", values, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusNotIn(List<Byte> values) {
            addCriterion("appoint_status not in", values, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusBetween(Byte value1, Byte value2) {
            addCriterion("appoint_status between", value1, value2, "appointStatus");
            return (Criteria) this;
        }

        public Criteria andAppointStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("appoint_status not between", value1, value2, "appointStatus");
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