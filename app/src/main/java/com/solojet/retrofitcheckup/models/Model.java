package com.solojet.retrofitcheckup.models;

import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("policyNo")
    private String policyNo;
    @SerializedName("enrolleeName")
    private String enrolleeName;
    @SerializedName("email")
    private String email;
    @SerializedName("phoneNo")
    private String phoneNo;
    @SerializedName("address")
    private String address;
    @SerializedName("state")
    private String state;
    @SerializedName("providerName")
    private String providerName;
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("subsidiary")
    private String subsidiary;
    @SerializedName("companyplanstatus")
    private boolean companyplanstatus;
    @SerializedName("companyPlans")
    private String companyPlans;

    public Model(String policyNo, String enrolleeName, String email, String phoneNo, String address, String state,
                 String providerName, String companyName, String subsidiary, boolean companyplanstatus, String companyPlans){

        this.policyNo = policyNo;
        this.enrolleeName = enrolleeName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.state = state;
        this.providerName = providerName;
        this.companyName = companyName;
        this.subsidiary = subsidiary;
        this.companyplanstatus = companyplanstatus;
        this.companyPlans = companyPlans;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getEnrolleeName() {
        return enrolleeName;
    }

    public void setEnrolleeName(String enrolleeName) {
        this.enrolleeName = enrolleeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(String subsidiary) {
        this.subsidiary = subsidiary;
    }

    public boolean getCompanyplanstatus() {
        return companyplanstatus;
    }

    public void setCompanyplanstatus(boolean companyplanstatus) {
        this.companyplanstatus = companyplanstatus;
    }

    public String getCompanyPlans() {
        return companyPlans;
    }

    public void setCompanyPlans(String companyPlans) {
        this.companyPlans = companyPlans;
    }
}
