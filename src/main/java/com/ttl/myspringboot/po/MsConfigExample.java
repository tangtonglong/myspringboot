package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsConfigExample() {
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

        public Criteria andConfigValueIsNull() {
            addCriterion("config_value is null");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNotNull() {
            addCriterion("config_value is not null");
            return (Criteria) this;
        }

        public Criteria andConfigValueEqualTo(String value) {
            addCriterion("config_value =", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotEqualTo(String value) {
            addCriterion("config_value <>", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThan(String value) {
            addCriterion("config_value >", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("config_value >=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThan(String value) {
            addCriterion("config_value <", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThanOrEqualTo(String value) {
            addCriterion("config_value <=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLike(String value) {
            addCriterion("config_value like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotLike(String value) {
            addCriterion("config_value not like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueIn(List<String> values) {
            addCriterion("config_value in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotIn(List<String> values) {
            addCriterion("config_value not in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueBetween(String value1, String value2) {
            addCriterion("config_value between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotBetween(String value1, String value2) {
            addCriterion("config_value not between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("config_name is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("config_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("config_name =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("config_name <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("config_name >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("config_name >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("config_name <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("config_name <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("config_name like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("config_name not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("config_name in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("config_name not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("config_name between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("config_name not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionIsNull() {
            addCriterion("config_description is null");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionIsNotNull() {
            addCriterion("config_description is not null");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionEqualTo(String value) {
            addCriterion("config_description =", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionNotEqualTo(String value) {
            addCriterion("config_description <>", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionGreaterThan(String value) {
            addCriterion("config_description >", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("config_description >=", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionLessThan(String value) {
            addCriterion("config_description <", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionLessThanOrEqualTo(String value) {
            addCriterion("config_description <=", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionLike(String value) {
            addCriterion("config_description like", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionNotLike(String value) {
            addCriterion("config_description not like", value, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionIn(List<String> values) {
            addCriterion("config_description in", values, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionNotIn(List<String> values) {
            addCriterion("config_description not in", values, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionBetween(String value1, String value2) {
            addCriterion("config_description between", value1, value2, "configDescription");
            return (Criteria) this;
        }

        public Criteria andConfigDescriptionNotBetween(String value1, String value2) {
            addCriterion("config_description not between", value1, value2, "configDescription");
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