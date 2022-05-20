package cn.arctique.reactadminapi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author arctique
 * @date 2021/12/7 22:23:02
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class AdminListResVO implements Serializable {

    private static final long serialVersionUID = 3400864406503527669L;

    private Integer id;

    private String name;

    private String mobile;

    private String email;
}
