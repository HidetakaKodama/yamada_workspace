//①お決まりのインポート文（Eclipseでサーブレットクラスを作成すると自動で書いてくれる）
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//②サーブレットクラスを作るにはサーブレットクラスの元になるHttpServletクラスを継承する必要がある。
public class Sample extends HttpServlet{
    //③サーブレットクラスがGETで呼ばれた場合のdoGetメソッドをオーバーライドする。書き方は基本このお決まりの書き方になる。
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            //処理を書く

    }
    //④サーブレットクラスがPOSTで呼ばれた場合のdoPostメソッドをオーバーライドする。書き方は基本このお決まりの書き方になる。
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            //処理を書く

    }

}
