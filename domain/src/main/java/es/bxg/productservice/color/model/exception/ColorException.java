package es.bxg.productservice.color.model.exception;

public class ColorException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private String errorMessage;

  public ColorException() {
  }

  public ColorException(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}