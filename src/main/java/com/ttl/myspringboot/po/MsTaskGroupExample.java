package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsTaskGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsTaskGroupExample() {
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

        public Criteria andTaskRuleIdIsNull() {
            addCriterion("task_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdIsNotNull() {
            addCriterion("task_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdEqualTo(Integer value) {
            addCriterion("task_rule_id =", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdNotEqualTo(Integer value) {
            addCriterion("task_rule_id <>", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdGreaterThan(Integer value) {
            addCriterion("task_rule_id >", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_rule_id >=", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdLessThan(Integer value) {
            addCriterion("task_rule_id <", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_rule_id <=", value, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdIn(List<Integer> values) {
            addCriterion("task_rule_id in", values, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdNotIn(List<Integer> values) {
            addCriterion("task_rule_id not in", values, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("task_rule_id between", value1, value2, "taskRuleId");
            return (Criteria) this;
        }

        public Criteria andTaskRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_rule_id not between", value1, value2, "taskRuleId");
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

        public Criteria andRelStatusIsNull() {
            addCriterion("rel_status is null");
            return (Criteria) this;
        }

        public Criteria andRelStatusIsNotNull() {
            addCriterion("rel_status is not null");
            return (Criteria) this;
        }

        public Criteria andRelStatusEqualTo(Byte value) {
            addCriterion("rel_status =", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusNotEqualTo(Byte value) {
            addCriterion("rel_status <>", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusGreaterThan(Byte value) {
            addCriterion("rel_status >", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("rel_status >=", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusLessThan(Byte value) {
            addCriterion("rel_status <", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusLessThanOrEqualTo(Byte value) {
            addCriterion("rel_status <=", value, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusIn(List<Byte> values) {
            addCriterion("rel_status in", values, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusNotIn(List<Byte> values) {
            addCriterion("rel_status not in", values, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusBetween(Byte value1, Byte value2) {
            addCriterion("rel_status between", value1, value2, "relStatus");
            return (Criteria) this;
        }

        public Criteria andRelStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("rel_status not between", value1, value2, "relStatus");
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