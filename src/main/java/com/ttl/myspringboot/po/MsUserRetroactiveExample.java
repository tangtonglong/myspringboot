package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MsUserRetroactiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsUserRetroactiveExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andRetroactiveReasonIsNull() {
            addCriterion("retroactive_reason is null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonIsNotNull() {
            addCriterion("retroactive_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonEqualTo(String value) {
            addCriterion("retroactive_reason =", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonNotEqualTo(String value) {
            addCriterion("retroactive_reason <>", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonGreaterThan(String value) {
            addCriterion("retroactive_reason >", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("retroactive_reason >=", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonLessThan(String value) {
            addCriterion("retroactive_reason <", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonLessThanOrEqualTo(String value) {
            addCriterion("retroactive_reason <=", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonLike(String value) {
            addCriterion("retroactive_reason like", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonNotLike(String value) {
            addCriterion("retroactive_reason not like", value, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonIn(List<String> values) {
            addCriterion("retroactive_reason in", values, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonNotIn(List<String> values) {
            addCriterion("retroactive_reason not in", values, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonBetween(String value1, String value2) {
            addCriterion("retroactive_reason between", value1, value2, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveReasonNotBetween(String value1, String value2) {
            addCriterion("retroactive_reason not between", value1, value2, "retroactiveReason");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescIsNull() {
            addCriterion("retroactive_desc is null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescIsNotNull() {
            addCriterion("retroactive_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescEqualTo(String value) {
            addCriterion("retroactive_desc =", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescNotEqualTo(String value) {
            addCriterion("retroactive_desc <>", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescGreaterThan(String value) {
            addCriterion("retroactive_desc >", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescGreaterThanOrEqualTo(String value) {
            addCriterion("retroactive_desc >=", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescLessThan(String value) {
            addCriterion("retroactive_desc <", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescLessThanOrEqualTo(String value) {
            addCriterion("retroactive_desc <=", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescLike(String value) {
            addCriterion("retroactive_desc like", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescNotLike(String value) {
            addCriterion("retroactive_desc not like", value, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescIn(List<String> values) {
            addCriterion("retroactive_desc in", values, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescNotIn(List<String> values) {
            addCriterion("retroactive_desc not in", values, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescBetween(String value1, String value2) {
            addCriterion("retroactive_desc between", value1, value2, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDescNotBetween(String value1, String value2) {
            addCriterion("retroactive_desc not between", value1, value2, "retroactiveDesc");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateIsNull() {
            addCriterion("retroactive_date is null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateIsNotNull() {
            addCriterion("retroactive_date is not null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("retroactive_date =", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("retroactive_date <>", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("retroactive_date >", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("retroactive_date >=", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateLessThan(Date value) {
            addCriterionForJDBCDate("retroactive_date <", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("retroactive_date <=", value, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("retroactive_date in", values, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("retroactive_date not in", values, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("retroactive_date between", value1, value2, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("retroactive_date not between", value1, value2, "retroactiveDate");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeIsNull() {
            addCriterion("retroactive_time is null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeIsNotNull() {
            addCriterion("retroactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeEqualTo(Date value) {
            addCriterionForJDBCTime("retroactive_time =", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("retroactive_time <>", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("retroactive_time >", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("retroactive_time >=", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeLessThan(Date value) {
            addCriterionForJDBCTime("retroactive_time <", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("retroactive_time <=", value, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeIn(List<Date> values) {
            addCriterionForJDBCTime("retroactive_time in", values, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("retroactive_time not in", values, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("retroactive_time between", value1, value2, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andRetroactiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("retroactive_time not between", value1, value2, "retroactiveTime");
            return (Criteria) this;
        }

        public Criteria andAttachUrlIsNull() {
            addCriterion("attach_url is null");
            return (Criteria) this;
        }

        public Criteria andAttachUrlIsNotNull() {
            addCriterion("attach_url is not null");
            return (Criteria) this;
        }

        public Criteria andAttachUrlEqualTo(String value) {
            addCriterion("attach_url =", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlNotEqualTo(String value) {
            addCriterion("attach_url <>", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlGreaterThan(String value) {
            addCriterion("attach_url >", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlGreaterThanOrEqualTo(String value) {
            addCriterion("attach_url >=", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlLessThan(String value) {
            addCriterion("attach_url <", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlLessThanOrEqualTo(String value) {
            addCriterion("attach_url <=", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlLike(String value) {
            addCriterion("attach_url like", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlNotLike(String value) {
            addCriterion("attach_url not like", value, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlIn(List<String> values) {
            addCriterion("attach_url in", values, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlNotIn(List<String> values) {
            addCriterion("attach_url not in", values, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlBetween(String value1, String value2) {
            addCriterion("attach_url between", value1, value2, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andAttachUrlNotBetween(String value1, String value2) {
            addCriterion("attach_url not between", value1, value2, "attachUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("is_available is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("is_available is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(Byte value) {
            addCriterion("is_available =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(Byte value) {
            addCriterion("is_available <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(Byte value) {
            addCriterion("is_available >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_available >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(Byte value) {
            addCriterion("is_available <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(Byte value) {
            addCriterion("is_available <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<Byte> values) {
            addCriterion("is_available in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<Byte> values) {
            addCriterion("is_available not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(Byte value1, Byte value2) {
            addCriterion("is_available between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_available not between", value1, value2, "isAvailable");
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