Lỗi 404 cho Tài nguyên tĩnh (Static Resources): Nếu đặt ảnh bác sĩ ở thư mục src/main/java hoặc đặt sai cấp trong thư
mục static, Spring Boot sẽ không thể tìm thấy ảnh.

Lỗi Xung đột Port (Port Conflict): Nếu không cấu hình server.port=8081 mà máy đang chạy ứng dụng khác (như bài BT4 cũ) ở
port 8080, ứng dụng sẽ báo lỗi Address already in use và bị dừng ngay lập tức.

Lỗi Dependency (Build Error): Nếu thiếu spring-boot-starter-web trong build.gradle, các Annotation như @RestController,
@Service sẽ bị báo đỏ và không thể biên dịch.