package kr.capa.acip.dao.board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import kr.capa.acip.vo.board.FreetalkVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Spring/applicationContext.xml"})
public class FreetalkDAOImplTest {
	@Autowired
	private FreetalkDAO freetalkDAO;
	
/*	@Test
	public void insertFreetalk() throws Exception{
		FreetalkVO freetalk = new FreetalkVO();
		freetalk.setMid("1");
		freetalk.setFtitle("title");
		freetalk.setFcontent("abc");
		freetalk.setLnum(1); 
		
		int count = freetalkDAO.insertFreetalk(freetalk);
		assertEquals(1, count);
	}*/
	
/*		@Test
	public void deleteFreetalk() throws Exception{
			FreetalkVO freetalk = new FreetalkVO();
			freetalk.setMid("1");
			
		int count = freetalkDAO.deleteFreetalk(23);//23Àº fseq
		assertEquals(1,count);
	}
*/
	
/*	@Test
	public void updateFreetalk() throws Exception{
		FreetalkVO freetalk = new FreetalkVO();
		freetalk.setFnum(24);
		freetalk.setFtitle("title2");
		freetalk.setFcontent("def");
		int count = freetalkDAO.updateFreetalk(freetalk);
		assertEquals(1, count);
	}*/
	
/*	@Test
	public void selectFreetalk() throws Exception{
		freetalkDAO.selectFreetalk("1", 1);
		assertNotNull(freetalkDAO);
	}*/
	
/*	@Test
	public void selectFreetalk2() throws Exception{
		freetalkDAO.selectFreetalk2("title2");
		assertNotNull(freetalkDAO);
	}*/
	
	@Test
	public void selectFreetalkALL() throws Exception{
		FreetalkVO freetalk = new FreetalkVO();
		
		freetalk.setFnum(24);
		freetalk.setLnum(1);
		freetalkDAO.selectFreetalklist(freetalk);
		List<FreetalkVO> freetalklist = freetalkDAO.selectFreetalklist(freetalk);
		System.out.println(freetalklist);
		assertNotNull(freetalklist);
	}
	
	

}
