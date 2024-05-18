package JAVA.YinHang;

//�����
class Depositor {
 private String name;
 private String accountNumber;

 public Depositor(String name, String accountNumber) {
     this.name = name;
     this.accountNumber = accountNumber;
 }

 // Getters and Setters
 public String getName() {
     return name;
 }

 public String getAccountNumber() {
     return accountNumber;
 }
}