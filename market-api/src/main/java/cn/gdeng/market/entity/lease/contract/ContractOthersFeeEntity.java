package cn.gdeng.market.entity.lease.contract;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 其它费项
 * @author Administrator
 *
 */
@Entity(name = "contract_others_fee")
public class ContractOthersFeeEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1951755979748488607L;

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

     *租赁资源
     */
    private String leasingResource;

     *费项类别
     */
    private String itemCategory;

     *费项类别ID
     */
    private Integer itemCategoryId;

     *费项名称
     */
    private String itemName;

     *费项类别ID
     */
    private Integer itemNameId;

     *计费标准
     */
    private String freightBasis;

     *计费标准ID
     */
    private Integer freightBasisId;

     *收租模式  1 指定金额  2 手工录入  3 建筑面积  4  套内面积  5 可出租面积
     */
    private Integer rentMode;

     *计费单价(计费标准表)
     */
    private Double chargeUnitPrice;

     *计费单位(计费标准表)  1 元/日  2 元/月  3 元/季  4  元/半年  5 元/年
     */
    private Integer chargeUnit;

     *总价
     */
    private String total;

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
    @Column(name = "itemCategory")
    public String getItemCategory(){

    }
    public void setItemCategory(String itemCategory){

    }
    @Column(name = "itemCategoryId")
    public Integer getItemCategoryId(){

    }
    public void setItemCategoryId(Integer itemCategoryId){

    }
    @Column(name = "itemName")
    public String getItemName(){

    }
    public void setItemName(String itemName){

    }
    @Column(name = "itemNameId")
    public Integer getItemNameId(){

    }
    public void setItemNameId(Integer itemNameId){

    }
    @Column(name = "freightBasis")
    public String getFreightBasis(){

    }
    public void setFreightBasis(String freightBasis){

    }
    @Column(name = "freightBasisId")
    public Integer getFreightBasisId(){

    }
    public void setFreightBasisId(Integer freightBasisId){

    }
    @Column(name = "rentMode")
    public Integer getRentMode(){

    }
    public void setRentMode(Integer rentMode){

    }
    @Column(name = "chargeUnitPrice")
    public Double getChargeUnitPrice(){

    }
    public void setChargeUnitPrice(Double chargeUnitPrice){

    }
    @Column(name = "chargeUnit")
    public Integer getChargeUnit(){

    }
    public void setChargeUnit(Integer chargeUnit){

    }
    @Column(name = "total")
    public String getTotal(){

    }
    public void setTotal(String total){

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