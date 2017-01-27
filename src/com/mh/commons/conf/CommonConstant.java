package com.mh.commons.conf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 整个应用通用的常量 <br>
 * <b>类描述:</b>
 * 
 * <pre>
 * |
 * </pre>
 */
public final class CommonConstant {
	
	
	//接口
	public static final String SPORT_INTERFACE_AUT_URL = "SPORT_INTERFACE_AUT_URL";
	public static final String INTERFACE_AUT_URL = "INTERFACE_AUT_URL";
	public static final String INTERFACE_AUT_UID = "INTERFACE_AUT_UID";
	public static final String INTERFACE_AUT_UDD = "INTERFACE_AUT_UDD";
	public static final String INTERFACE_AUT_DES = "INTERFACE_AUT_DES";
	public static final String APIPLUS_IFC_URL = "APIPLUS_IFC_URL";//彩票时间备用接口的URL
	public static final String SINA_API_URL = "SINA_API_URL";
	public static final String RESISTER_URL = "RESISTER_URL";
	
	public static final String	WEB_USER_ONLINE_AUTH_IP="web_user_online_auth_ip";
	
	//彩票
	public static final String CP_ACT_PRO_TYPE = "caipiao";
	public static final String CP_BET_OUT = "31";//投注支出(体育与彩票)
	public static final String CP_BET_IN = "32";//投注收入（赢收入、注单取消收入、注单异常等收入）（体育与彩票）
	
 
	public static final String USER_CONTEXT_KEY = "USER_CONTEXT_KEY";
	
	public static final String USER_COOKIE_KEY = "mop";
	
	public static final String RESOURCE_INIT_PATH = "resInitPath"; 
	
	// 配置文件常量
	public static Map<String, String> resCommMap = new HashMap<String, String>();

	// 不拦截地址
	public static List<String> visitList = new ArrayList<String>();

	// 拦截地址
	public static List<String> interceptorList = new ArrayList<String>();
	
	//常量
	public static String APP_CLIENT_DES_KEY= "app.client.des.key";
	public static String APP_MONEY_DES_KEY= "app.money.des.key";
	
	
	 /** 登入验证码在Session 中的键名称*/
    public static final String VERITY_CODE_KEY = "VERITY_CODE";
    
    public static final String TEST_VERITY_CODE_KEY = "TEST_VERITY_CODE";
   
	public static final String DEFAULT_SUCCESS_MSG = "成功";
	public static final String DEFAULT_FAIL_MSG = "失败";
	
	
	public static final String WEB_USER_FLAG = "WEB_USER_FLAG";
	
	
	//香港六合彩 连码 
	 //组合类型  1复式 2 胆拖 3 生肖对碰 4 尾数对碰
	public static final String HK6_LM_ZHLX_FS="1";
	public static final String HK6_LM_ZHLX_TD="2";
	public static final String HK6_LM_ZHLX_SXDP="3";
	public static final String HK6_LM_ZHLX_WSDP="4";
	
	//类别  0 三全中 1三中二 2二全中 3二中特 4特串
	public static final String HK6_LM_LB_3QZ="0";
	public static final String HK6_LM_LB_3Q2="1";
	public static final String HK6_LM_LB_2QZ="2";
	public static final String HK6_LM_LB_2ZT="3";
	public static final String HK6_LM_LB_TC="4";
	
	//连码 配置id
	public static final String HK6_LM_CFGID_SQZ = "496";
	public static final String HK6_LM_CFGID_Z2 = "497";
	public static final String HK6_LM_CFGID_Z3 = "498";
	public static final String HK6_LM_CFGID_2QZ = "499";
	public static final String HK6_LM_CFGID_ZT = "500";
	public static final String HK6_LM_CFGID_TZ2 = "501";
	public static final String HK6_LM_CFGID_TC = "502";
	
	
	//------------------------ 逻辑状态 --------------------------
	/** 不可用 */
	public final static String STATUS_UNUSABLE = "0";
	
	/** 可用 */
	public final static String STATUS_USABLE = "1";
	
	
	//------------------------ 分页对像在上下文标识---------------------------------------------------------	
	public static final String PAGE_KEY = "page";
	
	//--------------------------------------------默认分页大小-----------------------------------------	
	/**默认分页大小*/
	public static final int DEFAULT_PAGE_SIZE = 10;
	
	/**默认第几页*/
	public static final int DEFAULT_PAGE_NO = 1;
	
	public static final String PAGE_NO = "pageNo";
	
	public static final String PAGE_SIZE = "pageSize";
	
	public static final String ORDER_BY = "ORDER_BY";
	
	public static final String ORDER = "ORDER";
	
	/** 用户名合法字符串，最大限度限制 */
	public static final String LEGAL_CHAR = "0123456789abcdefghijklmnopqrstuvwxyz_ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	//--------------------------------------------彩票代码-----------------------------------------	
	
	public final static int IS_ENABLE = 0;//是否启用 0：停用 1：启用
	
	//彩票代码值
	//六合彩
	public static final String HK_CODE_PARAM="HK6";
	//福彩3D
	public static final String FC3D_CODE_PARAM="FC3D";
	//排列3
	public static final String PL3_CODE_PARAM="PL3";
	//重庆时时彩
	public static final String CQSSC_CODE_PARAM="CQSSC";
	//江西时时彩
	public static final String JXSSC_CODE_PARAM="JXSSC";
	//天津时时彩
	public static final String	TJSSC_CODE_PARAM="TJSSC";
	//新疆时时彩
	public static final String XJSSC_CODE_PARAM="XJSSC";
	//天津快乐十分
	public static final String TJKLSF_CODE_PARAM="TJKLSF";
	//广东快乐十分
	public static final String GDKLSF_CODE_PARAM="GDKLSF";
	//北京pk拾
	public static final String BJPK10_CODE_PARAM="BJPK10";
	//幸运28
	public static final String BJKL8_CODE_PARAM="BJKL8";
	//加拿大28
	public static final String CAKENO_CODE_PARAM="CAKENO";
	
	public static List<String> dxdsList = new ArrayList<String>();
	
	public static Map<String,List<String>> reverseMap = new LinkedHashMap<String,List<String>>();
	//逆向
	//大
	public static String[] bigReverseArr = new String[]{"小","小单","小双"};
	//小
	public static String[] smallReverseArr = new String[]{"大","大单","大双"};
	//单
	public static String[] oddReverseArr = new String[]{"双","大双","小双"};
	//双
	public static String[] evenReverseArr = new String[]{"单","大单","小单"};
	
	//大单
	public static String[] bigOddReverseArr = new String[]{"小","双","小双"};
	//大双
	public static String[] bigEvenReverseArr = new String[]{"小","单","小单"};
	//小单
	public static String[] smallOddReverseArr = new String[]{"大","双","大双"};
	//小双
	public static String[] smallEvenReverseArr = new String[]{"大","单","大单"};
	
	static{
		reverseMap.put("大", Arrays.asList(bigReverseArr));
		reverseMap.put("小", Arrays.asList(smallReverseArr));
		reverseMap.put("单", Arrays.asList(oddReverseArr));
		reverseMap.put("双", Arrays.asList(evenReverseArr));
		reverseMap.put("大单", Arrays.asList(bigOddReverseArr));
		reverseMap.put("大双", Arrays.asList(bigEvenReverseArr));
		reverseMap.put("小单", Arrays.asList(smallOddReverseArr));
		reverseMap.put("小双", Arrays.asList(smallEvenReverseArr));
		
		
		dxdsList.add("大");
		dxdsList.add("小");
		dxdsList.add("单");
		dxdsList.add("双");
		dxdsList.add("大单");
		dxdsList.add("小单");
		dxdsList.add("大双");
		dxdsList.add("小双");
	}
}
