package net.easyunion.biz.fpfs;

import java.util.List;
import java.util.Map;

import net.easyunion.biz.fpfs.vo.BsxxVo;
import net.easyunion.biz.fpfs.vo.GpResultVo;
import net.easyunion.biz.fpfs.vo.GpxxVo;
import net.easyunion.biz.fpfs.vo.NsrxxVo;
import net.easyunion.biz.fpfs.vo.SaveGpxxVo;
import net.easyunion.biz.fpfs.vo.TpResultVo;
import net.easyunion.biz.fpfs.vo.TpxxVo;
import net.easyunion.biz.fpfs.vo.YjResultVo;
import net.easyunion.biz.fpfs.vo.YjxxVo;

public interface IFpfsServie {
	
	/**
	 * 根据购票人身份证号码获取纳税人信息
	 * @param sfzhm
	 * @return
	 */
	public List<NsrxxVo> getNsrxxByID(String sfzhm);

	/**
	 * 根据纳税人识别号、发票种类代码获取购票信息
	 * @param nsrsbh
	 * @param fpzlDm
	 * @return
	 */
	public List<GpxxVo> getNsrGpxx(String nsrsbh, String fpzlDm, String fpkfDm, String lrrDm, String swjgDm, String djxh, String fpdm);
	
	/**
	 * 保存购票信息
	 * @param saveGpxxVo
	 * @return
	 */
	public GpResultVo saveGpxx(SaveGpxxVo saveGpxxVo);
	
	/**
	 * 退票
	 * @param tpxxVo
	 * @return
	 */
	public TpResultVo saveTpxx(TpxxVo tpxxVo);
	
	/**
	 * 验旧
	 * @param yjxxVo
	 * @return
	 */
	public YjResultVo saveYjxx(BsxxVo yjxxVo);
	
	/**
	 * 获取报税信息
	 * @param nsrsbh
	 * @return
	 */
	public List<BsxxVo> getBsxxByNsrsbh(String nsrsbh, String fpzlDm, String lrrDm, String swjgDm);
	
	/**
	 * 根据纳税人识别号获取纳税人信息
	 * @param nsrsbh
	 * @return
	 */
	public List<NsrxxVo> getNsrxxByNsrsbh(String nsrsbh);
	
	/**
	 * 根据税务机关代码获取库房信息
	 * @param swjgDm
	 * @return
	 */
	public List<Map<String, Object>> getSwjgKf(String swjgDm);
	
}