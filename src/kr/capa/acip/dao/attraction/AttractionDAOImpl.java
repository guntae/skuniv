package kr.capa.acip.dao.attraction;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.capa.acip.vo.attraction.AttractionVO;

@Repository("AttractionDAO")
public class AttractionDAOImpl implements AttractionDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//새로운 기구 추가
	@Override
	public int insertAttraction(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.insert("kr.capa.acip.Attraction.insertAttraction", attraction);
		//kr.capa.acip.Attraction는 mapper의 namespace
		//insertAttraction는 mapper의 id
	}

	//기구 선택
	@Override
	public AttractionVO selectAttraction(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("kr.capa.acip.Attraction.selectAttraction", attraction);
	}
	
	//기구의 대기인원 업데이트
	@Override
	public int updateWaitnum(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.update("kr.capa.acip.Attraction.updateWaitnum", attraction);
	}

	//기구의 대기시간 업데이트
	@Override
	public int updateWaittime(AttractionVO attraction) throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.update("kr.capa.acip.Attraction.updateWaittime", attraction);
	}

	//기구 전체선택
	@Override
	public List<AttractionVO> selectAll() throws RuntimeException {
		// TODO Auto-generated method stub
		return sqlSession.selectList("kr.capa.acip.Attraction.selectAll");
	}
	
	

}
