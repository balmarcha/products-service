package es.bxg.productservice.category.model.exception;

public class CategoryException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private String errorMessage;

  public CategoryException() {
  }

  public CategoryException( String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}