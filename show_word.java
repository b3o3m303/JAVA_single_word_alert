//擷取專案ASIA ESCAPE 密室脫逃中的STORY

public class story extends AppCompatActivity {
    private TextView textView;
    private ImageButton imageButton;
    
    //逐一顯示的文字
    private String s = "就讀大一的威威回到家以後準備要就寢時，\n發現明天要期末報告的隨身碟好像掉在電腦教室裡了，\n回到教室的他發現門已經上鎖了，\n於是打算尋求警衛的幫助.....";
    
    private TiaoZiUtil tiaoziUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        imageButton = ((ImageButton) findViewById(R.id.imageButton));
        textView = ((TextView) findViewById(R.id.textView));
    
    //呼叫文字
        tiaoziUtil = new TiaoZiUtil(textView, s, 120);//呼叫逐字JAVA

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                imageButton.setVisibility(View.VISIBLE);

            }
        }, 9500);//間隔毫秒數



        //跳頁用按鈕
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(story.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

