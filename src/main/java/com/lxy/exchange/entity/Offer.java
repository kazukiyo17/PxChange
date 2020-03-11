package com.lxy.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Offer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_id
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_userid
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_usage
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oUsage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_title
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_type
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_typetext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oTypetext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_minprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private BigDecimal oMinprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_maxprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private BigDecimal oMaxprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_deadline
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oDeadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_colorpatten
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oColorpatten;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_colorpattentext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oColorpattentext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_width
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private BigDecimal oWidth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_height
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private BigDecimal oHeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_unit
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_format
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oFormat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_formattext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oFormattext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_feedback
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oFeedback;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_testdrw
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oTestdrw;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_publishstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oPublishstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_publishtime
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oPublishtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_endstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oEndstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_applynum
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private Integer oApplynum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_description
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column offer.o_img
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private String oImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table offer
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_id
     *
     * @return the value of offer.o_id
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_id
     *
     * @param oId the value for offer.o_id
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoId(String oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_userid
     *
     * @return the value of offer.o_userid
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoUserid() {
        return oUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_userid
     *
     * @param oUserid the value for offer.o_userid
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoUserid(String oUserid) {
        this.oUserid = oUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_usage
     *
     * @return the value of offer.o_usage
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoUsage() {
        return oUsage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_usage
     *
     * @param oUsage the value for offer.o_usage
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoUsage(Integer oUsage) {
        this.oUsage = oUsage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_title
     *
     * @return the value of offer.o_title
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoTitle() {
        return oTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_title
     *
     * @param oTitle the value for offer.o_title
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoTitle(String oTitle) {
        this.oTitle = oTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_type
     *
     * @return the value of offer.o_type
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoType() {
        return oType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_type
     *
     * @param oType the value for offer.o_type
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoType(Integer oType) {
        this.oType = oType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_typetext
     *
     * @return the value of offer.o_typetext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoTypetext() {
        return oTypetext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_typetext
     *
     * @param oTypetext the value for offer.o_typetext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoTypetext(String oTypetext) {
        this.oTypetext = oTypetext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_minprice
     *
     * @return the value of offer.o_minprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public BigDecimal getoMinprice() {
        return oMinprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_minprice
     *
     * @param oMinprice the value for offer.o_minprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoMinprice(BigDecimal oMinprice) {
        this.oMinprice = oMinprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_maxprice
     *
     * @return the value of offer.o_maxprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public BigDecimal getoMaxprice() {
        return oMaxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_maxprice
     *
     * @param oMaxprice the value for offer.o_maxprice
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoMaxprice(BigDecimal oMaxprice) {
        this.oMaxprice = oMaxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_deadline
     *
     * @return the value of offer.o_deadline
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoDeadline() {
        return oDeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_deadline
     *
     * @param oDeadline the value for offer.o_deadline
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoDeadline(String oDeadline) {
        this.oDeadline = oDeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_colorpatten
     *
     * @return the value of offer.o_colorpatten
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoColorpatten() {
        return oColorpatten;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_colorpatten
     *
     * @param oColorpatten the value for offer.o_colorpatten
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoColorpatten(String oColorpatten) {
        this.oColorpatten = oColorpatten;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_colorpattentext
     *
     * @return the value of offer.o_colorpattentext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoColorpattentext() {
        return oColorpattentext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_colorpattentext
     *
     * @param oColorpattentext the value for offer.o_colorpattentext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoColorpattentext(String oColorpattentext) {
        this.oColorpattentext = oColorpattentext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_width
     *
     * @return the value of offer.o_width
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public BigDecimal getoWidth() {
        return oWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_width
     *
     * @param oWidth the value for offer.o_width
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoWidth(BigDecimal oWidth) {
        this.oWidth = oWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_height
     *
     * @return the value of offer.o_height
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public BigDecimal getoHeight() {
        return oHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_height
     *
     * @param oHeight the value for offer.o_height
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoHeight(BigDecimal oHeight) {
        this.oHeight = oHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_unit
     *
     * @return the value of offer.o_unit
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoUnit() {
        return oUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_unit
     *
     * @param oUnit the value for offer.o_unit
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoUnit(Integer oUnit) {
        this.oUnit = oUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_format
     *
     * @return the value of offer.o_format
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoFormat() {
        return oFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_format
     *
     * @param oFormat the value for offer.o_format
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoFormat(String oFormat) {
        this.oFormat = oFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_formattext
     *
     * @return the value of offer.o_formattext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoFormattext() {
        return oFormattext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_formattext
     *
     * @param oFormattext the value for offer.o_formattext
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoFormattext(String oFormattext) {
        this.oFormattext = oFormattext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_feedback
     *
     * @return the value of offer.o_feedback
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoFeedback() {
        return oFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_feedback
     *
     * @param oFeedback the value for offer.o_feedback
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoFeedback(Integer oFeedback) {
        this.oFeedback = oFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_testdrw
     *
     * @return the value of offer.o_testdrw
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoTestdrw() {
        return oTestdrw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_testdrw
     *
     * @param oTestdrw the value for offer.o_testdrw
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoTestdrw(Integer oTestdrw) {
        this.oTestdrw = oTestdrw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_publishstate
     *
     * @return the value of offer.o_publishstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoPublishstate() {
        return oPublishstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_publishstate
     *
     * @param oPublishstate the value for offer.o_publishstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoPublishstate(Integer oPublishstate) {
        this.oPublishstate = oPublishstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_publishtime
     *
     * @return the value of offer.o_publishtime
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoPublishtime() {
        return oPublishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_publishtime
     *
     * @param oPublishtime the value for offer.o_publishtime
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoPublishtime(String oPublishtime) {
        this.oPublishtime = oPublishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_endstate
     *
     * @return the value of offer.o_endstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoEndstate() {
        return oEndstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_endstate
     *
     * @param oEndstate the value for offer.o_endstate
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoEndstate(Integer oEndstate) {
        this.oEndstate = oEndstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_applynum
     *
     * @return the value of offer.o_applynum
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public Integer getoApplynum() {
        return oApplynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_applynum
     *
     * @param oApplynum the value for offer.o_applynum
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoApplynum(Integer oApplynum) {
        this.oApplynum = oApplynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_description
     *
     * @return the value of offer.o_description
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoDescription() {
        return oDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_description
     *
     * @param oDescription the value for offer.o_description
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoDescription(String oDescription) {
        this.oDescription = oDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column offer.o_img
     *
     * @return the value of offer.o_img
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public String getoImg() {
        return oImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column offer.o_img
     *
     * @param oImg the value for offer.o_img
     *
     * @mbg.generated Sat Feb 22 22:22:46 CST 2020
     */
    public void setoImg(String oImg) {
        this.oImg = oImg;
    }
}