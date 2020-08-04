package com.food.delivery.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Entity
@Table(name = "Order")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private long orderId;

	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="order_id")
	private List<RestaurantEntity> restaurantId;
	
	private double totalPrice;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderTime;
	
	private String specialNote;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date expectedDeliveryTime;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date deliveredTime;
	
}
