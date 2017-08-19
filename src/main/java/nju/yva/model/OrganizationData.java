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
@Table(name = "org_data")
public class OrganizationData {
    @Id
    private long id;

    @NotNull
    @Column(name = "org_name", updatable = false)
    private String name;

    @NotNull
    @Column(name = "org_intro")
    private String introduction;
}
