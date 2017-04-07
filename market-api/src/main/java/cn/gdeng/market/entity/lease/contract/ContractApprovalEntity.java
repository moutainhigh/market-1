package cn.gdeng.market.entity.lease.contract;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "contract_approval")
public class ContractApprovalEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1996289296840786582L;

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

     *审核类型 0 合同初次审核 1 合同变更审核 2合同结算审核
     */
    private Byte approvalType;

     *经办人
     */
    private String trustees;

     *审核时间
     */
    private Date reviewedTime;

     *审核意见
     */
    private String info;

     *审核结果 0 通过 1 驳回
     */
    private Byte approvalStatus;

     *审批方式 1 工作流审批 2 线下审批
     */
    private Byte approvalMethod;

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
    @Column(name = "approvalType")
    public Byte getApprovalType(){

    }
    public void setApprovalType(Byte approvalType){

    }
    @Column(name = "trustees")
    public String getTrustees(){

    }
    public void setTrustees(String trustees){

    }
    @Column(name = "reviewedTime")
    public Date getReviewedTime(){

    }
    public void setReviewedTime(Date reviewedTime){

    }
    @Column(name = "info")
    public String getInfo(){

    }
    public void setInfo(String info){

    }
    @Column(name = "approvalStatus")
    public Byte getApprovalStatus(){

    }
    public void setApprovalStatus(Byte approvalStatus){

    }
    @Column(name = "approvalMethod")
    public Byte getApprovalMethod(){

    }
    public void setApprovalMethod(Byte approvalMethod){

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