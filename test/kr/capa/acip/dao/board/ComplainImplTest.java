package kr.capa.acip.dao.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.capa.acip.vo.board.ComplainVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Spring/applicationContext.xml"})
public class ComplainImplTest {
	@Autowired
	private ComplainDAO complainDAO;
	
		@Test
	public void insertComplain() throws Exception{
		ComplainVO complain = new ComplainVO();
		complain.setMid("1");
		complain.setCtitle("COMPLAIN");
		complain.setCcontent("ºÒ¸¸");
		complain.setLnum(1); 
		
		int count = complainDAO.insertComplain(complain);
		assertEquals(1, count);
	}
	
/*		@Test
	public void deleteComplain() throws Exception{
			ComplainVO complain = new ComplainVO();
			complain.setMid("1");
			
		int count = complainDAO.deleteComplain(23);//23Àº fseq
		assertEquals(1,count);
	}
*/
	
/*	@Test
	public void updateComplain() throws Exception{
		ComplainVO complain = new ComplainVO();
		complain.setCnum(24);
		complain.setCtitle("title2");
		complain.setCcontent("def");
		int count = complainDAO.updateComplain(complain);
		assertEquals(1, count);
	}*/
	
	@Test
	public void selectComplain() throws Exception{
		complainDAO.selectComplain("1", 1);
		assertNotNull(complainDAO);
	}
	
/*	@Test
	public void selectComplain2() throws Exception{
		complainDAO.selectComplain2("title2");
		assertNotNull(complainDAO);
	}*/

}
