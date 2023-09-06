package fun.zhaotong.flower.dao;

import java.util.ArrayList;
import java.util.List;

public class FlowerDAO {

    public List<Flower> queryFlowerList() {
        List<Flower> result = new ArrayList<Flower>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            Flower user = new Flower();
            user.setName("刘氏小天使" + i);
            user.setCause("未淘汰" + i);
            user.setStatus(i + 1);
            result.add(user);
        }
        return result;
    }
}
