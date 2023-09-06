package fun.zhaotong.flower.service;

import fun.zhaotong.flower.dao.Flower;
import fun.zhaotong.flower.dao.FlowerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    private FlowerDAO flowerDAO;

    public List<Flower> queryFlowerList() {
        return this.flowerDAO.queryFlowerList();
    }
}
