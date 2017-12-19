package cn.jeefast.modules.platform.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author theodo
 * @since 2017-12-18
 */
@TableName("pf_notice")
public class PfNotice extends Model<PfNotice> {

    private static final long serialVersionUID = 1L;

    /**
     * 序列
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 标题
     */
	private String title;
    /**
     * 类型
     */
	private Integer type;
    /**
     * 内容
     */
	private String content;
    /**
     * 发布时间
     */
	@TableField("publish_time")
	private Date publishTime;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 创建人
     */
	private Long creater;
    /**
     * 图片
     */
	private Integer pic;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreater() {
		return creater;
	}

	public void setCreater(Long creater) {
		this.creater = creater;
	}

	public Integer getPic() {
		return pic;
	}

	public void setPic(Integer pic) {
		this.pic = pic;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "PfNotice{" +
			", id=" + id +
			", title=" + title +
			", type=" + type +
			", content=" + content +
			", publishTime=" + publishTime +
			", createTime=" + createTime +
			", creater=" + creater +
			", pic=" + pic +
			"}";
	}
}
