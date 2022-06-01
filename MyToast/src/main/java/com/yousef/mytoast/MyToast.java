package com.yousef.mytoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class MyToast {

    public static final int LONG = Toast.LENGTH_LONG;
    public static final int SHORT = Toast.LENGTH_SHORT;

    public static void setToast(Context context, String text, int duration, int icon, int backgroundColor){
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View view = LayoutInflater.from(context).inflate(R.layout.item_toast, null, false);
        CardView toastCard =view.findViewById(R.id.toastCard);
        TextView toastText=view.findViewById(R.id.toastText);
        ImageView toastImage = view.findViewById(R.id.toastImage);

        toastCard.setCardBackgroundColor(backgroundColor);
        toastText.setText(text);
        toastImage.setImageResource(icon);

        toast.setView(view);
        toast.show();
    }
}
