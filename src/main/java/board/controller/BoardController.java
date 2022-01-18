package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.BoardService.BoardService;
import board.board.dto.BoardDto;

@Controller //컨트롤러 의미
public class BoardController {

		@Autowired // 비즈니스 로직을 처리하는 서비스 빈 연결
		private BoardService boardService;
		
		@RequestMapping("/board/openBoardList.do") // 어노테이션의 값으로 주소를 지정
		//웹브라우저에서 주소를 호출하면 스프링디스패처는 호출된 주소와 		//@RequestMapping어노테이션 값이 동일한 메서드를 찾아서 실행
		// 즉, 클라이언트에서 호출한 주소와 그것을 수행할 메서드를 연결.
		public ModelAndView openBoardList() throws Exception{
			ModelAndView mv = new ModelAndView("/board/boardList"); //호출된 요청의 결과를 보여줄 뷰 지정. 
			//Thymeleaf와 같은 템플릿을 사용할 경우 스프링부트의 자동설정기능으로 .html과 같은 접미사 생략 가능.
			
			List<BoardDto> list = boardService.selectBoardList():
		// 게시글 목록을 조회. BoardService클래스의 selectBoardList 메서드를 호출.
				//게시글 목록을 저장하기 위해서 List인터페이스를 사용.
				
				mv.addObject("list", list);
			//실행된 비즈니스 로직의 결과 값을 뷰에 list라는 이름으로 저장.
			//부에서 사용할 경우 list라는 이름으로 조회결과를 사용할 수 있다.
			
			
			return mv;
		}
}
