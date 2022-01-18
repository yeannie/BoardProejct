package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.dto.BoardDto;



@Mapper //메퍼 인터페이스 선언
public interface BoardMapper {
	List<BoardDto> selectBoardList()  throws Exception; 
	//인터 페이스 이기 때문에 매서드의 이름과 반환 형식만 지정  
	// 여기서 정한 매서드 이름은 SQL이름과 동일해야 한다.




}
