package spc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spc.dao.RankDao;
import spc.entity.RankItem;

import java.util.List;
@Service
public class RankService {
    @Autowired
    private RankDao rankDao;
    public List<RankItem> getRankItem(){
        return rankDao.getRank();
    }
}
