package com.example.demo.modules.juhe.stock.vo;

public class StockResponse {
    private String error_code;
    private String reason;
    private StockResult result;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public StockResult getResult() {
        return result;
    }

    public void setResult(StockResult result) {
        this.result = result;
    }
}
