package com.raphael.Study_ReactiveWeb;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "hello")
public class Hello {
    private long id;
    private String title;
    private String message;

}
