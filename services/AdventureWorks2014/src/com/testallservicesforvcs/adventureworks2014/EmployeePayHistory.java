/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

/**
 * EmployeePayHistory generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`EmployeePayHistory`")
@IdClass(EmployeePayHistoryId.class)
public class EmployeePayHistory implements Serializable {

    private Integer businessEntityId;
    @Type(type = "DateTime")
    private LocalDateTime rateChangeDate;
    private double rate;
    private short payFrequency;
    @Type(type = "DateTime")
    private LocalDateTime modifiedDate;
    private Employee employee;

    @Id
    @Column(name = "`BusinessEntityID`", nullable = false, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Id
    @Column(name = "`RateChangeDate`", nullable = false)
    public LocalDateTime getRateChangeDate() {
        return this.rateChangeDate;
    }

    public void setRateChangeDate(LocalDateTime rateChangeDate) {
        this.rateChangeDate = rateChangeDate;
    }

    @Column(name = "`Rate`", nullable = false, scale = 4, precision = 19)
    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Column(name = "`PayFrequency`", nullable = false, scale = 0, precision = 3)
    public short getPayFrequency() {
        return this.payFrequency;
    }

    public void setPayFrequency(short payFrequency) {
        this.payFrequency = payFrequency;
    }

    @Column(name = "`ModifiedDate`", nullable = false)
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`BusinessEntityID`", referencedColumnName = "`BusinessEntityID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_EmployeePayHistory_Employee_BusinessEntityID`"))
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        if(employee != null) {
            this.businessEntityId = employee.getBusinessEntityId();
        }

        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePayHistory)) return false;
        final EmployeePayHistory employeePayHistory = (EmployeePayHistory) o;
        return Objects.equals(getBusinessEntityId(), employeePayHistory.getBusinessEntityId()) &&
                Objects.equals(getRateChangeDate(), employeePayHistory.getRateChangeDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getRateChangeDate());
    }
}

