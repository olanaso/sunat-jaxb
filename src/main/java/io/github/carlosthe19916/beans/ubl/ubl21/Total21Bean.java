package io.github.carlosthe19916.beans.ubl.ubl21;

import java.math.BigDecimal;

import io.github.carlosthe19916.beans.TotalBean;

import javax.validation.constraints.NotNull;

public class Total21Bean extends TotalBean {

    @NotNull
    private BigDecimal anticipos;

    @NotNull
    private BigDecimal extensionAmount;

    @NotNull
    private BigDecimal inclusiveAmount;

    public Total21Bean(TotalBean total) {
        super(total);
    }

    public BigDecimal getAnticipos() {
        return anticipos;
    }

    public void setAnticipos(BigDecimal anticipos) {
        this.anticipos = anticipos;
    }

    public BigDecimal getExtensionAmount() {
        return extensionAmount;
    }

    public void setExtensionAmount(BigDecimal extensionAmount) {
        this.extensionAmount = extensionAmount;
    }

    public BigDecimal getInclusiveAmount() {
        return inclusiveAmount;
    }

    public void setInclusiveAmount(BigDecimal inclusiveAmount) {
        this.inclusiveAmount = inclusiveAmount;
    }
}
