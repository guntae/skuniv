package kr.capa.acip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.capa.acip.dao.attraction.AttractionDAO;
import kr.capa.acip.vo.attraction.AttractionVO;

@Service("AttractionService")
public class AttractionServiceImpl implements AttractionService {
	@Autowired
	private AttractionDAO attractiondao; 
	
	@Override
	public int BearsUpdate(int lnum, int anum, int awaitnum) {
		// TODO Auto-generated method stub
		AttractionVO attractionvo=new AttractionVO();
		attractionvo.setLnum(lnum);
		attractionvo.setAnum(anum); 
		attractionvo=attractiondao.selectAttraction(attractionvo);
		int admitnum=attractionvo.getAadmitnum();
		int runtime=attractionvo.getAruntime();
		int waittime=awaitnum/admitnum*runtime;
		attractionvo.setAwaittime(waittime);
		return attractiondao.updateWaittime(attractionvo);
	}

	@Override
	public int EaglesUpdate(int lnum, int anum, int awaitnum) {
		// TODO Auto-generated method stub
		
		AttractionVO attractionvo=new AttractionVO();
		attractionvo.setLnum(lnum);
		attractionvo.setAnum(anum);
		attractionvo=attractiondao.selectAttraction(attractionvo);
		int admitnum=attractionvo.getAadmitnum();
		int runtime=attractionvo.getAruntime();
		int waittime=awaitnum/admitnum*runtime;
		attractionvo.setAwaittime(waittime);
		return attractiondao.updateWaittime(attractionvo);
	}

	@Override
	public int GiantsUpdate(int lnum,int anum, int awaitnum) {
		// TODO Auto-generated method stub
		AttractionVO attractionvo=new AttractionVO();
		attractionvo.setLnum(lnum);
		attractionvo.setAnum(anum);

		System.out.println(attractionvo);
		attractionvo=attractiondao.selectAttraction(attractionvo);
		int admitnum=attractionvo.getAadmitnum();
		int runtime=attractionvo.getAruntime();
		int waittime=awaitnum/admitnum*runtime;
		attractionvo.setAwaittime(waittime);
		System.out.println(attractionvo);
		return attractiondao.updateWaittime(attractionvo);
	}

}
