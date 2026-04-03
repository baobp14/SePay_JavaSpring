package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WebhookController {

    // "Cuốn sổ cái" để ghi nhớ trạng thái: OrderId -> Đã thanh toán hay chưa?
    public static Map<String, Boolean> paymentStatus = new ConcurrentHashMap<>();

    // 1. Cổng nhận tiền (Cho Sepay/Postman gọi vào)
    @PostMapping("/sepay-callback")
    public String handle(@RequestBody PaymentDTO data) {
        String orderId = data.getContent().trim(); // Thêm .trim() vào đây sếp nhé

        // Ghi vào sổ: Đơn này đã trả tiền rồi!
        paymentStatus.put(orderId, true);

        System.out.println("✅ Đã nhận tiền cho đơn: " + orderId);
        return "OK";
    }

    // 2. Cổng check tiền (Cho trang HTML gọi vào để hỏi: "Thanh toán chưa?")
    @GetMapping("/check-status/{orderId}")
    public Boolean checkStatus(@PathVariable String orderId) {
        // Duyệt qua toàn bộ danh sách các sớ tiền về đã nhận
        for (String receivedContent : paymentStatus.keySet()) {
            // Nếu trong cái sớ dài dằng dặc đó có chứa cái mã đơn sếp cần tìm
            if (receivedContent.toLowerCase().contains(orderId.toLowerCase())) {
                return true; // Khớp rồi, báo Thành công thôi!
            }
        }
        return false;
    }
}