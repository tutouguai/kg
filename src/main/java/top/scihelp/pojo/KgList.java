package top.scihelp.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class KgList implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer kgId;
    private String kgName;
    private String kgIntroduce;
    private String kgDataFilepath;
}
