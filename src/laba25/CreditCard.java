package laba25;

import java.io.Serializable;

public class CreditCard implements Serializable {
    protected enum cardTypeValue{VISA , MASTER_CARD};
    private String cardType;
    private String bankName;
    private String cardNumber;
    private transient String exp;
    private transient String cvv;

    public CreditCard() {
        this.cardType = "VISA";
        this.bankName = "bankName";
        this.cardNumber = "1111222233334444";
        this.exp = "12/12";
        this.cvv = "000";

    }

    public CreditCard(String cardType, String bankName, String cardNumber, String exp, String cvv) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", exp='" + exp + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
