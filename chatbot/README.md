
# Tạo Official Account (OA)

Để thực hiện cấu hình cho OA bạn phải là admin của OA đó. Nếu bạn chưa có OA, đăng ký tạo OA mới . Lưu ý chọn loại OA cửa hàng để sử dụng trong mục tutorial này. https://oa.zalo.me/manage/oa?option=create
# Tạo một Ứng dụng để liên kết với Official Account
# Liên kết Ứng dụng với Official Account

Chọn ứng dụng mà bạn vừa tạo ở góc trên bên phải của trang https://developers.zalo.me/.
Trong menu bên trái, chọn Official Account, sau đó chọn Official Account mà bạn muốn liên kết và nhấn “Liên kết”.

# Tạo Official Account Access Token
# Cấu hình Webhook
## Sử dụng ngrok để tạo 1 https public webhook mà forward đến localhost (ví dụ https://f573fe4d.ngrok.io/webhook)
## Dựng server trên cổng 8080

```
git clone https://github.com/tecknovice/spring-boot
cd chatbot
```
### Thêm zalo SDK vào thư mục libs
https://github.com/zaloplatform/zalo-java-sdk
### Update access token trong code
### Chạy webhook
```
./mvnw spring-boot:run
```
# Vào https://oa.zalo.me/manage/profile lấy QR code hoặc link đến OA
# Chat
