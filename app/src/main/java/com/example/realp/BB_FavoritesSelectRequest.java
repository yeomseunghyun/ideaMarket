package com.example.realp;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class BB_FavoritesSelectRequest extends StringRequest {
    //서버 url 설정(php파일 연동)
    final static  private String URL="http://tmdgus95p.dothome.co.kr/BuyBoardFavoritesSelect.php";
    private Map<String,String> map;

    public BB_FavoritesSelectRequest(int bsNum, String userID, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);//위 url에 post방식으로 값을 전송

        map=new HashMap<>();
        map.put("bsNum",bsNum+"");
        map.put("userID",userID);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
