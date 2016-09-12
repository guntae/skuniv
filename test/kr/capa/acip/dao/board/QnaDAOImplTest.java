package kr.capa.acip.dao.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.capa.acip.vo.board.QnaVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Spring/applicationContext.xml"})
public class QnaDAOImplTest {
	@Autowired
	private QnaDAO qnaDAO;
		
//	@Test
//	public void insertQna() throws Exception{
//		QnaVO qna = new QnaVO();
//		qna.setMid("1");
//		qna.setQtitle("title");
//		qna.setQcontent("abc");
//		qna.setLnum(1); 
//		
//		int count = qnaDAO.insertQna(qna);
//		assertEquals(1, count);
//	}
	
/*		@Test
	public void deleteQna() throws Exception{
			QnaVO qna = new QnaVO();
			qna.setMid("1");
			
		int count = qnaDAO.deleteQna(23);//23Àº fseq
		assertEquals(1,count);
	}
*/
	
/*	@Test
	public void updateQna() throws Exception{
		QnaVO qna = new QnaVO();
		qna.setQnum(24);
		qna.setQtitle("title2");
		qna.setQcontent("def");
		int count = qnaDAO.updateQna(qna);
		assertEquals(1, count);
	}*/
	
	@Test
	public void selectFreetalk() throws Exception{
		qnaDAO.selectQna("1", 1);
		assertNotNull(qnaDAO);
	}
	
/*	@Test
	public void selectQna() throws Exception{
		qnaDAO.selectQna2("title2");
		assertNotNull(qnaDAO);
	}*/

}
