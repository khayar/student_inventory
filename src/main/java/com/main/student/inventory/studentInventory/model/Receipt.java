package com.main.student.inventory.studentInventory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.main.student.inventory.studentInventory.util.ReceiptInfoDeserlizer;
import com.main.student.inventory.studentInventory.util.StudentDeserlizer;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "bank_clearing_date")
    private LocalDate bankClearingDate;
    @JsonDeserialize(using = StudentDeserlizer.class)
    @ManyToOne
    @JoinColumn(name = "studentId" )
    private Student studentId;
    @JsonDeserialize(using = ReceiptInfoDeserlizer.class)
    @ManyToOne
    @JoinColumn(name = "receiptNo")
    private ReceiptInfo receiptNo;
    @Column(name = "cash_bank")
    private String cashBank;
    @Column(name = "registration_fee")
    private Integer registrationFee;
    @Column(name = "security_fee")
    private Integer securityFee;
    @Column(name = "tution_fee")
    private Integer tutionFee;
    @Column(name = "stationary_fee")
    private Integer stationaryFee;
    @Column(name = "citrex_sale")
    private Integer citrexSale;
    @Column(name = "inventory")
    private Integer inventory;
    @Column(name = "total_record")
    private Integer totalRecord;
    @Column(name = "payment_status")
    private String paymentStatus;
    @Column(name = "system_remarks")
    private String systemRemarks;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "other")
    private String other;
    @Column(name = "unknown")
    private String unknown;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    public Receipt() {
    }

    public Receipt(Long id, LocalDate bankClearingDate, Student studentId, ReceiptInfo receiptNo, String cashBank, Integer registrationFee, Integer securityFee, Integer tutionFee, Integer stationaryFee, Integer citrexSale, Integer inventory, Integer totalRecord, String paymentStatus, String systemRemarks, String orderStatus, String other, String unknown, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
        this.id = id;
        this.bankClearingDate = bankClearingDate;
        this.studentId = studentId;
        this.receiptNo = receiptNo;
        this.cashBank = cashBank;
        this.registrationFee = registrationFee;
        this.securityFee = securityFee;
        this.tutionFee = tutionFee;
        this.stationaryFee = stationaryFee;
        this.citrexSale = citrexSale;
        this.inventory = inventory;
        this.totalRecord = totalRecord;
        this.paymentStatus = paymentStatus;
        this.systemRemarks = systemRemarks;
        this.orderStatus = orderStatus;
        this.other = other;
        this.unknown = unknown;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBankClearingDate() {
        return bankClearingDate;
    }

    public void setBankClearingDate(LocalDate bankClearingDate) {
        this.bankClearingDate = bankClearingDate;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public ReceiptInfo getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(ReceiptInfo receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getCashBank() {
        return cashBank;
    }

    public void setCashBank(String cashBank) {
        this.cashBank = cashBank;
    }

    public Integer getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(Integer registrationFee) {
        this.registrationFee = registrationFee;
    }

    public Integer getSecurityFee() {
        return securityFee;
    }

    public void setSecurityFee(Integer securityFee) {
        this.securityFee = securityFee;
    }

    public Integer getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(Integer tutionFee) {
        this.tutionFee = tutionFee;
    }

    public Integer getStationaryFee() {
        return stationaryFee;
    }

    public void setStationaryFee(Integer stationaryFee) {
        this.stationaryFee = stationaryFee;
    }

    public Integer getCitrexSale() {
        return citrexSale;
    }

    public void setCitrexSale(Integer citrexSale) {
        this.citrexSale = citrexSale;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getSystemRemarks() {
        return systemRemarks;
    }

    public void setSystemRemarks(String systemRemarks) {
        this.systemRemarks = systemRemarks;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getUnknown() {
        return unknown;
    }

    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", bankClearingDate=" + bankClearingDate +
                ", studentId=" + studentId +
                ", receiptNo=" + receiptNo +
                ", cashBank=" + cashBank +
                ", registrationFee=" + registrationFee +
                ", securityFee=" + securityFee +
                ", tutionFee=" + tutionFee +
                ", stationaryFee=" + stationaryFee +
                ", citrexSale=" + citrexSale +
                ", inventory=" + inventory +
                ", totalRecord=" + totalRecord +
                ", paymentStatus=" + paymentStatus +
                ", systemRemarks='" + systemRemarks + '\'' +
                ", orderStatus=" + orderStatus +
                ", other='" + other + '\'' +
                ", unknown='" + unknown + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }

    @PrePersist
    private void beforeInsert(){
        this.setCreatedBy("admin");
        this.setCreatedOn(LocalDateTime.now());
        this.setUpdatedBy("admin");
        this.setUpdatedOn(LocalDateTime.now());
    }
    @PreUpdate
    private void beforeUpdate(){
        this.setUpdatedBy("admin");
        this.setUpdatedOn(LocalDateTime.now());
    }
}
