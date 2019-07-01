package com.ssm_top1.pojo;

import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public GradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
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

        public Criteria andGradeidIsNull() {
            addCriterion("gradeID is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("gradeID is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("gradeID =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("gradeID <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("gradeID >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradeID >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("gradeID <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("gradeID <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("gradeID in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("gradeID not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("gradeID between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gradeID not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNull() {
            addCriterion("gradeName is null");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNotNull() {
            addCriterion("gradeName is not null");
            return (Criteria) this;
        }

        public Criteria andGradenameEqualTo(String value) {
            addCriterion("gradeName =", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotEqualTo(String value) {
            addCriterion("gradeName <>", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThan(String value) {
            addCriterion("gradeName >", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThanOrEqualTo(String value) {
            addCriterion("gradeName >=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThan(String value) {
            addCriterion("gradeName <", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThanOrEqualTo(String value) {
            addCriterion("gradeName <=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLike(String value) {
            addCriterion("gradeName like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotLike(String value) {
            addCriterion("gradeName not like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameIn(List<String> values) {
            addCriterion("gradeName in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotIn(List<String> values) {
            addCriterion("gradeName not in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameBetween(String value1, String value2) {
            addCriterion("gradeName between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotBetween(String value1, String value2) {
            addCriterion("gradeName not between", value1, value2, "gradename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 01 22:14:23 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated Mon Jul 01 22:14:23 CST 2019
     */
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