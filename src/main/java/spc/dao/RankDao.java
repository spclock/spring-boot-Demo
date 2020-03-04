package spc.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spc.entity.RankItem;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RankDao {
    @Resource
    private SqlSession sqlSession;
    public List<RankItem> getRank(){
        final List<RankItem> objects = sqlSession.selectList("MyMapper.selectRank");
        return objects;

    }
}
