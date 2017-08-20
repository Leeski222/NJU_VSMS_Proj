package nju.yva.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Water on 2017/8/19.
 */
@Data
@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "vol_hours")
    private double voluntaryHours;

    @NotNull
    @Column(name = "user_name")
    private String name;


    @NotNull
    @Column(name = "tel_nul")
    private String telephoneNum;

    @NotNull
    @Column(name = "stu_no")
    private String studentNo;
}
