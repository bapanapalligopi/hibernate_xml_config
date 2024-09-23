/**
 * Entity class representing a Customer.
 */
package com.application.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a customer entity with relevant attributes.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // Specifies that this class is a Hibernate entity
public class Customer {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated by the database
    private int id;

    private String name; // The customer's name

    private String address; // The customer's address

    private String phoneNumber; // The customer's phone number

    @CreationTimestamp // Automatically sets the creation date when the entity is created
    private Date createdOn;

    /**
     * Overrides the default toString method to provide a string representation of the Customer object.
     *
     * @return A string representation of the Customer, including all relevant fields.
     */
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
                + ", createdOn=" + createdOn + "]";
    }
}
