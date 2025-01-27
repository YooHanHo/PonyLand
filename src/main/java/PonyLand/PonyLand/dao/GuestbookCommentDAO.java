package PonyLand.PonyLand.dao;

import PonyLand.PonyLand.dto.GuestbookCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuestbookCommentDAO {

    @Autowired
    PonyLand.PonyLand.Mapper.GuestbookCommentMapper GuestbookCommentMapper;

    public int insert(GuestbookCommentDTO dto) {return GuestbookCommentMapper.insert(dto);}

    public List<GuestbookCommentDTO> select() {

        return GuestbookCommentMapper.select();}


    //public int delete(int Guestbook_comment_Seq) {return GuestbookCommentMapper.delete(Guestbook_comment_Seq);}
}
