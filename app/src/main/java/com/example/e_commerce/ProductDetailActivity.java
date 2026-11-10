package com.example.e_commerce;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PRODUCT_ID = "extra_product_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_product_detail);
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(true);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView tvBack = findViewById(R.id.tvBack);
        TextView tvIcon = findViewById(R.id.tvIcon);
        TextView tvCategory = findViewById(R.id.tvCategory);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvPrice = findViewById(R.id.tvPrice);
        TextView tvDescription = findViewById(R.id.tvDescription);
        Button btnAddToCart = findViewById(R.id.btnAddToCart);

        tvBack.setOnClickListener(v -> finish());

        int productId = getIntent().getIntExtra(EXTRA_PRODUCT_ID, -1);
        Product product = ProductRepository.findById(productId);

        if (product != null) {
            tvIcon.setText(product.getIcon());
            tvIcon.setBackgroundColor(product.getColor());
            tvCategory.setText(product.getCategory());
            tvName.setText(product.getName());
            tvPrice.setText(product.getFormattedPrice());
            tvDescription.setText(product.getDescription());

            btnAddToCart.setOnClickListener(v ->
                    Toast.makeText(ProductDetailActivity.this, "Đã thêm " + product.getName() + " vào giỏ hàng!", Toast.LENGTH_SHORT).show()
            );
        } else {
            Toast.makeText(this, "Không tìm thấy sản phẩm!", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
