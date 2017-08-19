package nju.yva.web.data;

import lombok.Data;

/**
 * Created by Water on 2017/8/11.
 */
@Data
public class UserInfo {
    // 用户的id
    private String username;
    // 用户的名字
    private String name;
    // 用户的学号
    private String studentNo;
    // 用户的电话号码
    private String telNum;
    // 用户的志愿时长,显示用的直接String了
    private String volunteerTime;
    // 是否审核过
    private boolean checked;
    // 是否通过审核
    private boolean passed;
}
