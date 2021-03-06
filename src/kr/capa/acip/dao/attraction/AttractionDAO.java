package kr.capa.acip.dao.attraction;

import java.util.List;

import kr.capa.acip.vo.attraction.AttractionVO;

//기구 dao인터페이스
public interface AttractionDAO {
	public int insertAttraction(AttractionVO attraction)throws RuntimeException;
	public AttractionVO selectAttraction(AttractionVO attraction)throws RuntimeException;
	public int updateWaitnum(AttractionVO attraction)throws RuntimeException;
	public int updateWaittime(AttractionVO attraction)throws RuntimeException;
	public List<AttractionVO> selectAll()throws RuntimeException;
}
