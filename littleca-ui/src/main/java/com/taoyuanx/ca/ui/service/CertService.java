package com.taoyuanx.ca.ui.service;

import com.taoyuanx.ca.ui.common.CAConstant;
import com.taoyuanx.ca.ui.dto.CertReq;
import com.taoyuanx.ca.ui.dto.CertResult;
import com.taoyuanx.ca.ui.dto.KeyPairResult;

/**
 * @author 都市桃源
 * 2018年9月14日 下午1:37:18
 *证书服务
*/
public interface CertService {
	CertResult certToUser(CertReq req,Integer keySize) throws Exception;
	KeyPairResult createKeyPair(CAConstant.KeyType type, Integer keySize) throws Exception;
}
