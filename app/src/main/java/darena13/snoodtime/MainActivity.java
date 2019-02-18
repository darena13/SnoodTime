package darena13.snoodtime;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "KnitThisScheme";

    private KnittingPattern knittingPattern;
    private int projectId;
    private Integer patternId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final DrawView drawView = new DrawView(this);
        setContentView(drawView);

        //получаем из интента
        projectId = 0;
        //из БД получаем id узора по id проекта
        patternId = ProjectDAO.getPatternId(projectId);
        //получаем узор
        knittingPattern = DefaultKnittingPatterns.INSTANCE.get(patternId);
    }

    class DrawView extends View {
        Point startPoint = new Point(0, 0);
        Direction direction = null;

        public DrawView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            final float eventX = event.getX();
            final float eventY = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    //запоминаем координаты начала вектора
                    startPoint.set((int) eventX, (int) eventY);
                    return true;
                case MotionEvent.ACTION_MOVE:

                    break;
                case MotionEvent.ACTION_UP:

                    break;
                default:
                    return false;
            }

            invalidate();
            return true;
        }
    }
}
