package com.example.pizzarecipes;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {
    private TextView nom;
    private TextView description;
    private TextView preparation;
    private TextView ingredients;
    private ImageView image;
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        // fin elements
        nom=findViewById(R.id.nom);
        description=findViewById(R.id.description);
        preparation=findViewById(R.id.preparation);
        ingredients=findViewById(R.id.ingredients);
        image=findViewById(R.id.image);
        // récupérer données de Intent
        String productName = getIntent().getStringExtra("productName");
        String descriptionText = getIntent().getStringExtra("productDescription");
        String preparationText = getIntent().getStringExtra("productPreparation");
        String ingredientsText = getIntent().getStringExtra("productIngredients");
        int imageResource = getIntent().getIntExtra("productImage",0);

        // set elements dans View
        nom.setText(productName);
        description.setText(descriptionText);
        preparation.setText(preparationText);
        ingredients.setText(ingredientsText);
        image.setImageResource(imageResource);





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}