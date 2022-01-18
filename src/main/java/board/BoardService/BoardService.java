package board.BoardService;

import java.util.List;

import board.dto.BoardDto;

public interface BoardService {

	List<BoardDto>selectBoardList() throws Exception;
}
