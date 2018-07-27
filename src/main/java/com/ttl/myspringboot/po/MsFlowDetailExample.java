package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsFlowDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsFlowDetailExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Integer value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Integer value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Integer value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Integer value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Integer> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Integer> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowOrderIsNull() {
            addCriterion("flow_order is null");
            return (Criteria) this;
        }

        public Criteria andFlowOrderIsNotNull() {
            addCriterion("flow_order is not null");
            return (Criteria) this;
        }

        public Criteria andFlowOrderEqualTo(Integer value) {
            addCriterion("flow_order =", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderNotEqualTo(Integer value) {
            addCriterion("flow_order <>", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderGreaterThan(Integer value) {
            addCriterion("flow_order >", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_order >=", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderLessThan(Integer value) {
            addCriterion("flow_order <", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderLessThanOrEqualTo(Integer value) {
            addCriterion("flow_order <=", value, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderIn(List<Integer> values) {
            addCriterion("flow_order in", values, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderNotIn(List<Integer> values) {
            addCriterion("flow_order not in", values, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderBetween(Integer value1, Integer value2) {
            addCriterion("flow_order between", value1, value2, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_order not between", value1, value2, "flowOrder");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdIsNull() {
            addCriterion("flow_role_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdIsNotNull() {
            addCriterion("flow_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdEqualTo(Integer value) {
            addCriterion("flow_role_id =", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdNotEqualTo(Integer value) {
            addCriterion("flow_role_id <>", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdGreaterThan(Integer value) {
            addCriterion("flow_role_id >", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_role_id >=", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdLessThan(Integer value) {
            addCriterion("flow_role_id <", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_role_id <=", value, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdIn(List<Integer> values) {
            addCriterion("flow_role_id in", values, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdNotIn(List<Integer> values) {
            addCriterion("flow_role_id not in", values, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_role_id between", value1, value2, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andFlowRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_role_id not between", value1, value2, "flowRoleId");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIsNull() {
            addCriterion("is_approval is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIsNotNull() {
            addCriterion("is_approval is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovalEqualTo(Byte value) {
            addCriterion("is_approval =", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotEqualTo(Byte value) {
            addCriterion("is_approval <>", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalGreaterThan(Byte value) {
            addCriterion("is_approval >", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_approval >=", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalLessThan(Byte value) {
            addCriterion("is_approval <", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalLessThanOrEqualTo(Byte value) {
            addCriterion("is_approval <=", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIn(List<Byte> values) {
            addCriterion("is_approval in", values, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotIn(List<Byte> values) {
            addCriterion("is_approval not in", values, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalBetween(Byte value1, Byte value2) {
            addCriterion("is_approval between", value1, value2, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotBetween(Byte value1, Byte value2) {
            addCriterion("is_approval not between", value1, value2, "isApproval");
            return (Criteria) this;
        }

        public Criteria andRemindIdIsNull() {
            addCriterion("remind_id is null");
            return (Criteria) this;
        }

        public Criteria andRemindIdIsNotNull() {
            addCriterion("remind_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemindIdEqualTo(String value) {
            addCriterion("remind_id =", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdNotEqualTo(String value) {
            addCriterion("remind_id <>", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdGreaterThan(String value) {
            addCriterion("remind_id >", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdGreaterThanOrEqualTo(String value) {
            addCriterion("remind_id >=", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdLessThan(String value) {
            addCriterion("remind_id <", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdLessThanOrEqualTo(String value) {
            addCriterion("remind_id <=", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdLike(String value) {
            addCriterion("remind_id like", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdNotLike(String value) {
            addCriterion("remind_id not like", value, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdIn(List<String> values) {
            addCriterion("remind_id in", values, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdNotIn(List<String> values) {
            addCriterion("remind_id not in", values, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdBetween(String value1, String value2) {
            addCriterion("remind_id between", value1, value2, "remindId");
            return (Criteria) this;
        }

        public Criteria andRemindIdNotBetween(String value1, String value2) {
            addCriterion("remind_id not between", value1, value2, "remindId");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsIsNull() {
            addCriterion("whereabouts is null");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsIsNotNull() {
            addCriterion("whereabouts is not null");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsEqualTo(Byte value) {
            addCriterion("whereabouts =", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsNotEqualTo(Byte value) {
            addCriterion("whereabouts <>", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsGreaterThan(Byte value) {
            addCriterion("whereabouts >", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsGreaterThanOrEqualTo(Byte value) {
            addCriterion("whereabouts >=", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsLessThan(Byte value) {
            addCriterion("whereabouts <", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsLessThanOrEqualTo(Byte value) {
            addCriterion("whereabouts <=", value, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsIn(List<Byte> values) {
            addCriterion("whereabouts in", values, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsNotIn(List<Byte> values) {
            addCriterion("whereabouts not in", values, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsBetween(Byte value1, Byte value2) {
            addCriterion("whereabouts between", value1, value2, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andWhereaboutsNotBetween(Byte value1, Byte value2) {
            addCriterion("whereabouts not between", value1, value2, "whereabouts");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdIsNull() {
            addCriterion("third_function_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdIsNotNull() {
            addCriterion("third_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdEqualTo(Integer value) {
            addCriterion("third_function_id =", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdNotEqualTo(Integer value) {
            addCriterion("third_function_id <>", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdGreaterThan(Integer value) {
            addCriterion("third_function_id >", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_function_id >=", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdLessThan(Integer value) {
            addCriterion("third_function_id <", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_function_id <=", value, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdIn(List<Integer> values) {
            addCriterion("third_function_id in", values, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdNotIn(List<Integer> values) {
            addCriterion("third_function_id not in", values, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("third_function_id between", value1, value2, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andThirdFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_function_id not between", value1, value2, "thirdFunctionId");
            return (Criteria) this;
        }

        public Criteria andIsAttachIsNull() {
            addCriterion("is_attach is null");
            return (Criteria) this;
        }

        public Criteria andIsAttachIsNotNull() {
            addCriterion("is_attach is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttachEqualTo(Byte value) {
            addCriterion("is_attach =", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachNotEqualTo(Byte value) {
            addCriterion("is_attach <>", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachGreaterThan(Byte value) {
            addCriterion("is_attach >", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_attach >=", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachLessThan(Byte value) {
            addCriterion("is_attach <", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachLessThanOrEqualTo(Byte value) {
            addCriterion("is_attach <=", value, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachIn(List<Byte> values) {
            addCriterion("is_attach in", values, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachNotIn(List<Byte> values) {
            addCriterion("is_attach not in", values, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachBetween(Byte value1, Byte value2) {
            addCriterion("is_attach between", value1, value2, "isAttach");
            return (Criteria) this;
        }

        public Criteria andIsAttachNotBetween(Byte value1, Byte value2) {
            addCriterion("is_attach not between", value1, value2, "isAttach");
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