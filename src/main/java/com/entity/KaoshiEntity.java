package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 考试
 *
 * @author 
 * @email
 */
@TableName("kaoshi")
public class KaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoshiEntity() {

	}

	public KaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 考试名称
     */
    @TableField(value = "kaoshi_name")

    private String kaoshiName;


    /**
     * 考试时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaoshi_time")

    private Date kaoshiTime;


    /**
     * 考试介绍
     */
    @TableField(value = "kaoshi_content")

    private String kaoshiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：考试名称
	 */
    public String getKaoshiName() {
        return kaoshiName;
    }


    /**
	 * 获取：考试名称
	 */

    public void setKaoshiName(String kaoshiName) {
        this.kaoshiName = kaoshiName;
    }
    /**
	 * 设置：考试时间
	 */
    public Date getKaoshiTime() {
        return kaoshiTime;
    }


    /**
	 * 获取：考试时间
	 */

    public void setKaoshiTime(Date kaoshiTime) {
        this.kaoshiTime = kaoshiTime;
    }
    /**
	 * 设置：考试介绍
	 */
    public String getKaoshiContent() {
        return kaoshiContent;
    }


    /**
	 * 获取：考试介绍
	 */

    public void setKaoshiContent(String kaoshiContent) {
        this.kaoshiContent = kaoshiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kaoshi{" +
            "id=" + id +
            ", kaoshiName=" + kaoshiName +
            ", kaoshiTime=" + kaoshiTime +
            ", kaoshiContent=" + kaoshiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
