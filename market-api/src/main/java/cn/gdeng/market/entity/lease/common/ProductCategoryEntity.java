package cn.gdeng.market.entity.lease.common;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product_category")
public class ProductCategoryEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *主键
     */
    private Long categoryId;

     *市场id
     */
    private Long marketId;

     *当前层次(1;2)
     */
    private Byte curLevel;

     *分类名称
     */
    private String cateName;

     *创建人员ID
     */
    private String createUserId;

     *创建时间
     */
    private Date createTime;

     *修改人员ID
     */
    private String updateUserId;

     *修改时间
     */
    private Date updateTime;

     *上层分类id
     */
    private Long parentId;

     *顺序
     */
    private Integer orderNum;

     *'状态(0.已删除;1未删除)',
     */
    private String status;

     *产品图片
     */
    private String typeIcon;

     *web图片
     */
    private String webTypeIcon;

     *
     */
    private Short lefts;

     *
     */
    private Short rights;

    @Column(name = "categoryId")
    public Long getCategoryId(){

    }
    public void setCategoryId(Long categoryId){

    }
    @Column(name = "marketId")
    public Long getMarketId(){

    }
    public void setMarketId(Long marketId){

    }
    @Column(name = "curLevel")
    public Byte getCurLevel(){

    }
    public void setCurLevel(Byte curLevel){

    }
    @Column(name = "cateName")
    public String getCateName(){

    }
    public void setCateName(String cateName){

    }
    @Column(name = "createUserId")
    public String getCreateUserId(){

    }
    public void setCreateUserId(String createUserId){

    }
    @Column(name = "createTime")
    public Date getCreateTime(){

    }
    public void setCreateTime(Date createTime){

    }
    @Column(name = "updateUserId")
    public String getUpdateUserId(){

    }
    public void setUpdateUserId(String updateUserId){

    }
    @Column(name = "updateTime")
    public Date getUpdateTime(){

    }
    public void setUpdateTime(Date updateTime){

    }
    @Column(name = "parentId")
    public Long getParentId(){

    }
    public void setParentId(Long parentId){

    }
    @Column(name = "orderNum")
    public Integer getOrderNum(){

    }
    public void setOrderNum(Integer orderNum){

    }
    @Column(name = "status")
    public String getStatus(){

    }
    public void setStatus(String status){

    }
    @Column(name = "typeIcon")
    public String getTypeIcon(){

    }
    public void setTypeIcon(String typeIcon){

    }
    @Column(name = "webTypeIcon")
    public String getWebTypeIcon(){

    }
    public void setWebTypeIcon(String webTypeIcon){

    }
    @Column(name = "lefts")
    public Short getLefts(){

    }
    public void setLefts(Short lefts){

    }
    @Column(name = "rights")
    public Short getRights(){

    }
    public void setRights(Short rights){

    }
}