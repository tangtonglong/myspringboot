package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MsUserSignRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsUserSignRecordExample() {
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

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignInTime1IsNull() {
            addCriterion("sign_in_time1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInTime1IsNotNull() {
            addCriterion("sign_in_time1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInTime1EqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time1 =", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1NotEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time1 <>", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1GreaterThan(Date value) {
            addCriterionForJDBCTime("sign_in_time1 >", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time1 >=", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1LessThan(Date value) {
            addCriterionForJDBCTime("sign_in_time1 <", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time1 <=", value, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1In(List<Date> values) {
            addCriterionForJDBCTime("sign_in_time1 in", values, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1NotIn(List<Date> values) {
            addCriterionForJDBCTime("sign_in_time1 not in", values, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1Between(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_in_time1 between", value1, value2, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignInTime1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_in_time1 not between", value1, value2, "signInTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1IsNull() {
            addCriterion("sign_out_time1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1IsNotNull() {
            addCriterion("sign_out_time1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1EqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time1 =", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1NotEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time1 <>", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1GreaterThan(Date value) {
            addCriterionForJDBCTime("sign_out_time1 >", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time1 >=", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1LessThan(Date value) {
            addCriterionForJDBCTime("sign_out_time1 <", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time1 <=", value, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1In(List<Date> values) {
            addCriterionForJDBCTime("sign_out_time1 in", values, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1NotIn(List<Date> values) {
            addCriterionForJDBCTime("sign_out_time1 not in", values, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1Between(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_out_time1 between", value1, value2, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignOutTime1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_out_time1 not between", value1, value2, "signOutTime1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1IsNull() {
            addCriterion("sign_in_add1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1IsNotNull() {
            addCriterion("sign_in_add1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1EqualTo(String value) {
            addCriterion("sign_in_add1 =", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1NotEqualTo(String value) {
            addCriterion("sign_in_add1 <>", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1GreaterThan(String value) {
            addCriterion("sign_in_add1 >", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_add1 >=", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1LessThan(String value) {
            addCriterion("sign_in_add1 <", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1LessThanOrEqualTo(String value) {
            addCriterion("sign_in_add1 <=", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1Like(String value) {
            addCriterion("sign_in_add1 like", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1NotLike(String value) {
            addCriterion("sign_in_add1 not like", value, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1In(List<String> values) {
            addCriterion("sign_in_add1 in", values, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1NotIn(List<String> values) {
            addCriterion("sign_in_add1 not in", values, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1Between(String value1, String value2) {
            addCriterion("sign_in_add1 between", value1, value2, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInAdd1NotBetween(String value1, String value2) {
            addCriterion("sign_in_add1 not between", value1, value2, "signInAdd1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1IsNull() {
            addCriterion("sign_in_lat1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInLat1IsNotNull() {
            addCriterion("sign_in_lat1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLat1EqualTo(String value) {
            addCriterion("sign_in_lat1 =", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1NotEqualTo(String value) {
            addCriterion("sign_in_lat1 <>", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1GreaterThan(String value) {
            addCriterion("sign_in_lat1 >", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_lat1 >=", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1LessThan(String value) {
            addCriterion("sign_in_lat1 <", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1LessThanOrEqualTo(String value) {
            addCriterion("sign_in_lat1 <=", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1Like(String value) {
            addCriterion("sign_in_lat1 like", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1NotLike(String value) {
            addCriterion("sign_in_lat1 not like", value, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1In(List<String> values) {
            addCriterion("sign_in_lat1 in", values, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1NotIn(List<String> values) {
            addCriterion("sign_in_lat1 not in", values, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1Between(String value1, String value2) {
            addCriterion("sign_in_lat1 between", value1, value2, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLat1NotBetween(String value1, String value2) {
            addCriterion("sign_in_lat1 not between", value1, value2, "signInLat1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1IsNull() {
            addCriterion("sign_in_lng1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInLng1IsNotNull() {
            addCriterion("sign_in_lng1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLng1EqualTo(String value) {
            addCriterion("sign_in_lng1 =", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1NotEqualTo(String value) {
            addCriterion("sign_in_lng1 <>", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1GreaterThan(String value) {
            addCriterion("sign_in_lng1 >", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_lng1 >=", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1LessThan(String value) {
            addCriterion("sign_in_lng1 <", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1LessThanOrEqualTo(String value) {
            addCriterion("sign_in_lng1 <=", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1Like(String value) {
            addCriterion("sign_in_lng1 like", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1NotLike(String value) {
            addCriterion("sign_in_lng1 not like", value, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1In(List<String> values) {
            addCriterion("sign_in_lng1 in", values, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1NotIn(List<String> values) {
            addCriterion("sign_in_lng1 not in", values, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1Between(String value1, String value2) {
            addCriterion("sign_in_lng1 between", value1, value2, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignInLng1NotBetween(String value1, String value2) {
            addCriterion("sign_in_lng1 not between", value1, value2, "signInLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1IsNull() {
            addCriterion("sign_out_add1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1IsNotNull() {
            addCriterion("sign_out_add1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1EqualTo(String value) {
            addCriterion("sign_out_add1 =", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1NotEqualTo(String value) {
            addCriterion("sign_out_add1 <>", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1GreaterThan(String value) {
            addCriterion("sign_out_add1 >", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_add1 >=", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1LessThan(String value) {
            addCriterion("sign_out_add1 <", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1LessThanOrEqualTo(String value) {
            addCriterion("sign_out_add1 <=", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1Like(String value) {
            addCriterion("sign_out_add1 like", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1NotLike(String value) {
            addCriterion("sign_out_add1 not like", value, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1In(List<String> values) {
            addCriterion("sign_out_add1 in", values, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1NotIn(List<String> values) {
            addCriterion("sign_out_add1 not in", values, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1Between(String value1, String value2) {
            addCriterion("sign_out_add1 between", value1, value2, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd1NotBetween(String value1, String value2) {
            addCriterion("sign_out_add1 not between", value1, value2, "signOutAdd1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1IsNull() {
            addCriterion("sign_out_lat1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1IsNotNull() {
            addCriterion("sign_out_lat1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1EqualTo(String value) {
            addCriterion("sign_out_lat1 =", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1NotEqualTo(String value) {
            addCriterion("sign_out_lat1 <>", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1GreaterThan(String value) {
            addCriterion("sign_out_lat1 >", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_lat1 >=", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1LessThan(String value) {
            addCriterion("sign_out_lat1 <", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1LessThanOrEqualTo(String value) {
            addCriterion("sign_out_lat1 <=", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1Like(String value) {
            addCriterion("sign_out_lat1 like", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1NotLike(String value) {
            addCriterion("sign_out_lat1 not like", value, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1In(List<String> values) {
            addCriterion("sign_out_lat1 in", values, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1NotIn(List<String> values) {
            addCriterion("sign_out_lat1 not in", values, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1Between(String value1, String value2) {
            addCriterion("sign_out_lat1 between", value1, value2, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLat1NotBetween(String value1, String value2) {
            addCriterion("sign_out_lat1 not between", value1, value2, "signOutLat1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1IsNull() {
            addCriterion("sign_out_lng1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1IsNotNull() {
            addCriterion("sign_out_lng1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1EqualTo(String value) {
            addCriterion("sign_out_lng1 =", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1NotEqualTo(String value) {
            addCriterion("sign_out_lng1 <>", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1GreaterThan(String value) {
            addCriterion("sign_out_lng1 >", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_lng1 >=", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1LessThan(String value) {
            addCriterion("sign_out_lng1 <", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1LessThanOrEqualTo(String value) {
            addCriterion("sign_out_lng1 <=", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1Like(String value) {
            addCriterion("sign_out_lng1 like", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1NotLike(String value) {
            addCriterion("sign_out_lng1 not like", value, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1In(List<String> values) {
            addCriterion("sign_out_lng1 in", values, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1NotIn(List<String> values) {
            addCriterion("sign_out_lng1 not in", values, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1Between(String value1, String value2) {
            addCriterion("sign_out_lng1 between", value1, value2, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignOutLng1NotBetween(String value1, String value2) {
            addCriterion("sign_out_lng1 not between", value1, value2, "signOutLng1");
            return (Criteria) this;
        }

        public Criteria andSignInTime2IsNull() {
            addCriterion("sign_in_time2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInTime2IsNotNull() {
            addCriterion("sign_in_time2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInTime2EqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time2 =", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2NotEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time2 <>", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2GreaterThan(Date value) {
            addCriterionForJDBCTime("sign_in_time2 >", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time2 >=", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2LessThan(Date value) {
            addCriterionForJDBCTime("sign_in_time2 <", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_in_time2 <=", value, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2In(List<Date> values) {
            addCriterionForJDBCTime("sign_in_time2 in", values, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2NotIn(List<Date> values) {
            addCriterionForJDBCTime("sign_in_time2 not in", values, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2Between(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_in_time2 between", value1, value2, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignInTime2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_in_time2 not between", value1, value2, "signInTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2IsNull() {
            addCriterion("sign_out_time2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2IsNotNull() {
            addCriterion("sign_out_time2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2EqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time2 =", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2NotEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time2 <>", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2GreaterThan(Date value) {
            addCriterionForJDBCTime("sign_out_time2 >", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time2 >=", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2LessThan(Date value) {
            addCriterionForJDBCTime("sign_out_time2 <", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sign_out_time2 <=", value, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2In(List<Date> values) {
            addCriterionForJDBCTime("sign_out_time2 in", values, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2NotIn(List<Date> values) {
            addCriterionForJDBCTime("sign_out_time2 not in", values, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2Between(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_out_time2 between", value1, value2, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignOutTime2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sign_out_time2 not between", value1, value2, "signOutTime2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2IsNull() {
            addCriterion("sign_in_add2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2IsNotNull() {
            addCriterion("sign_in_add2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2EqualTo(String value) {
            addCriterion("sign_in_add2 =", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2NotEqualTo(String value) {
            addCriterion("sign_in_add2 <>", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2GreaterThan(String value) {
            addCriterion("sign_in_add2 >", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_add2 >=", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2LessThan(String value) {
            addCriterion("sign_in_add2 <", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2LessThanOrEqualTo(String value) {
            addCriterion("sign_in_add2 <=", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2Like(String value) {
            addCriterion("sign_in_add2 like", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2NotLike(String value) {
            addCriterion("sign_in_add2 not like", value, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2In(List<String> values) {
            addCriterion("sign_in_add2 in", values, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2NotIn(List<String> values) {
            addCriterion("sign_in_add2 not in", values, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2Between(String value1, String value2) {
            addCriterion("sign_in_add2 between", value1, value2, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInAdd2NotBetween(String value1, String value2) {
            addCriterion("sign_in_add2 not between", value1, value2, "signInAdd2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2IsNull() {
            addCriterion("sign_in_lat2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInLat2IsNotNull() {
            addCriterion("sign_in_lat2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLat2EqualTo(String value) {
            addCriterion("sign_in_lat2 =", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2NotEqualTo(String value) {
            addCriterion("sign_in_lat2 <>", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2GreaterThan(String value) {
            addCriterion("sign_in_lat2 >", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_lat2 >=", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2LessThan(String value) {
            addCriterion("sign_in_lat2 <", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2LessThanOrEqualTo(String value) {
            addCriterion("sign_in_lat2 <=", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2Like(String value) {
            addCriterion("sign_in_lat2 like", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2NotLike(String value) {
            addCriterion("sign_in_lat2 not like", value, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2In(List<String> values) {
            addCriterion("sign_in_lat2 in", values, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2NotIn(List<String> values) {
            addCriterion("sign_in_lat2 not in", values, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2Between(String value1, String value2) {
            addCriterion("sign_in_lat2 between", value1, value2, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLat2NotBetween(String value1, String value2) {
            addCriterion("sign_in_lat2 not between", value1, value2, "signInLat2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2IsNull() {
            addCriterion("sign_in_lng2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInLng2IsNotNull() {
            addCriterion("sign_in_lng2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLng2EqualTo(String value) {
            addCriterion("sign_in_lng2 =", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2NotEqualTo(String value) {
            addCriterion("sign_in_lng2 <>", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2GreaterThan(String value) {
            addCriterion("sign_in_lng2 >", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_lng2 >=", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2LessThan(String value) {
            addCriterion("sign_in_lng2 <", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2LessThanOrEqualTo(String value) {
            addCriterion("sign_in_lng2 <=", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2Like(String value) {
            addCriterion("sign_in_lng2 like", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2NotLike(String value) {
            addCriterion("sign_in_lng2 not like", value, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2In(List<String> values) {
            addCriterion("sign_in_lng2 in", values, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2NotIn(List<String> values) {
            addCriterion("sign_in_lng2 not in", values, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2Between(String value1, String value2) {
            addCriterion("sign_in_lng2 between", value1, value2, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignInLng2NotBetween(String value1, String value2) {
            addCriterion("sign_in_lng2 not between", value1, value2, "signInLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2IsNull() {
            addCriterion("sign_out_add2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2IsNotNull() {
            addCriterion("sign_out_add2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2EqualTo(String value) {
            addCriterion("sign_out_add2 =", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2NotEqualTo(String value) {
            addCriterion("sign_out_add2 <>", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2GreaterThan(String value) {
            addCriterion("sign_out_add2 >", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_add2 >=", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2LessThan(String value) {
            addCriterion("sign_out_add2 <", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2LessThanOrEqualTo(String value) {
            addCriterion("sign_out_add2 <=", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2Like(String value) {
            addCriterion("sign_out_add2 like", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2NotLike(String value) {
            addCriterion("sign_out_add2 not like", value, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2In(List<String> values) {
            addCriterion("sign_out_add2 in", values, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2NotIn(List<String> values) {
            addCriterion("sign_out_add2 not in", values, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2Between(String value1, String value2) {
            addCriterion("sign_out_add2 between", value1, value2, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutAdd2NotBetween(String value1, String value2) {
            addCriterion("sign_out_add2 not between", value1, value2, "signOutAdd2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2IsNull() {
            addCriterion("sign_out_lat2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2IsNotNull() {
            addCriterion("sign_out_lat2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2EqualTo(String value) {
            addCriterion("sign_out_lat2 =", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2NotEqualTo(String value) {
            addCriterion("sign_out_lat2 <>", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2GreaterThan(String value) {
            addCriterion("sign_out_lat2 >", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_lat2 >=", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2LessThan(String value) {
            addCriterion("sign_out_lat2 <", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2LessThanOrEqualTo(String value) {
            addCriterion("sign_out_lat2 <=", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2Like(String value) {
            addCriterion("sign_out_lat2 like", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2NotLike(String value) {
            addCriterion("sign_out_lat2 not like", value, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2In(List<String> values) {
            addCriterion("sign_out_lat2 in", values, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2NotIn(List<String> values) {
            addCriterion("sign_out_lat2 not in", values, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2Between(String value1, String value2) {
            addCriterion("sign_out_lat2 between", value1, value2, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLat2NotBetween(String value1, String value2) {
            addCriterion("sign_out_lat2 not between", value1, value2, "signOutLat2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2IsNull() {
            addCriterion("sign_out_lng2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2IsNotNull() {
            addCriterion("sign_out_lng2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2EqualTo(String value) {
            addCriterion("sign_out_lng2 =", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2NotEqualTo(String value) {
            addCriterion("sign_out_lng2 <>", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2GreaterThan(String value) {
            addCriterion("sign_out_lng2 >", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2GreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_lng2 >=", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2LessThan(String value) {
            addCriterion("sign_out_lng2 <", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2LessThanOrEqualTo(String value) {
            addCriterion("sign_out_lng2 <=", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2Like(String value) {
            addCriterion("sign_out_lng2 like", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2NotLike(String value) {
            addCriterion("sign_out_lng2 not like", value, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2In(List<String> values) {
            addCriterion("sign_out_lng2 in", values, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2NotIn(List<String> values) {
            addCriterion("sign_out_lng2 not in", values, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2Between(String value1, String value2) {
            addCriterion("sign_out_lng2 between", value1, value2, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andSignOutLng2NotBetween(String value1, String value2) {
            addCriterion("sign_out_lng2 not between", value1, value2, "signOutLng2");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNull() {
            addCriterion("strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdEqualTo(Integer value) {
            addCriterion("strategy_id =", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotEqualTo(Integer value) {
            addCriterion("strategy_id <>", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThan(Integer value) {
            addCriterion("strategy_id >", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("strategy_id >=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThan(Integer value) {
            addCriterion("strategy_id <", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("strategy_id <=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIn(List<Integer> values) {
            addCriterion("strategy_id in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotIn(List<Integer> values) {
            addCriterion("strategy_id not in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("strategy_id not between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andSignInType1IsNull() {
            addCriterion("sign_in_type1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInType1IsNotNull() {
            addCriterion("sign_in_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInType1EqualTo(Byte value) {
            addCriterion("sign_in_type1 =", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1NotEqualTo(Byte value) {
            addCriterion("sign_in_type1 <>", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1GreaterThan(Byte value) {
            addCriterion("sign_in_type1 >", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1GreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type1 >=", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1LessThan(Byte value) {
            addCriterion("sign_in_type1 <", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1LessThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type1 <=", value, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1In(List<Byte> values) {
            addCriterion("sign_in_type1 in", values, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1NotIn(List<Byte> values) {
            addCriterion("sign_in_type1 not in", values, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1Between(Byte value1, Byte value2) {
            addCriterion("sign_in_type1 between", value1, value2, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignInType1NotBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_type1 not between", value1, value2, "signInType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1IsNull() {
            addCriterion("sign_out_type1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutType1IsNotNull() {
            addCriterion("sign_out_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutType1EqualTo(Byte value) {
            addCriterion("sign_out_type1 =", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1NotEqualTo(Byte value) {
            addCriterion("sign_out_type1 <>", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1GreaterThan(Byte value) {
            addCriterion("sign_out_type1 >", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1GreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_out_type1 >=", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1LessThan(Byte value) {
            addCriterion("sign_out_type1 <", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1LessThanOrEqualTo(Byte value) {
            addCriterion("sign_out_type1 <=", value, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1In(List<Byte> values) {
            addCriterion("sign_out_type1 in", values, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1NotIn(List<Byte> values) {
            addCriterion("sign_out_type1 not in", values, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1Between(Byte value1, Byte value2) {
            addCriterion("sign_out_type1 between", value1, value2, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignOutType1NotBetween(Byte value1, Byte value2) {
            addCriterion("sign_out_type1 not between", value1, value2, "signOutType1");
            return (Criteria) this;
        }

        public Criteria andSignInType2IsNull() {
            addCriterion("sign_in_type2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInType2IsNotNull() {
            addCriterion("sign_in_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInType2EqualTo(Byte value) {
            addCriterion("sign_in_type2 =", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2NotEqualTo(Byte value) {
            addCriterion("sign_in_type2 <>", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2GreaterThan(Byte value) {
            addCriterion("sign_in_type2 >", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2GreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type2 >=", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2LessThan(Byte value) {
            addCriterion("sign_in_type2 <", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2LessThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type2 <=", value, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2In(List<Byte> values) {
            addCriterion("sign_in_type2 in", values, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2NotIn(List<Byte> values) {
            addCriterion("sign_in_type2 not in", values, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2Between(Byte value1, Byte value2) {
            addCriterion("sign_in_type2 between", value1, value2, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignInType2NotBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_type2 not between", value1, value2, "signInType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2IsNull() {
            addCriterion("sign_out_type2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutType2IsNotNull() {
            addCriterion("sign_out_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutType2EqualTo(Byte value) {
            addCriterion("sign_out_type2 =", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2NotEqualTo(Byte value) {
            addCriterion("sign_out_type2 <>", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2GreaterThan(Byte value) {
            addCriterion("sign_out_type2 >", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2GreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_out_type2 >=", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2LessThan(Byte value) {
            addCriterion("sign_out_type2 <", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2LessThanOrEqualTo(Byte value) {
            addCriterion("sign_out_type2 <=", value, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2In(List<Byte> values) {
            addCriterion("sign_out_type2 in", values, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2NotIn(List<Byte> values) {
            addCriterion("sign_out_type2 not in", values, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2Between(Byte value1, Byte value2) {
            addCriterion("sign_out_type2 between", value1, value2, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andSignOutType2NotBetween(Byte value1, Byte value2) {
            addCriterion("sign_out_type2 not between", value1, value2, "signOutType2");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceIsNull() {
            addCriterion("full_attendance is null");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceIsNotNull() {
            addCriterion("full_attendance is not null");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceEqualTo(Byte value) {
            addCriterion("full_attendance =", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceNotEqualTo(Byte value) {
            addCriterion("full_attendance <>", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceGreaterThan(Byte value) {
            addCriterion("full_attendance >", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceGreaterThanOrEqualTo(Byte value) {
            addCriterion("full_attendance >=", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceLessThan(Byte value) {
            addCriterion("full_attendance <", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceLessThanOrEqualTo(Byte value) {
            addCriterion("full_attendance <=", value, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceIn(List<Byte> values) {
            addCriterion("full_attendance in", values, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceNotIn(List<Byte> values) {
            addCriterion("full_attendance not in", values, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceBetween(Byte value1, Byte value2) {
            addCriterion("full_attendance between", value1, value2, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andFullAttendanceNotBetween(Byte value1, Byte value2) {
            addCriterion("full_attendance not between", value1, value2, "fullAttendance");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNull() {
            addCriterion("check_in is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNotNull() {
            addCriterion("check_in is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEqualTo(Byte value) {
            addCriterion("check_in =", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotEqualTo(Byte value) {
            addCriterion("check_in <>", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThan(Byte value) {
            addCriterion("check_in >", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_in >=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThan(Byte value) {
            addCriterion("check_in <", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThanOrEqualTo(Byte value) {
            addCriterion("check_in <=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInIn(List<Byte> values) {
            addCriterion("check_in in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotIn(List<Byte> values) {
            addCriterion("check_in not in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInBetween(Byte value1, Byte value2) {
            addCriterion("check_in between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotBetween(Byte value1, Byte value2) {
            addCriterion("check_in not between", value1, value2, "checkIn");
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