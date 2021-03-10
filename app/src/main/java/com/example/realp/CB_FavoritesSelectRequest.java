package com.example.realp;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CB_FavoritesSelectRequest extends StringRequest {
    final static  private String URL="http://tmdgus95p.dothome.co.kr/CoBoardFavoritesSelect.php";
    private Map<String,String> map;

    public CB_FavoritesSelectRequest(int cNum, String userID, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);//위 url에 post방식으로 값을 전송

        map=new HashMap<>();
        map.put("cNum",cNum+"");
        map.put("userID",userID);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
