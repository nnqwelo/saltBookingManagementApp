package com.saltsoftware.entity.payment;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientPaymentType {

    //required parameters
    @Id
    private String paymentTypeID;
    private String paymentDescrip;

    //default constructor
    protected PatientPaymentType(){}

    //constructor
    private PatientPaymentType(Builder builder) {
        this.paymentTypeID = builder.paymentTypeID;
        this.paymentDescrip = builder.paymentDescrip;
    }

    //getters
    public String getPaymentTypeID() {
        return paymentTypeID;
    }

    public String getPaymentDescrip() {
        return paymentDescrip;
    }

    @Override
    public String toString() {
        return "PatientPaymentType{" +
                "paymentTypeID='" + paymentTypeID + '\'' +
                ", paymentDescrip='" + paymentDescrip + '\'' +
                '}';
    }

    //inner builder class
    public static class Builder{
        private String paymentTypeID, paymentDescrip;

        //setters
        public Builder setPaymentID(String paymentTypeID){
            this.paymentTypeID = paymentTypeID;
            return this;
        }

        public Builder setDescrip(String paymentDescrip){
            this.paymentDescrip = paymentDescrip;
            return this;
        }

        //copy method
        public Builder copy(PatientPaymentType patientPaymentType){
            this.paymentTypeID = patientPaymentType.paymentTypeID;
            this.paymentDescrip = patientPaymentType.paymentDescrip;
            return this;
        }

        //builder method
        public PatientPaymentType build(){

            return new PatientPaymentType(this);
        }
    }
    //end of inner class
}
