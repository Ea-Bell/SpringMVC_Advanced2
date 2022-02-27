package hello.proxy.app.v2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequestMapping
//@Controller 를 안쓰는이유는 component라서 스프링 컴포넌트 스캔에 걸려서 @Controller를 쓰지 않는다.
@ResponseBody
public class OrderControllerV2 {

    private final OrderServiceV3 orderService;

    public OrderControllerV2(OrderServiceV3 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/v2/request")
    public String request( String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @GetMapping("/v2/noLog")
    public String noLog(){
        return "ok";
    }
}
