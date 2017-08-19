package nju.yva.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/19.
 */
@Data
@Entity
@Table(name = "user_data")
public class UserData {
    @NotNull
    @Column(name = "vol_hours")
    private double voluntaryHours;

    @NotNull
    @Column(name = "user_name")
    private String name;

    @Id
    private long id;

    @NotNull
    @Column(name = "tel_nul")
    private String telephoneNum;

    @NotNull
    @Column(name = "stu_no")
    private String studentNo;
}
