package cn.gdeng.market.entity.lease.contract;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 租赁周期 约定信息
 * @author Administrator
 *
 */
@Entity(name = "contract_lease")
public class ContractLeaseEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4076601095113077597L;

	/**
     *主键id
     */
    private Integer id;

     *合同ID
     */
    private Integer contractId;

     *合同编号
     */
    private String contractNo;

     *起始日期
     */
    private Date startDay;

     *截止日期
     */
    private Date endDay;

     *计费单位 0 元/月/平 1 元/季/平 2 元/半年/平 3 元/年/平
     */
    private Byte billingUnit;

     *计费面积
     */
    private Double billingArea;

     *租金单价
     */
    private Double unitPrice;

     *租金
     */
    private Double rental;

     *是否删除(0:未删除;1:已删除)
     */
    private Byte isDeleted;

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
    /**
     *起始日期 json 转换代替
     */
    private String startDayStr;
    /**
     *截止日期json 转换代替
     */
    private String endDayStr;
	public String getStartDayStr() {
		return startDayStr;
	}
	public void setStartDayStr(String startDayStr) {
		this.startDayStr = startDayStr;
	}
	public String getEndDayStr() {
		return endDayStr;
	}
	public void setEndDayStr(String endDayStr) {
		this.endDayStr = endDayStr;
	}
    @Column(name = "id")
    public Integer getId(){

    }
    public void setId(Integer id){

    }
    @Column(name = "contractId")
    public Integer getContractId(){

    }
    public void setContractId(Integer contractId){

    }
    @Column(name = "contractNo")
    public String getContractNo(){

    }
    public void setContractNo(String contractNo){

    }
    @Column(name = "startDay")
    public Date getStartDay(){

    }
    public void setStartDay(Date startDay){

    }
    @Column(name = "endDay")
    public Date getEndDay(){

    }
    public void setEndDay(Date endDay){

    }
    @Column(name = "billingUnit")
    public Byte getBillingUnit(){

    }
    public void setBillingUnit(Byte billingUnit){

    }
    @Column(name = "billingArea")
    public Double getBillingArea(){

    }
    public void setBillingArea(Double billingArea){

    }
    @Column(name = "unitPrice")
    public Double getUnitPrice(){

    }
    public void setUnitPrice(Double unitPrice){

    }
    @Column(name = "rental")
    public Double getRental(){

    }
    public void setRental(Double rental){

    }
    @Column(name = "isDeleted")
    public Byte getIsDeleted(){

    }
    public void setIsDeleted(Byte isDeleted){

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
}