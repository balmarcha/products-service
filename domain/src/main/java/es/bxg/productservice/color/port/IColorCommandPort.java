package es.bxg.productservice.color.port;

import es.bxg.commonlib.port.IGenericCommandPort;
import es.bxg.productservice.color.model.pojo.ColorPojo;

public interface IColorCommandPort extends IGenericCommandPort<ColorPojo, Long> {
}
