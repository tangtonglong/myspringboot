package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsSumRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsSumRoleExample() {
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

        public Criteria andSumRoleIdIsNull() {
            addCriterion("sum_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdIsNotNull() {
            addCriterion("sum_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdEqualTo(Integer value) {
            addCriterion("sum_role_id =", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdNotEqualTo(Integer value) {
            addCriterion("sum_role_id <>", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdGreaterThan(Integer value) {
            addCriterion("sum_role_id >", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_role_id >=", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdLessThan(Integer value) {
            addCriterion("sum_role_id <", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sum_role_id <=", value, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdIn(List<Integer> values) {
            addCriterion("sum_role_id in", values, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdNotIn(List<Integer> values) {
            addCriterion("sum_role_id not in", values, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_id between", value1, value2, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_id not between", value1, value2, "sumRoleId");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameIsNull() {
            addCriterion("sum_role_name is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameIsNotNull() {
            addCriterion("sum_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameEqualTo(String value) {
            addCriterion("sum_role_name =", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameNotEqualTo(String value) {
            addCriterion("sum_role_name <>", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameGreaterThan(String value) {
            addCriterion("sum_role_name >", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sum_role_name >=", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameLessThan(String value) {
            addCriterion("sum_role_name <", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameLessThanOrEqualTo(String value) {
            addCriterion("sum_role_name <=", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameLike(String value) {
            addCriterion("sum_role_name like", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameNotLike(String value) {
            addCriterion("sum_role_name not like", value, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameIn(List<String> values) {
            addCriterion("sum_role_name in", values, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameNotIn(List<String> values) {
            addCriterion("sum_role_name not in", values, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameBetween(String value1, String value2) {
            addCriterion("sum_role_name between", value1, value2, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleNameNotBetween(String value1, String value2) {
            addCriterion("sum_role_name not between", value1, value2, "sumRoleName");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescIsNull() {
            addCriterion("sum_role_desc is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescIsNotNull() {
            addCriterion("sum_role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescEqualTo(String value) {
            addCriterion("sum_role_desc =", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescNotEqualTo(String value) {
            addCriterion("sum_role_desc <>", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescGreaterThan(String value) {
            addCriterion("sum_role_desc >", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("sum_role_desc >=", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescLessThan(String value) {
            addCriterion("sum_role_desc <", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescLessThanOrEqualTo(String value) {
            addCriterion("sum_role_desc <=", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescLike(String value) {
            addCriterion("sum_role_desc like", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescNotLike(String value) {
            addCriterion("sum_role_desc not like", value, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescIn(List<String> values) {
            addCriterion("sum_role_desc in", values, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescNotIn(List<String> values) {
            addCriterion("sum_role_desc not in", values, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescBetween(String value1, String value2) {
            addCriterion("sum_role_desc between", value1, value2, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleDescNotBetween(String value1, String value2) {
            addCriterion("sum_role_desc not between", value1, value2, "sumRoleDesc");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeIsNull() {
            addCriterion("sum_role_type is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeIsNotNull() {
            addCriterion("sum_role_type is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeEqualTo(Integer value) {
            addCriterion("sum_role_type =", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeNotEqualTo(Integer value) {
            addCriterion("sum_role_type <>", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeGreaterThan(Integer value) {
            addCriterion("sum_role_type >", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_role_type >=", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeLessThan(Integer value) {
            addCriterion("sum_role_type <", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sum_role_type <=", value, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeIn(List<Integer> values) {
            addCriterion("sum_role_type in", values, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeNotIn(List<Integer> values) {
            addCriterion("sum_role_type not in", values, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_type between", value1, value2, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_type not between", value1, value2, "sumRoleType");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppIsNull() {
            addCriterion("sum_role_app is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppIsNotNull() {
            addCriterion("sum_role_app is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppEqualTo(Integer value) {
            addCriterion("sum_role_app =", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppNotEqualTo(Integer value) {
            addCriterion("sum_role_app <>", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppGreaterThan(Integer value) {
            addCriterion("sum_role_app >", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_role_app >=", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppLessThan(Integer value) {
            addCriterion("sum_role_app <", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppLessThanOrEqualTo(Integer value) {
            addCriterion("sum_role_app <=", value, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppIn(List<Integer> values) {
            addCriterion("sum_role_app in", values, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppNotIn(List<Integer> values) {
            addCriterion("sum_role_app not in", values, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_app between", value1, value2, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleAppNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_role_app not between", value1, value2, "sumRoleApp");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusIsNull() {
            addCriterion("sum_role_status is null");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusIsNotNull() {
            addCriterion("sum_role_status is not null");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusEqualTo(Byte value) {
            addCriterion("sum_role_status =", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusNotEqualTo(Byte value) {
            addCriterion("sum_role_status <>", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusGreaterThan(Byte value) {
            addCriterion("sum_role_status >", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sum_role_status >=", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusLessThan(Byte value) {
            addCriterion("sum_role_status <", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sum_role_status <=", value, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusIn(List<Byte> values) {
            addCriterion("sum_role_status in", values, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusNotIn(List<Byte> values) {
            addCriterion("sum_role_status not in", values, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusBetween(Byte value1, Byte value2) {
            addCriterion("sum_role_status between", value1, value2, "sumRoleStatus");
            return (Criteria) this;
        }

        public Criteria andSumRoleStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sum_role_status not between", value1, value2, "sumRoleStatus");
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