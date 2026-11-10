package com.example.e_commerce;

public class ProductRepository {

    private static final Product[] PRODUCTS = {
            new Product(1, "Áo thun cotton basic", "Thời trang", 189000,
                    "Áo thun cotton 100% mềm mịn, thấm hút mồ hôi tốt, form regular dễ phối đồ. Phù hợp mặc hằng ngày, đi làm hoặc đi chơi.",
                    "👕", 0xFFE3F2FD),
            new Product(2, "Giày sneaker trắng", "Giày dép", 890000,
                    "Giày sneaker trắng thiết kế tối giản, đế cao su êm ái và chống trượt. Dễ phối với quần jean, quần short hay váy.",
                    "👟", 0xFFFFF3E0),
            new Product(3, "Balo laptop chống nước", "Phụ kiện", 459000,
                    "Balo vải chống nước, ngăn đệm chống sốc cho laptop đến 15.6 inch, nhiều ngăn phụ tiện lợi, quai đeo êm vai.",
                    "🎒", 0xFFE8F5E9),
            new Product(4, "Đồng hồ thông minh", "Công nghệ", 1790000,
                    "Đồng hồ thông minh theo dõi nhịp tim, giấc ngủ và số bước chân. Màn hình sáng rõ, pin dùng liên tục khoảng 7 ngày.",
                    "⌚", 0xFFEDE7F6),
            new Product(5, "Tai nghe Bluetooth", "Công nghệ", 690000,
                    "Tai nghe không dây kết nối Bluetooth 5.3, chống ồn chủ động, âm bass mạnh. Hộp sạc cho tổng thời gian nghe đến 24 giờ.",
                    "🎧", 0xFFFCE4EC),
            new Product(6, "Kính mát phân cực", "Phụ kiện", 320000,
                    "Tròng kính phân cực giảm chói, chống tia UV400. Gọng nhẹ, bền, phù hợp khi lái xe hoặc đi biển.",
                    "🕶️", 0xFFE0F7FA),
            new Product(7, "Bình giữ nhiệt inox", "Gia dụng", 245000,
                    "Bình inox 304 dung tích 500ml, giữ nóng 12 giờ và giữ lạnh 24 giờ. Nắp kín, không rò rỉ khi bỏ vào balo.",
                    "🥤", 0xFFFFFDE7),
            new Product(8, "Sạc dự phòng 10000mAh", "Công nghệ", 390000,
                    "Pin dự phòng dung lượng 10000mAh, hỗ trợ sạc nhanh 20W, có 2 cổng ra và 1 cổng vào. Thiết kế nhỏ gọn bỏ vừa túi áo.",
                    "🔋", 0xFFF1F8E9),
            new Product(9, "Mũ lưỡi trai", "Thời trang", 129000,
                    "Mũ lưỡi trai vải kaki thoáng mát, khóa điều chỉnh phía sau vừa với nhiều vòng đầu. Che nắng tốt khi đi ngoài trời.",
                    "🧢", 0xFFFFEBEE),
            new Product(10, "Bàn phím cơ", "Công nghệ", 1250000,
                    "Bàn phím cơ layout gọn 87 phím, switch êm, đèn nền LED nhiều chế độ. Kết nối dây USB-C, keycap PBT bền màu.",
                    "⌨️", 0xFFE8EAF6)
    };

    public static Product[] getAll() {
        return PRODUCTS;
    }

    public static Product findById(int id) {
        for (Product product : PRODUCTS) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
