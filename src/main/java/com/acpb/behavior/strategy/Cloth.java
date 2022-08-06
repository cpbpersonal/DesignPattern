package com.acpb.behavior.strategy;

public class Cloth {
    /**
     * 衣服状态, false为脏  true为干净
     */
    private boolean status;

    public Cloth(boolean status) {
        this.status=status;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
