package com.munoz.cesar.ejemplo2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        //btn.setTextColor(Color.parseColor("#bdbdbd"));
        //btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        //btn.setTextColor(Color.MAGENTA);
        btn.setTextColor(Color.argb(125,0,0,125));
        btn.setBackgroundColor(Color.YELLOW);
        //btn.setTextSize(3);
        btn.setTypeface(null, Typeface.BOLD);
        btn.setTypeface(null, Typeface.ITALIC);

        btn.setText(getResources().getString(R.string.botonpulsar));


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Button btn = (Button) v;
                int color = btn.getCurrentTextColor();

                EditText txt = (EditText) findViewById(R.id.editText);
                //txt.setText("Hola Mundo");

                // txt.setText(String.valueOf(color));

               // float tamaño = btn.getTextSize();

                /*if(color == Color.BLUE){
                    txt.setText("Azul)");
                }*/

                /*Typeface tipo = btn.getTypeface();

                if(tipo.isBold()){
                    txt.setText("es negrita");
                }*/

                //txt.setVisibility(View.GONE);
                //txt.setVisibility(View.VISIBLE);

                //txt.setEnabled(false);

                //txt.setInputType(InputType.TYPE_CLASS_DATETIME);

                txt.setText("La bicicleta de Antonio es de color rojo");

               /* Editable ed = txt.getText();

                ed.setSpan(new StyleSpan(Typeface.BOLD), 5,9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                ed.setSpan(new ForegroundColorSpan(Color.BLUE), 11,14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                ed.setSpan(new AbsoluteSizeSpan(50), 16,20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/

                /*SpannableStringBuilder sb = new SpannableStringBuilder();

                sb.append("La bicicleta de Antonio es de color Rojo");
                sb.setSpan(new StyleSpan(Typeface.BOLD), 5, 9,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                sb.setSpan(new ForegroundColorSpan(Color.BLUE), 11,14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                sb.setSpan(new AbsoluteSizeSpan(50), 16,20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                txt.setText(sb);*/

               /* int inicio = txt.getSelectionStart();
                int fin = txt.getSelectionEnd();*/

               //txt.setSelection(5, 10);

               /* String[]dias=getResources().getStringArray(R.array.dias);
                String mensaje = "";
                for(int i = 0; i <dias.length; i++){
                    mensaje = mensaje + dias[i] + "-";
                }
                txt.setText(mensaje);*/

               /* int count = 1;

                String mensaje = getResources().getQuantityString(R.plurals.numeroCancionesPermitidas, count);

                txt.setText(mensaje);*/

               /* int velocidad = getResources().getInteger(R.integer.max_speed);

                txt.setText(velocidad);*/

                int[] valores = getResources().getIntArray(R.array.valores);


            }
        });
    }
}
