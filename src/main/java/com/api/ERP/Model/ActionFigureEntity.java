package com.api.ERP.Model;

//import Model.Enum.ActionFigureType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "action_figure")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActionFigureEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @Column
//    private ActionFigureType type;
    @Column
    private float height;
    @Column
    private float width;
    @Column
    private float length;
}