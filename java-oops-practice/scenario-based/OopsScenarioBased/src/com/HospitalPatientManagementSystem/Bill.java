package com.HospitalPatientManagementSystem;

//Bill class implementing Payable
class Bill implements Payable{
  private double amount;
  private double tax;
  private double discount;

  public Bill(double amount){
      this.amount=amount;
      this.tax=amount*0.05; //5% tax
      this.discount=amount*0.10; //10% discount
  }

  @Override
  public double calculatePayment(){
      return amount+tax-discount;
  }
}
