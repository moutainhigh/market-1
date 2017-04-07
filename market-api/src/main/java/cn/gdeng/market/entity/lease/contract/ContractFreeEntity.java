package cn.gdeng.market.entity.lease.contract;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 免租约定
 * @author Administrator
 *
 */
@Entity(name = "contract_free")
public class ContractFreeEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6428987222146797191L;

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

     *免租月数
     */
    private Byte freeMonths;

     *免租天数
     */
    private Byte freeDays;

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
    @Column(name = "freeMonths")
    public Byte getFreeMonths(){

    }
    public void setFreeMonths(Byte freeMonths){

    }
    @Column(name = "freeDays")
    public Byte getFreeDays(){

    }
    public void setFreeDays(Byte freeDays){

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