package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MsTimeRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsTimeRuleExample() {
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

        public Criteria andTimeNameIsNull() {
            addCriterion("time_name is null");
            return (Criteria) this;
        }

        public Criteria andTimeNameIsNotNull() {
            addCriterion("time_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimeNameEqualTo(String value) {
            addCriterion("time_name =", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotEqualTo(String value) {
            addCriterion("time_name <>", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameGreaterThan(String value) {
            addCriterion("time_name >", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("time_name >=", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLessThan(String value) {
            addCriterion("time_name <", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLessThanOrEqualTo(String value) {
            addCriterion("time_name <=", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameLike(String value) {
            addCriterion("time_name like", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotLike(String value) {
            addCriterion("time_name not like", value, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameIn(List<String> values) {
            addCriterion("time_name in", values, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotIn(List<String> values) {
            addCriterion("time_name not in", values, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameBetween(String value1, String value2) {
            addCriterion("time_name between", value1, value2, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeNameNotBetween(String value1, String value2) {
            addCriterion("time_name not between", value1, value2, "timeName");
            return (Criteria) this;
        }

        public Criteria andTimeDescIsNull() {
            addCriterion("time_desc is null");
            return (Criteria) this;
        }

        public Criteria andTimeDescIsNotNull() {
            addCriterion("time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDescEqualTo(String value) {
            addCriterion("time_desc =", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotEqualTo(String value) {
            addCriterion("time_desc <>", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescGreaterThan(String value) {
            addCriterion("time_desc >", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("time_desc >=", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLessThan(String value) {
            addCriterion("time_desc <", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLessThanOrEqualTo(String value) {
            addCriterion("time_desc <=", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescLike(String value) {
            addCriterion("time_desc like", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotLike(String value) {
            addCriterion("time_desc not like", value, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescIn(List<String> values) {
            addCriterion("time_desc in", values, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotIn(List<String> values) {
            addCriterion("time_desc not in", values, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescBetween(String value1, String value2) {
            addCriterion("time_desc between", value1, value2, "timeDesc");
            return (Criteria) this;
        }

        public Criteria andTimeDescNotBetween(String value1, String value2) {
            addCriterion("time_desc not between", value1, value2, "timeDesc");
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

        public Criteria andSignInBefore1IsNull() {
            addCriterion("sign_in_before1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1IsNotNull() {
            addCriterion("sign_in_before1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1EqualTo(Integer value) {
            addCriterion("sign_in_before1 =", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1NotEqualTo(Integer value) {
            addCriterion("sign_in_before1 <>", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1GreaterThan(Integer value) {
            addCriterion("sign_in_before1 >", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_before1 >=", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1LessThan(Integer value) {
            addCriterion("sign_in_before1 <", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1LessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_before1 <=", value, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1In(List<Integer> values) {
            addCriterion("sign_in_before1 in", values, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1NotIn(List<Integer> values) {
            addCriterion("sign_in_before1 not in", values, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1Between(Integer value1, Integer value2) {
            addCriterion("sign_in_before1 between", value1, value2, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInBefore1NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_before1 not between", value1, value2, "signInBefore1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1IsNull() {
            addCriterion("sign_in_after1 is null");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1IsNotNull() {
            addCriterion("sign_in_after1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1EqualTo(Integer value) {
            addCriterion("sign_in_after1 =", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1NotEqualTo(Integer value) {
            addCriterion("sign_in_after1 <>", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1GreaterThan(Integer value) {
            addCriterion("sign_in_after1 >", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_after1 >=", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1LessThan(Integer value) {
            addCriterion("sign_in_after1 <", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1LessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_after1 <=", value, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1In(List<Integer> values) {
            addCriterion("sign_in_after1 in", values, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1NotIn(List<Integer> values) {
            addCriterion("sign_in_after1 not in", values, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1Between(Integer value1, Integer value2) {
            addCriterion("sign_in_after1 between", value1, value2, "signInAfter1");
            return (Criteria) this;
        }

        public Criteria andSignInAfter1NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_after1 not between", value1, value2, "signInAfter1");
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

        public Criteria andSignOutBefore1IsNull() {
            addCriterion("sign_out_before1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1IsNotNull() {
            addCriterion("sign_out_before1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1EqualTo(Integer value) {
            addCriterion("sign_out_before1 =", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1NotEqualTo(Integer value) {
            addCriterion("sign_out_before1 <>", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1GreaterThan(Integer value) {
            addCriterion("sign_out_before1 >", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_out_before1 >=", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1LessThan(Integer value) {
            addCriterion("sign_out_before1 <", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1LessThanOrEqualTo(Integer value) {
            addCriterion("sign_out_before1 <=", value, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1In(List<Integer> values) {
            addCriterion("sign_out_before1 in", values, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1NotIn(List<Integer> values) {
            addCriterion("sign_out_before1 not in", values, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1Between(Integer value1, Integer value2) {
            addCriterion("sign_out_before1 between", value1, value2, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore1NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_out_before1 not between", value1, value2, "signOutBefore1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1IsNull() {
            addCriterion("sign_out_after1 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1IsNotNull() {
            addCriterion("sign_out_after1 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1EqualTo(Integer value) {
            addCriterion("sign_out_after1 =", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1NotEqualTo(Integer value) {
            addCriterion("sign_out_after1 <>", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1GreaterThan(Integer value) {
            addCriterion("sign_out_after1 >", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_out_after1 >=", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1LessThan(Integer value) {
            addCriterion("sign_out_after1 <", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1LessThanOrEqualTo(Integer value) {
            addCriterion("sign_out_after1 <=", value, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1In(List<Integer> values) {
            addCriterion("sign_out_after1 in", values, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1NotIn(List<Integer> values) {
            addCriterion("sign_out_after1 not in", values, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1Between(Integer value1, Integer value2) {
            addCriterion("sign_out_after1 between", value1, value2, "signOutAfter1");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter1NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_out_after1 not between", value1, value2, "signOutAfter1");
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

        public Criteria andSignInBefore2IsNull() {
            addCriterion("sign_in_before2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2IsNotNull() {
            addCriterion("sign_in_before2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2EqualTo(Integer value) {
            addCriterion("sign_in_before2 =", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2NotEqualTo(Integer value) {
            addCriterion("sign_in_before2 <>", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2GreaterThan(Integer value) {
            addCriterion("sign_in_before2 >", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_before2 >=", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2LessThan(Integer value) {
            addCriterion("sign_in_before2 <", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2LessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_before2 <=", value, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2In(List<Integer> values) {
            addCriterion("sign_in_before2 in", values, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2NotIn(List<Integer> values) {
            addCriterion("sign_in_before2 not in", values, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2Between(Integer value1, Integer value2) {
            addCriterion("sign_in_before2 between", value1, value2, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInBefore2NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_before2 not between", value1, value2, "signInBefore2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2IsNull() {
            addCriterion("sign_in_after2 is null");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2IsNotNull() {
            addCriterion("sign_in_after2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2EqualTo(Integer value) {
            addCriterion("sign_in_after2 =", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2NotEqualTo(Integer value) {
            addCriterion("sign_in_after2 <>", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2GreaterThan(Integer value) {
            addCriterion("sign_in_after2 >", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_after2 >=", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2LessThan(Integer value) {
            addCriterion("sign_in_after2 <", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2LessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_after2 <=", value, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2In(List<Integer> values) {
            addCriterion("sign_in_after2 in", values, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2NotIn(List<Integer> values) {
            addCriterion("sign_in_after2 not in", values, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2Between(Integer value1, Integer value2) {
            addCriterion("sign_in_after2 between", value1, value2, "signInAfter2");
            return (Criteria) this;
        }

        public Criteria andSignInAfter2NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_after2 not between", value1, value2, "signInAfter2");
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

        public Criteria andSignOutBefore2IsNull() {
            addCriterion("sign_out_before2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2IsNotNull() {
            addCriterion("sign_out_before2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2EqualTo(Integer value) {
            addCriterion("sign_out_before2 =", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2NotEqualTo(Integer value) {
            addCriterion("sign_out_before2 <>", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2GreaterThan(Integer value) {
            addCriterion("sign_out_before2 >", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_out_before2 >=", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2LessThan(Integer value) {
            addCriterion("sign_out_before2 <", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2LessThanOrEqualTo(Integer value) {
            addCriterion("sign_out_before2 <=", value, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2In(List<Integer> values) {
            addCriterion("sign_out_before2 in", values, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2NotIn(List<Integer> values) {
            addCriterion("sign_out_before2 not in", values, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2Between(Integer value1, Integer value2) {
            addCriterion("sign_out_before2 between", value1, value2, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutBefore2NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_out_before2 not between", value1, value2, "signOutBefore2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2IsNull() {
            addCriterion("sign_out_after2 is null");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2IsNotNull() {
            addCriterion("sign_out_after2 is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2EqualTo(Integer value) {
            addCriterion("sign_out_after2 =", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2NotEqualTo(Integer value) {
            addCriterion("sign_out_after2 <>", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2GreaterThan(Integer value) {
            addCriterion("sign_out_after2 >", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_out_after2 >=", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2LessThan(Integer value) {
            addCriterion("sign_out_after2 <", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2LessThanOrEqualTo(Integer value) {
            addCriterion("sign_out_after2 <=", value, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2In(List<Integer> values) {
            addCriterion("sign_out_after2 in", values, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2NotIn(List<Integer> values) {
            addCriterion("sign_out_after2 not in", values, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2Between(Integer value1, Integer value2) {
            addCriterion("sign_out_after2 between", value1, value2, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andSignOutAfter2NotBetween(Integer value1, Integer value2) {
            addCriterion("sign_out_after2 not between", value1, value2, "signOutAfter2");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeIsNull() {
            addCriterion("time_rule_type is null");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeIsNotNull() {
            addCriterion("time_rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeEqualTo(Byte value) {
            addCriterion("time_rule_type =", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeNotEqualTo(Byte value) {
            addCriterion("time_rule_type <>", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeGreaterThan(Byte value) {
            addCriterion("time_rule_type >", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("time_rule_type >=", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeLessThan(Byte value) {
            addCriterion("time_rule_type <", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("time_rule_type <=", value, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeIn(List<Byte> values) {
            addCriterion("time_rule_type in", values, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeNotIn(List<Byte> values) {
            addCriterion("time_rule_type not in", values, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeBetween(Byte value1, Byte value2) {
            addCriterion("time_rule_type between", value1, value2, "timeRuleType");
            return (Criteria) this;
        }

        public Criteria andTimeRuleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("time_rule_type not between", value1, value2, "timeRuleType");
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