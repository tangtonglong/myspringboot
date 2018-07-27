package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsGzbRoleFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsGzbRoleFunctionExample() {
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

        public Criteria andGzbRoleNameIsNull() {
            addCriterion("gzb_role_name is null");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameIsNotNull() {
            addCriterion("gzb_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameEqualTo(String value) {
            addCriterion("gzb_role_name =", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameNotEqualTo(String value) {
            addCriterion("gzb_role_name <>", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameGreaterThan(String value) {
            addCriterion("gzb_role_name >", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("gzb_role_name >=", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameLessThan(String value) {
            addCriterion("gzb_role_name <", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameLessThanOrEqualTo(String value) {
            addCriterion("gzb_role_name <=", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameLike(String value) {
            addCriterion("gzb_role_name like", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameNotLike(String value) {
            addCriterion("gzb_role_name not like", value, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameIn(List<String> values) {
            addCriterion("gzb_role_name in", values, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameNotIn(List<String> values) {
            addCriterion("gzb_role_name not in", values, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameBetween(String value1, String value2) {
            addCriterion("gzb_role_name between", value1, value2, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleNameNotBetween(String value1, String value2) {
            addCriterion("gzb_role_name not between", value1, value2, "gzbRoleName");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescIsNull() {
            addCriterion("gzb_role_desc is null");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescIsNotNull() {
            addCriterion("gzb_role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescEqualTo(String value) {
            addCriterion("gzb_role_desc =", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescNotEqualTo(String value) {
            addCriterion("gzb_role_desc <>", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescGreaterThan(String value) {
            addCriterion("gzb_role_desc >", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("gzb_role_desc >=", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescLessThan(String value) {
            addCriterion("gzb_role_desc <", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescLessThanOrEqualTo(String value) {
            addCriterion("gzb_role_desc <=", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescLike(String value) {
            addCriterion("gzb_role_desc like", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescNotLike(String value) {
            addCriterion("gzb_role_desc not like", value, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescIn(List<String> values) {
            addCriterion("gzb_role_desc in", values, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescNotIn(List<String> values) {
            addCriterion("gzb_role_desc not in", values, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescBetween(String value1, String value2) {
            addCriterion("gzb_role_desc between", value1, value2, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbRoleDescNotBetween(String value1, String value2) {
            addCriterion("gzb_role_desc not between", value1, value2, "gzbRoleDesc");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListIsNull() {
            addCriterion("gzb_func_list is null");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListIsNotNull() {
            addCriterion("gzb_func_list is not null");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListEqualTo(String value) {
            addCriterion("gzb_func_list =", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListNotEqualTo(String value) {
            addCriterion("gzb_func_list <>", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListGreaterThan(String value) {
            addCriterion("gzb_func_list >", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListGreaterThanOrEqualTo(String value) {
            addCriterion("gzb_func_list >=", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListLessThan(String value) {
            addCriterion("gzb_func_list <", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListLessThanOrEqualTo(String value) {
            addCriterion("gzb_func_list <=", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListLike(String value) {
            addCriterion("gzb_func_list like", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListNotLike(String value) {
            addCriterion("gzb_func_list not like", value, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListIn(List<String> values) {
            addCriterion("gzb_func_list in", values, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListNotIn(List<String> values) {
            addCriterion("gzb_func_list not in", values, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListBetween(String value1, String value2) {
            addCriterion("gzb_func_list between", value1, value2, "gzbFuncList");
            return (Criteria) this;
        }

        public Criteria andGzbFuncListNotBetween(String value1, String value2) {
            addCriterion("gzb_func_list not between", value1, value2, "gzbFuncList");
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