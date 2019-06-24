package me.maiz.cloud.cloudlandscape.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean success;

    private  String message;

    private Object data;

    public static Result success(Object data){
        return new Result(true,"成功",data);
    }

    public static Result success(){
        return success(null);
    }



}
