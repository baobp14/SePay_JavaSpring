**SETUP TRÊN SEPAY.VN**<br>
1.Đăng ký/Đăng nhậpTruy cập Sepay.vn, tạo tài khoản và kết nối ngân hàng .<br>
2.Tạo WebhookVào mục Cấu hình Webhook -> Thêm Webhook mới. (Cần lấy link ngrok hoặc gì khác miễn có link là được) Phải có link!<br>
<img width="1092" height="870" alt="image" src="https://github.com/user-attachments/assets/c97b56ec-7733-49e8-8bfe-16a2b8aa6acf" />
<img width="1104" height="826" alt="image" src="https://github.com/user-attachments/assets/d7a249d3-d30b-4603-9d6c-2c04f9a85211" />
Lưu ý:link phải có thêm đuôi là /api/sepay-callback. Ví dụ: https://denzel-unweeded-plaintively.ngrok-free.dev/api/sepay-callback<br>
**SETUP trên code.**<br>
1. File application.properties<br>
Đảm bảo cổng chạy trùng với cổng sếp mở trên Ngrok hoặc lúc demo.<br>
server.port=8082 <br>
spring.application.name=sepay-demo <br>
spring.thymeleaf.cache=false <br>
2. File PaymentController.java <br>
String bank = "VPB"; <br>
String accountNo = "0964310061";  <br>
String accountName = "PHAM LE GIA BAO"; <br>
