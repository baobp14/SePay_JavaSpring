SETUP TRÊN SEPAY.VN. Để tiền từ ngân hàng thật bắn về được code thì cần một cái "cầu" nối từ Internet vào cái localhost của sếp.BướcHành độngChi tiết
1.Đăng ký/Đăng nhậpTruy cập Sepay.vn, tạo tài khoản và kết nối ngân hàng .
2.Tạo WebhookVào mục Cấu hình Webhook -> Thêm Webhook mới. (Cần lấy link ngrok hoặc gì khác miễn có link là được) Phải có link!
<img width="1092" height="870" alt="image" src="https://github.com/user-attachments/assets/c97b56ec-7733-49e8-8bfe-16a2b8aa6acf" />
<img width="1104" height="826" alt="image" src="https://github.com/user-attachments/assets/d7a249d3-d30b-4603-9d6c-2c04f9a85211" />
Lưu ý:link phải có thêm đuôi là /api/sepay-callback. Ví dụ: https://denzel-unweeded-plaintively.ngrok-free.dev/api/sepay-callback




4.Cấu hình Bảo mậtTại ô API Key (Authorization).

5.Kiểm traBấm nút "Test gửi dữ liệu" để xem IntelliJ có nhảy log không.
