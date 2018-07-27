package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsApplyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsApplyRecordExample() {
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

        public Criteria andRecipientUserIdIsNull() {
            addCriterion("recipient_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdIsNotNull() {
            addCriterion("recipient_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdEqualTo(Integer value) {
            addCriterion("recipient_user_id =", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotEqualTo(Integer value) {
            addCriterion("recipient_user_id <>", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdGreaterThan(Integer value) {
            addCriterion("recipient_user_id >", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipient_user_id >=", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdLessThan(Integer value) {
            addCriterion("recipient_user_id <", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("recipient_user_id <=", value, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdIn(List<Integer> values) {
            addCriterion("recipient_user_id in", values, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotIn(List<Integer> values) {
            addCriterion("recipient_user_id not in", values, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdBetween(Integer value1, Integer value2) {
            addCriterion("recipient_user_id between", value1, value2, "recipientUserId");
            return (Criteria) this;
        }

        public Criteria andRecipientUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recipient_user_id not between", value1, value2, "recipientUserId");
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

        public Criteria andApplyDescIsNull() {
            addCriterion("apply_desc is null");
            return (Criteria) this;
        }

        public Criteria andApplyDescIsNotNull() {
            addCriterion("apply_desc is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDescEqualTo(String value) {
            addCriterion("apply_desc =", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotEqualTo(String value) {
            addCriterion("apply_desc <>", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescGreaterThan(String value) {
            addCriterion("apply_desc >", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("apply_desc >=", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLessThan(String value) {
            addCriterion("apply_desc <", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLessThanOrEqualTo(String value) {
            addCriterion("apply_desc <=", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescLike(String value) {
            addCriterion("apply_desc like", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotLike(String value) {
            addCriterion("apply_desc not like", value, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescIn(List<String> values) {
            addCriterion("apply_desc in", values, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotIn(List<String> values) {
            addCriterion("apply_desc not in", values, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescBetween(String value1, String value2) {
            addCriterion("apply_desc between", value1, value2, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyDescNotBetween(String value1, String value2) {
            addCriterion("apply_desc not between", value1, value2, "applyDesc");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Byte value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Byte value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Byte value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Byte value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Byte> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Byte> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Byte value1, Byte value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalDescIsNull() {
            addCriterion("approval_desc is null");
            return (Criteria) this;
        }

        public Criteria andApprovalDescIsNotNull() {
            addCriterion("approval_desc is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalDescEqualTo(String value) {
            addCriterion("approval_desc =", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescNotEqualTo(String value) {
            addCriterion("approval_desc <>", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescGreaterThan(String value) {
            addCriterion("approval_desc >", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescGreaterThanOrEqualTo(String value) {
            addCriterion("approval_desc >=", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescLessThan(String value) {
            addCriterion("approval_desc <", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescLessThanOrEqualTo(String value) {
            addCriterion("approval_desc <=", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescLike(String value) {
            addCriterion("approval_desc like", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescNotLike(String value) {
            addCriterion("approval_desc not like", value, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescIn(List<String> values) {
            addCriterion("approval_desc in", values, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescNotIn(List<String> values) {
            addCriterion("approval_desc not in", values, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescBetween(String value1, String value2) {
            addCriterion("approval_desc between", value1, value2, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalDescNotBetween(String value1, String value2) {
            addCriterion("approval_desc not between", value1, value2, "approvalDesc");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("approval_time not between", value1, value2, "approvalTime");
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