package board.BoardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.BoardDto;
import board.mapper.BoardMapper;

@Service //비즈니스 로직을 처리하는 서비스 클래스를 나타내는 어노테이션
public class BoardServiceImpl implements BoardService {
	
			@Autowired
			private BoardMapper boardMapper; // DB에 접근하는 DAO빈을 선언 
			
			@Override
			public List<BoardDto> selectBoardList() throws Exception{
				return boardMapper.selectBoardList(); // 사용자 요청을 처리하기 위한 비즈니스 로직 구현 
				//데이터를 조회하도록 BoardMapper 클래스의 selectBoardList 메서드 호출 (일반적으로 결과 조회 및 데이터 가공)
			}
}
