package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.List;

public class MsSquareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsSquareExample() {
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

        public Criteria andUpLeftLatIsNull() {
            addCriterion("up_left_lat is null");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatIsNotNull() {
            addCriterion("up_left_lat is not null");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatEqualTo(String value) {
            addCriterion("up_left_lat =", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatNotEqualTo(String value) {
            addCriterion("up_left_lat <>", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatGreaterThan(String value) {
            addCriterion("up_left_lat >", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatGreaterThanOrEqualTo(String value) {
            addCriterion("up_left_lat >=", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatLessThan(String value) {
            addCriterion("up_left_lat <", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatLessThanOrEqualTo(String value) {
            addCriterion("up_left_lat <=", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatLike(String value) {
            addCriterion("up_left_lat like", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatNotLike(String value) {
            addCriterion("up_left_lat not like", value, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatIn(List<String> values) {
            addCriterion("up_left_lat in", values, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatNotIn(List<String> values) {
            addCriterion("up_left_lat not in", values, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatBetween(String value1, String value2) {
            addCriterion("up_left_lat between", value1, value2, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLatNotBetween(String value1, String value2) {
            addCriterion("up_left_lat not between", value1, value2, "upLeftLat");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngIsNull() {
            addCriterion("up_left_lng is null");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngIsNotNull() {
            addCriterion("up_left_lng is not null");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngEqualTo(String value) {
            addCriterion("up_left_lng =", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngNotEqualTo(String value) {
            addCriterion("up_left_lng <>", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngGreaterThan(String value) {
            addCriterion("up_left_lng >", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngGreaterThanOrEqualTo(String value) {
            addCriterion("up_left_lng >=", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngLessThan(String value) {
            addCriterion("up_left_lng <", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngLessThanOrEqualTo(String value) {
            addCriterion("up_left_lng <=", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngLike(String value) {
            addCriterion("up_left_lng like", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngNotLike(String value) {
            addCriterion("up_left_lng not like", value, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngIn(List<String> values) {
            addCriterion("up_left_lng in", values, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngNotIn(List<String> values) {
            addCriterion("up_left_lng not in", values, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngBetween(String value1, String value2) {
            addCriterion("up_left_lng between", value1, value2, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpLeftLngNotBetween(String value1, String value2) {
            addCriterion("up_left_lng not between", value1, value2, "upLeftLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLatIsNull() {
            addCriterion("up_right_lat is null");
            return (Criteria) this;
        }

        public Criteria andUpRightLatIsNotNull() {
            addCriterion("up_right_lat is not null");
            return (Criteria) this;
        }

        public Criteria andUpRightLatEqualTo(String value) {
            addCriterion("up_right_lat =", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatNotEqualTo(String value) {
            addCriterion("up_right_lat <>", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatGreaterThan(String value) {
            addCriterion("up_right_lat >", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatGreaterThanOrEqualTo(String value) {
            addCriterion("up_right_lat >=", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatLessThan(String value) {
            addCriterion("up_right_lat <", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatLessThanOrEqualTo(String value) {
            addCriterion("up_right_lat <=", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatLike(String value) {
            addCriterion("up_right_lat like", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatNotLike(String value) {
            addCriterion("up_right_lat not like", value, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatIn(List<String> values) {
            addCriterion("up_right_lat in", values, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatNotIn(List<String> values) {
            addCriterion("up_right_lat not in", values, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatBetween(String value1, String value2) {
            addCriterion("up_right_lat between", value1, value2, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLatNotBetween(String value1, String value2) {
            addCriterion("up_right_lat not between", value1, value2, "upRightLat");
            return (Criteria) this;
        }

        public Criteria andUpRightLngIsNull() {
            addCriterion("up_right_lng is null");
            return (Criteria) this;
        }

        public Criteria andUpRightLngIsNotNull() {
            addCriterion("up_right_lng is not null");
            return (Criteria) this;
        }

        public Criteria andUpRightLngEqualTo(String value) {
            addCriterion("up_right_lng =", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngNotEqualTo(String value) {
            addCriterion("up_right_lng <>", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngGreaterThan(String value) {
            addCriterion("up_right_lng >", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngGreaterThanOrEqualTo(String value) {
            addCriterion("up_right_lng >=", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngLessThan(String value) {
            addCriterion("up_right_lng <", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngLessThanOrEqualTo(String value) {
            addCriterion("up_right_lng <=", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngLike(String value) {
            addCriterion("up_right_lng like", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngNotLike(String value) {
            addCriterion("up_right_lng not like", value, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngIn(List<String> values) {
            addCriterion("up_right_lng in", values, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngNotIn(List<String> values) {
            addCriterion("up_right_lng not in", values, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngBetween(String value1, String value2) {
            addCriterion("up_right_lng between", value1, value2, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andUpRightLngNotBetween(String value1, String value2) {
            addCriterion("up_right_lng not between", value1, value2, "upRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatIsNull() {
            addCriterion("below_left_lat is null");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatIsNotNull() {
            addCriterion("below_left_lat is not null");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatEqualTo(String value) {
            addCriterion("below_left_lat =", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatNotEqualTo(String value) {
            addCriterion("below_left_lat <>", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatGreaterThan(String value) {
            addCriterion("below_left_lat >", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatGreaterThanOrEqualTo(String value) {
            addCriterion("below_left_lat >=", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatLessThan(String value) {
            addCriterion("below_left_lat <", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatLessThanOrEqualTo(String value) {
            addCriterion("below_left_lat <=", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatLike(String value) {
            addCriterion("below_left_lat like", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatNotLike(String value) {
            addCriterion("below_left_lat not like", value, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatIn(List<String> values) {
            addCriterion("below_left_lat in", values, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatNotIn(List<String> values) {
            addCriterion("below_left_lat not in", values, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatBetween(String value1, String value2) {
            addCriterion("below_left_lat between", value1, value2, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLatNotBetween(String value1, String value2) {
            addCriterion("below_left_lat not between", value1, value2, "belowLeftLat");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngIsNull() {
            addCriterion("below_left_lng is null");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngIsNotNull() {
            addCriterion("below_left_lng is not null");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngEqualTo(String value) {
            addCriterion("below_left_lng =", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngNotEqualTo(String value) {
            addCriterion("below_left_lng <>", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngGreaterThan(String value) {
            addCriterion("below_left_lng >", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngGreaterThanOrEqualTo(String value) {
            addCriterion("below_left_lng >=", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngLessThan(String value) {
            addCriterion("below_left_lng <", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngLessThanOrEqualTo(String value) {
            addCriterion("below_left_lng <=", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngLike(String value) {
            addCriterion("below_left_lng like", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngNotLike(String value) {
            addCriterion("below_left_lng not like", value, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngIn(List<String> values) {
            addCriterion("below_left_lng in", values, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngNotIn(List<String> values) {
            addCriterion("below_left_lng not in", values, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngBetween(String value1, String value2) {
            addCriterion("below_left_lng between", value1, value2, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowLeftLngNotBetween(String value1, String value2) {
            addCriterion("below_left_lng not between", value1, value2, "belowLeftLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatIsNull() {
            addCriterion("below_right_lat is null");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatIsNotNull() {
            addCriterion("below_right_lat is not null");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatEqualTo(String value) {
            addCriterion("below_right_lat =", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatNotEqualTo(String value) {
            addCriterion("below_right_lat <>", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatGreaterThan(String value) {
            addCriterion("below_right_lat >", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatGreaterThanOrEqualTo(String value) {
            addCriterion("below_right_lat >=", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatLessThan(String value) {
            addCriterion("below_right_lat <", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatLessThanOrEqualTo(String value) {
            addCriterion("below_right_lat <=", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatLike(String value) {
            addCriterion("below_right_lat like", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatNotLike(String value) {
            addCriterion("below_right_lat not like", value, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatIn(List<String> values) {
            addCriterion("below_right_lat in", values, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatNotIn(List<String> values) {
            addCriterion("below_right_lat not in", values, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatBetween(String value1, String value2) {
            addCriterion("below_right_lat between", value1, value2, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLatNotBetween(String value1, String value2) {
            addCriterion("below_right_lat not between", value1, value2, "belowRightLat");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngIsNull() {
            addCriterion("below_right_lng is null");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngIsNotNull() {
            addCriterion("below_right_lng is not null");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngEqualTo(String value) {
            addCriterion("below_right_lng =", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngNotEqualTo(String value) {
            addCriterion("below_right_lng <>", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngGreaterThan(String value) {
            addCriterion("below_right_lng >", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngGreaterThanOrEqualTo(String value) {
            addCriterion("below_right_lng >=", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngLessThan(String value) {
            addCriterion("below_right_lng <", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngLessThanOrEqualTo(String value) {
            addCriterion("below_right_lng <=", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngLike(String value) {
            addCriterion("below_right_lng like", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngNotLike(String value) {
            addCriterion("below_right_lng not like", value, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngIn(List<String> values) {
            addCriterion("below_right_lng in", values, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngNotIn(List<String> values) {
            addCriterion("below_right_lng not in", values, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngBetween(String value1, String value2) {
            addCriterion("below_right_lng between", value1, value2, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andBelowRightLngNotBetween(String value1, String value2) {
            addCriterion("below_right_lng not between", value1, value2, "belowRightLng");
            return (Criteria) this;
        }

        public Criteria andSquareStatusIsNull() {
            addCriterion("square_status is null");
            return (Criteria) this;
        }

        public Criteria andSquareStatusIsNotNull() {
            addCriterion("square_status is not null");
            return (Criteria) this;
        }

        public Criteria andSquareStatusEqualTo(Byte value) {
            addCriterion("square_status =", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusNotEqualTo(Byte value) {
            addCriterion("square_status <>", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusGreaterThan(Byte value) {
            addCriterion("square_status >", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("square_status >=", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusLessThan(Byte value) {
            addCriterion("square_status <", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusLessThanOrEqualTo(Byte value) {
            addCriterion("square_status <=", value, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusIn(List<Byte> values) {
            addCriterion("square_status in", values, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusNotIn(List<Byte> values) {
            addCriterion("square_status not in", values, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusBetween(Byte value1, Byte value2) {
            addCriterion("square_status between", value1, value2, "squareStatus");
            return (Criteria) this;
        }

        public Criteria andSquareStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("square_status not between", value1, value2, "squareStatus");
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