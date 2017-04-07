package cn.gdeng.market.entity.lease.settings;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "market_image_setting")
public class MarketImageSettingEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -963122678661357583L;

	/**
     *id
     */
    private Integer id;

     *市场id
     */
    private Integer marketId;

     *区域id
     */
    private Integer areaId;

     *楼栋id
     */
    private Integer buildingId;

     *单元id
     */
    private Integer unitId;

     *楼层id
     */
    private Integer floorId;

     *资源id
     */
    private Integer resourceId;

     *图片类型  1 市场  2  区域   3  楼层
     */
    private Integer imageType;

     *坐标
     */
    private String coordinate;

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
    @Column(name = "marketId")
    public Integer getMarketId(){

    }
    public void setMarketId(Integer marketId){

    }
    @Column(name = "areaId")
    public Integer getAreaId(){

    }
    public void setAreaId(Integer areaId){

    }
    @Column(name = "buildingId")
    public Integer getBuildingId(){

    }
    public void setBuildingId(Integer buildingId){

    }
    @Column(name = "unitId")
    public Integer getUnitId(){

    }
    public void setUnitId(Integer unitId){

    }
    @Column(name = "floorId")
    public Integer getFloorId(){

    }
    public void setFloorId(Integer floorId){

    }
    @Column(name = "resourceId")
    public Integer getResourceId(){

    }
    public void setResourceId(Integer resourceId){

    }
    @Column(name = "imageType")
    public Integer getImageType(){

    }
    public void setImageType(Integer imageType){

    }
    @Column(name = "coordinate")
    public String getCoordinate(){

    }
    public void setCoordinate(String coordinate){

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