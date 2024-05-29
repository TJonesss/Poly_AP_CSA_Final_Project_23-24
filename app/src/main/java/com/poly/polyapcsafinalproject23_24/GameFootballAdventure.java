package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

protected void run() {
    setContentView(R.layout.activity_game_4_button);
}


import java.util.Scanner;

public class GameFootballAdventure extends GameActivity {

public class Adventure{

    //instance variables
    //   variables you plan to use throughout the adventure
    private boolean isWon;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        private TextView tvTitle, tvSubtitle, tvStoryText;
        private ImageView ivStory;
        private Button btn1, btn2, btn3, btn4;
        private boolean isWon;
        private int numLives;

        @Override
        protected void run() {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        tvTitle.setText("You are the QB");
        tvSubtitle.setText("Make the right plays");

        numLives = 4;
        start();

    }

    private void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.you_are_qb);


        tvStoryText.setText("You are in an important game you have to decide the right plays to win the game.What play are you going to run first?");

        setAllBtnsVisible();
        btn1.setText("Run play");
        btn2.setText("Pass play ");
        btn3.setText("Scramble and run");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runPlay();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passPlay();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrambleAndRun();
            }
        });
    }

    }

    //________RUN PLAY________
    private void runPlay()
    {


        tvStoryText.setText("What would you like to do at the beach?");

        setAllBtnsVisible();
        btn1.setText("Run outside");
        btn2.setText("Run up the middle");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOutside();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                middle();
            }
        });
    }
    private void runOutside()
    {

        tvStoryText.setText("You see a defender what do?");



        setAllBtnsVisible();
        btn1.setText("Juke him");
        btn2.setText("Truck him");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jukeHim();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                truckHim();
            }
        });

    }
    private void jukeHim()
    {

        isWon = true;
        tvStoryText.setText("The defender falls, and you get a big gain.");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }
    private void truckHim()
    {

        tvStoryText.setText("You truck him and gets injured, your team loses the game without you. Game over");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void middle()
    {

        tvStoryText.setText("You break through and see a defender what do you do?");

        ivStory.setImageResource(R.drawable.im_laborday_arrive_at_beach);

        setAllBtnsVisible();
        btn1.setText("Hurdle him");
        btn2.setText("Spin move");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hurdleHim();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinMove();
            }
        });
    }
    private void hurdleHim()
    {

        isWon = false;
        tvStoryText.setText("You thought you were superman? You get flipped in the air. Game over");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void spinMove()
    {
        isWon = false;
        tvStoryText.setText("You are tackled mid spin and fumble. Game over");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });

    }
    //________PASS PATH________
    private void passPlay()
    {

        tvStoryText.setText("What type of pass play would you do?");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Post");
        btn2.setText("Fade");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fade();
            }
        });
    }
    private void post()
    {

        tvStoryText.setText("A blitz is coming. Do you roll out and pass or roll out and run?");

        ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Roll out and pass");
        btn2.setText("Roll out and run");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run();
            }
        });
    }
    private void pass()
    {

        isWon = true;
        tvStoryText.setText("The receiver catches it , and scores, congrats. You win.");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void run()
    {

        isWon = false;
        tvStoryText.setText("You get hit hard and fumble. Game over");

        ivStory.setImageResource(R.drawable.);


        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });


    }
    private void fade()
    {

        isWon = false;
        tvStoryText.setText("Bad idea, the ball gets picked off. Game over.");

        ivStory.setImageResource(R.drawable.);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    //________RESTAURANT PATH________
    private void goToRestaurant()
    {
        double chance = Math.random();
        if (chance < 0.5)
        {
            isWon = true;
            tvStoryText.setText("You go to the restaurant. The food is very good. But you forgot your wallet. They totally understand, free meal, you win.");
            ivStory.setImageResource(R.drawable.im_laborday_free_meal);


        }
        else
        {
            isWon = false;
            tvStoryText.setText("You go to the restaurant. The food is aweful, you wasted your time and hard earned money\nGame over.");
            ivStory.setImageResource(R.drawable.im_laborday_bad_food);
        }

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    //________SCRAMBLE PATH________
    private void scrambleAndRun()
    {
        double chance = Math.random();
        if (chance < 0.5)
        {
            isWon = true;
            tvStoryText.setText("You scramble and run and and juke multiple defenders like Lamar Jackson and score. You win.");
            ivStory.setImageResource(R.drawable.l);


        }
        else
        {
            isWon = false;
            tvStoryText.setText("You scramble thinking your Lamar Jackson and get hit and fumble\nGame over.");
            ivStory.setImageResource(R.drawable.);
        }

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void end()
    {
        if (isWon)
        {
            tvStoryText.setText("You won your high school championship game!");

            ivStory.setImageResource(R.drawable.);
        }
        else
        {
            numLives--;
            String text = "You lost your last high school game. You have " + numLives + " years remaining";
            tvStoryText.setText(text);
        }

        if (numLives > 0)
        {
            btn1.setText("Play again!");
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start();
                }
            });
        }
        else
        {
            tvStoryText.setText("The season is over. Permenant Game over.");
            btn1.setText("Back to menu");

            ivStory.setImageResource(R.drawable.);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameFootballAdventure.this, MainActivity.class));
                }
            });
        }
    }
    }
}