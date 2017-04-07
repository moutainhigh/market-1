package cn.gdeng.market.entity.lease.contract;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "contract_leasingresource")
public class ContractLeasingresourceEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8603720309091545670L;

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

     *资源名称
     */
    private String leasingResource;

     *租赁资源ID
     */
    private Integer leasingResourceId;

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
    @Column(name = "leasingResource")
    public String getLeasingResource(){

    }
    public void setLeasingResource(String leasingResource){

    }
    @Column(name = "leasingResourceId")
    public Integer getLeasingResourceId(){

    }
    public void setLeasingResourceId(Integer leasingResourceId){

    }
}