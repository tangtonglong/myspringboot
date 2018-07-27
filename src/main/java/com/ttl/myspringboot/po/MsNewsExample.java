package com.ttl.myspringboot.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsNewsExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
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

        public Criteria andNavTypeIsNull() {
            addCriterion("nav_type is null");
            return (Criteria) this;
        }

        public Criteria andNavTypeIsNotNull() {
            addCriterion("nav_type is not null");
            return (Criteria) this;
        }

        public Criteria andNavTypeEqualTo(Byte value) {
            addCriterion("nav_type =", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeNotEqualTo(Byte value) {
            addCriterion("nav_type <>", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeGreaterThan(Byte value) {
            addCriterion("nav_type >", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("nav_type >=", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeLessThan(Byte value) {
            addCriterion("nav_type <", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeLessThanOrEqualTo(Byte value) {
            addCriterion("nav_type <=", value, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeIn(List<Byte> values) {
            addCriterion("nav_type in", values, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeNotIn(List<Byte> values) {
            addCriterion("nav_type not in", values, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeBetween(Byte value1, Byte value2) {
            addCriterion("nav_type between", value1, value2, "navType");
            return (Criteria) this;
        }

        public Criteria andNavTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("nav_type not between", value1, value2, "navType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNull() {
            addCriterion("second_type is null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNotNull() {
            addCriterion("second_type is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeEqualTo(Byte value) {
            addCriterion("second_type =", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotEqualTo(Byte value) {
            addCriterion("second_type <>", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThan(Byte value) {
            addCriterion("second_type >", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("second_type >=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThan(Byte value) {
            addCriterion("second_type <", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThanOrEqualTo(Byte value) {
            addCriterion("second_type <=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIn(List<Byte> values) {
            addCriterion("second_type in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotIn(List<Byte> values) {
            addCriterion("second_type not in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeBetween(Byte value1, Byte value2) {
            addCriterion("second_type between", value1, value2, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("second_type not between", value1, value2, "secondType");
            return (Criteria) this;
        }

        public Criteria andIsImgIsNull() {
            addCriterion("is_img is null");
            return (Criteria) this;
        }

        public Criteria andIsImgIsNotNull() {
            addCriterion("is_img is not null");
            return (Criteria) this;
        }

        public Criteria andIsImgEqualTo(Byte value) {
            addCriterion("is_img =", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgNotEqualTo(Byte value) {
            addCriterion("is_img <>", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgGreaterThan(Byte value) {
            addCriterion("is_img >", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_img >=", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgLessThan(Byte value) {
            addCriterion("is_img <", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgLessThanOrEqualTo(Byte value) {
            addCriterion("is_img <=", value, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgIn(List<Byte> values) {
            addCriterion("is_img in", values, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgNotIn(List<Byte> values) {
            addCriterion("is_img not in", values, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgBetween(Byte value1, Byte value2) {
            addCriterion("is_img between", value1, value2, "isImg");
            return (Criteria) this;
        }

        public Criteria andIsImgNotBetween(Byte value1, Byte value2) {
            addCriterion("is_img not between", value1, value2, "isImg");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNull() {
            addCriterion("vocation_id is null");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNotNull() {
            addCriterion("vocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andVocationIdEqualTo(Integer value) {
            addCriterion("vocation_id =", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotEqualTo(Integer value) {
            addCriterion("vocation_id <>", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThan(Integer value) {
            addCriterion("vocation_id >", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vocation_id >=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThan(Integer value) {
            addCriterion("vocation_id <", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("vocation_id <=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIn(List<Integer> values) {
            addCriterion("vocation_id in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotIn(List<Integer> values) {
            addCriterion("vocation_id not in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdBetween(Integer value1, Integer value2) {
            addCriterion("vocation_id between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vocation_id not between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andNewFromIsNull() {
            addCriterion("new_from is null");
            return (Criteria) this;
        }

        public Criteria andNewFromIsNotNull() {
            addCriterion("new_from is not null");
            return (Criteria) this;
        }

        public Criteria andNewFromEqualTo(String value) {
            addCriterion("new_from =", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotEqualTo(String value) {
            addCriterion("new_from <>", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromGreaterThan(String value) {
            addCriterion("new_from >", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromGreaterThanOrEqualTo(String value) {
            addCriterion("new_from >=", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLessThan(String value) {
            addCriterion("new_from <", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLessThanOrEqualTo(String value) {
            addCriterion("new_from <=", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromLike(String value) {
            addCriterion("new_from like", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotLike(String value) {
            addCriterion("new_from not like", value, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromIn(List<String> values) {
            addCriterion("new_from in", values, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotIn(List<String> values) {
            addCriterion("new_from not in", values, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromBetween(String value1, String value2) {
            addCriterion("new_from between", value1, value2, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewFromNotBetween(String value1, String value2) {
            addCriterion("new_from not between", value1, value2, "newFrom");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("news_url is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("news_url is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("news_url =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("news_url <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("news_url >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("news_url >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("news_url <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("news_url <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("news_url like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("news_url not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("news_url in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("news_url not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("news_url between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("news_url not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andIsCollectIsNull() {
            addCriterion("is_collect is null");
            return (Criteria) this;
        }

        public Criteria andIsCollectIsNotNull() {
            addCriterion("is_collect is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollectEqualTo(Byte value) {
            addCriterion("is_collect =", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectNotEqualTo(Byte value) {
            addCriterion("is_collect <>", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectGreaterThan(Byte value) {
            addCriterion("is_collect >", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_collect >=", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectLessThan(Byte value) {
            addCriterion("is_collect <", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectLessThanOrEqualTo(Byte value) {
            addCriterion("is_collect <=", value, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectIn(List<Byte> values) {
            addCriterion("is_collect in", values, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectNotIn(List<Byte> values) {
            addCriterion("is_collect not in", values, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectBetween(Byte value1, Byte value2) {
            addCriterion("is_collect between", value1, value2, "isCollect");
            return (Criteria) this;
        }

        public Criteria andIsCollectNotBetween(Byte value1, Byte value2) {
            addCriterion("is_collect not between", value1, value2, "isCollect");
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