package board.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import board.modelo.Board;

public class BoardDao extends DAO<Board> {

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO board(name) VALUES (?)";
	}

	@Override
	protected String getUpdateQuery() {
		return null;
	}

	@Override
	protected String getDeleteQuery() {
		return "DELETE FROM board id = ?";
		
	}
	@Override
	protected String getSelectQuery(Integer id) {
		return "SELECT * FROM board WHERE id = ?";
	}
	
	@Override
	protected String getSelectQuery() {
		return "SELECT * FROM board";
	}

	@Override
	protected void setParameters(PreparedStatement stmt, Board board) throws SQLException {
		stmt.setString(1, board.getNome());
	}

	@Override
	protected Board getEntityFromResultSet(ResultSet rs) throws SQLException {
		return new Board (
				rs.getString("nome"),
				rs.getInt("id")
				);
	}

}
