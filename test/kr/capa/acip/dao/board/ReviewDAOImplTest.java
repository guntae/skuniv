package kr.capa.acip.dao.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.capa.acip.vo.board.ReviewVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Spring/applicationContext.xml"})
public class ReviewDAOImplTest {
	@Autowired
	private ReviewDAO reviewDAO;
	
/*	@Test
	public void insertReview() throws Exception{
		ReviewVO Review = new ReviewVO();
		Review.setMid("1");
		Review.setRtitle("review");
		Review.setRcontent("∏Æ∫‰¿”");
		Review.setLnum(1); 
		
		int count = reviewDAO.insertReview(Review);
		assertEquals(1, count);
	}*/
	
/*	@Test
	public void deleteReview() throws Exception{
			ReviewVO Review = new ReviewVO();
			Review.setMid("1");
			
		int count = reviewDAO.deleteReview(21);//21¿∫ rseq
		assertEquals(1,count);
	}*/

	
/*	@Test
	public void updateReview() throws Exception{
		ReviewVO Review = new ReviewVO();
		Review.setRnum(22);
		Review.setRtitle("review2");
		Review.setRcontent("∏Æ∫‰¿”2");
		int count = reviewDAO.updateReview(Review);
		assertEquals(1, count);
	}*/
	
/*	@Test
	public void selectReview() throws Exception{
		reviewDAO.selectReview("1");
		assertNotNull(reviewDAO);
	}*/
	
	@Test
	public void selectReview2() throws Exception{
		reviewDAO.selectReview2("review2", 1);
		assertNotNull(reviewDAO);
	}

}
