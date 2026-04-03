package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaymentController {


    @GetMapping("/")
    public String showInputPage() {
        return "input";
    }


    @PostMapping("/generate-qr")
    public String generateQR(@RequestParam Double amount,
                             @RequestParam String description,
                             Model model) {

        String bank = "VPB";
        String accountNo = "0964310061"; 
        String accountName = "PHAM LE GIA BAO";


        String qrUrl = String.format("https://img.vietqr.io/image/%s-%s-compact2.png?amount=%.0f&addInfo=%s&accountName=%s",
                bank, accountNo, amount, description, accountName);

        model.addAttribute("qrUrl", qrUrl);
        model.addAttribute("amount", amount);
        model.addAttribute("orderId", description);

        return "pay";
    }
}
