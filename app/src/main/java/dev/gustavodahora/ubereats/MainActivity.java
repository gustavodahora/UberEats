package dev.gustavodahora.ubereats;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dev.gustavodahora.ubereats.model.Categories;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Categories> listCategories = new ArrayList<>();
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));
        listCategories.add(new Categories(R.drawable.deals, R.string.deals));

        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(listCategories);

        RecyclerView rvCategories = findViewById(R.id.rv_categories);
        rvCategories.setLayoutManager(new LinearLayoutManager(
                getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,
                false));
        rvCategories.setAdapter(categoriesAdapter);
    }

    public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesViewHolder> {
        private final ArrayList<Categories> categories;

        public CategoriesAdapter(ArrayList<Categories> categories) {
            this.categories = categories;
        }

        @NonNull
        @Override
        public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CategoriesViewHolder(getLayoutInflater().inflate(R.layout.item_category, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {
            Categories item = categories.get(position);
            holder.bind(item);
        }

        @Override
        public int getItemCount() {
            return categories.size();
        }
    }

    public static class CategoriesViewHolder extends RecyclerView.ViewHolder {
        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Categories categories) {
            ImageView imgCategory = itemView.findViewById(R.id.img_category);
            TextView tvCategory = itemView.findViewById(R.id.tv_category);

            imgCategory.setImageResource(categories.getImageField());
            tvCategory.setText(categories.getTextField());
        }
    }
}