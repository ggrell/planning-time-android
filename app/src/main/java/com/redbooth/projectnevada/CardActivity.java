package com.redbooth.projectnevada;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.redbooth.projectnevada.model.CardModel;


public class CardActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_demo_layout);

        CardModel card = new CardModel.Builder()
                                .setUpwardResourceId(R.drawable.card_upward_ping_pong)
                                .setDownwardResourceId(R.drawable.card_downward)
                                .setStatus(CardModel.CardStatus.DOWNWARDS)
                                .build();
        final com.redbooth.projectnevada.widgets.CardView cardView1
                = (com.redbooth.projectnevada.widgets.CardView)findViewById(R.id.card1);
        final com.redbooth.projectnevada.widgets.CardView cardView2
                = (com.redbooth.projectnevada.widgets.CardView)findViewById(R.id.card2);
        final com.redbooth.projectnevada.widgets.CardView cardView3
                = (com.redbooth.projectnevada.widgets.CardView)findViewById(R.id.card3);
        final com.redbooth.projectnevada.widgets.CardView cardView4
                = (com.redbooth.projectnevada.widgets.CardView)findViewById(R.id.card4);
        cardView1.setCard(card);
        cardView2.setCard(card);
        cardView3.setCard(card);
        cardView4.setCard(card);
    }
}
