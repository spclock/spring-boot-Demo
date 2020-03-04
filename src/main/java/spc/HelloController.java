package spc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import spc.dao.UserMapper;
import spc.entity.RankItem;
import spc.service.RankService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RankService rankService;

    @RequestMapping("/")
    @ResponseBody
    public Object search(){
        List<RankItem> rankItem = rankService.getRankItem();
        return rankItem;
    }
    @RequestMapping("/search")
    public String index(@RequestParam("q")String searchWork) {
        return "you search work is:"+searchWork;
    }

}