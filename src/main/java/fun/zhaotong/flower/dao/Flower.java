package fun.zhaotong.flower.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName
public class Flower {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private long id;

    private String name;

    private long typeId;

    private long colorId;

    private String colorDetail;

    private long priceId;

    private long featureId;

    private long status;

    private String remark;

    private LocalDateTime create_time;

    private LocalDateTime update_time;

    @TableLogic(delval = "id")
    private Long deleted_flag;

}
