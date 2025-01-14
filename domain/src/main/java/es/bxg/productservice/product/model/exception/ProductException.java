package es.bxg.productservice.product.model.exception;

public class ProductException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private String errorMessage;

  public ProductException() {
  }

  public ProductException(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}