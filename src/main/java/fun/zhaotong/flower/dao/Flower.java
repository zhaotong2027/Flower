package fun.zhaotong.flower.dao;

import lombok.Data;

@Data
public class Flower {

    private String id;

    private String name;

    private String typeId;

    private String colourId;

    private String priceId;

    private String featureId;

    private Integer status;

    private String cause;

    private String remark;
}
