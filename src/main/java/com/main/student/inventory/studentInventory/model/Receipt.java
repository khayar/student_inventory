package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate bankClearingDate;
    private Integer studentId;
    private Integer receiptNo;
    private Integer cashBank;
    private Integer registrationFee;
    private Integer securityFee;
    private Integer tutionFee;
    private Integer stationaryFee;
    private Integer citrexSale;
    private Integer totalRecord;
    private Integer paymentStatus;
    private String systemRemarks;
    private Integer orderStatus;
    private String other;
    private String unknown;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public Receipt() {
    }

    public Receipt(Long id, LocalDate bankClearingDate, Integer studentId, Integer receiptNo, Integer cashBank, Integer registrationFee, Integer securityFee, Integer tutionFee, Integer stationaryFee, Integer citrexSale, Integer totalRecord, Integer paymentStatus, String systemRemarks, Integer orderStatus, String other, String unknown, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(Integer receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Integer getCashBank() {
        return cashBank;
    }

    public void setCashBank(Integer cashBank) {
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

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getSystemRemarks() {
        return systemRemarks;
    }

    public void setSystemRemarks(String systemRemarks) {
        this.systemRemarks = systemRemarks;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(id, receipt.id) && Objects.equals(bankClearingDate, receipt.bankClearingDate) && Objects.equals(studentId, receipt.studentId) && Objects.equals(receiptNo, receipt.receiptNo) && Objects.equals(cashBank, receipt.cashBank) && Objects.equals(registrationFee, receipt.registrationFee) && Objects.equals(securityFee, receipt.securityFee) && Objects.equals(tutionFee, receipt.tutionFee) && Objects.equals(stationaryFee, receipt.stationaryFee) && Objects.equals(citrexSale, receipt.citrexSale) && Objects.equals(totalRecord, receipt.totalRecord) && Objects.equals(paymentStatus, receipt.paymentStatus) && Objects.equals(systemRemarks, receipt.systemRemarks) && Objects.equals(orderStatus, receipt.orderStatus) && Objects.equals(other, receipt.other) && Objects.equals(unknown, receipt.unknown) && Objects.equals(createdBy, receipt.createdBy) && Objects.equals(createdOn, receipt.createdOn) && Objects.equals(updatedBy, receipt.updatedBy) && Objects.equals(updatedOn, receipt.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankClearingDate, studentId, receiptNo, cashBank, registrationFee, securityFee, tutionFee, stationaryFee, citrexSale, totalRecord, paymentStatus, systemRemarks, orderStatus, other, unknown, createdBy, createdOn, updatedBy, updatedOn);
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
