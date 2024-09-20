package com.api.ERP.Model;

//import Model.Enum.ActionFigureType;

import com.api.ERP.Model.Enum.ActionFigureType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "prod_action_figure")
@Getter
@Setter
public class ActionFigureEntity extends Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Long productId;
    @Column
    private ActionFigureType type;
    @Column
    private float height;
    @Column
    private float width;
    @Column
    private float length;


    public ActionFigureEntity(Long id, ActionFigureType type, float height, float width, float length) {
        super();
        this.id = id;
        this.productId = super.getId();
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public ActionFigureEntity() {
        super();
    }
}