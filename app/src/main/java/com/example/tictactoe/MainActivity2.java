package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
     public int ch=1,turn =0;
     TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,res,res1;
     Boolean ans = false,ans1;
     Button check ;

     int [] arr={-1,-2,-3,-4,-5,-6,-7,-8,-9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

       b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        res = findViewById(R.id.res);
        res1 = findViewById(R.id.res1);

        /*check = findViewById(R.id.button2);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int i=0;i<9;i++)
                {
                    String s = Integer.toString(arr[i]);
                    Toast.makeText(MainActivity2.this, s, Toast.LENGTH_SHORT).show();
                }
            }
        });*/




   b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b1.setText("X");
                    arr[0] = 1;
                } else if (ch == -1) {
                    b1.setText("O");
                    arr[0] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {

                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    }  if(ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                    else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                    {
                        ans = true;
                        turn =9;
                        if(ch<0)
                        {
                            res1.setText("Congratulations!!..X player has won the game!!");
                            ans1= true;
                        }
                        if(ch>0)
                        {
                            res1.setText("Congratulations!!..O player has won the game!!");
                            ans1 = false;
                        }
                    }
                    else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    openwind();
                    res.setText("Game Finished!!");
                }
                else
                {
                    openwind();
                    res.setText("Game Finished!!");
                }
            }
        }
    });
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b2.setText("X");
                    arr[1] = 1;
                } else if (ch == -1) {
                    b2.setText("O");
                    arr[1] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;

                    if(ch<0){
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    }

                    if(ch>0){
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                   // Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                   if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }


    });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");
            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b3.setText("X");
                    arr[2] = 1;
                } else if (ch == -1) {
                    b3.setText("O");
                    arr[2] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                  if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b4.setText("X");
                    arr[3] = 1;
                } else if (ch == -1) {
                    b4.setText("O");
                    arr[3] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b5.setText("X");
                    arr[4] = 1;
                } else if (ch == -1) {
                    b5.setText("O");
                    arr[4] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    b6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b6.setText("X");
                    arr[5] = 1;
                } else if (ch == -1) {
                    b6.setText("O");
                    arr[5] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }
    });
    b7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b7.setText("X");
                    arr[6] = 1;
                } else if (ch == -1) {
                    b7.setText("O");
                    arr[6] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    b8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b8.setText("X");
                    arr[7] = 1;
                } else if (ch == -1) {
                    b8.setText("O");
                    arr[7] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                   // Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[3]==arr[2]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    b9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(turn==8&&!ans)
                res.setText("Game Tied!!!Try Again...");

            if (turn < 9 && !ans) {
                if (ch == 1) {
                    b9.setText("X");
                    arr[8] = 1;
                } else if (ch == -1) {
                    b9.setText("O");
                    arr[8] = 0;
                }
                ch *= -1;
                turn++;
                if (ch > 0&&turn<8)
                    res.setText("X's Turn");
                else if(ch<0&&turn<8)
                    res.setText("O's Turn");
                if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8])){  //Row{
                    ans = true;
                    turn = 9;
                    if (ch<0) {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1 = true;
                    } if (ch>0) {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                    //Toast.makeText(MainActivity2.this, "Game finished", Toast.LENGTH_SHORT).show();
                }
                else if((arr[0]==arr[3]&&arr[3]==arr[6])||(arr[1]==arr[4]&&arr[4]==arr[7])||(arr[2]==arr[5]&&arr[5]==arr[8])) //Column
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }
                else if((arr[0]==arr[4]&&arr[4]==arr[8])||(arr[2]==arr[4]&&arr[4]==arr[6]))
                {
                    ans = true;
                    turn =9;
                    if(ch<0)
                    {
                        res1.setText("Congratulations!!..X player has won the game!!");
                        ans1= true;
                    }
                    if(ch>0)
                    {
                        res1.setText("Congratulations!!..O player has won the game!!");
                        ans1 = false;
                    }
                }


            }
            if(ans) {
                if (ans1)
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
                else
                {
                    res.setText("Game Finished!!");
                    openwind();
                }
            }
        }

    });
    }
    public void openwind()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity2.this,Pop.class);
                startActivity(intent);
            }
        },500);

    }
}