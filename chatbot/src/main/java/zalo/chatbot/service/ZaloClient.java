package zalo.chatbot.service;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.vng.zalo.sdk.APIException;
import com.vng.zalo.sdk.oa.ZaloOaClient;

public class ZaloClient {
	
	private static ZaloOaClient client = new ZaloOaClient();
	private static String access_token = "BC4iJpY9dtWfoY97FeQITYd884KydPGpMhzuTaY0a4Cxa28iTzZAOcV10oW4m-9W4VeXD7hsaKSVwtKvKRsO3KU2BN1Diiv2F8Hz7qkeaN8VkISCR_JgQXda5mHRwEDp2VKr0ad8qKiUv1Ou0VNmRKAtC1CVa-Lb3jaH2dhNuLSu_ICdNioIRJ_O9YjCnUrbHj4cEYZVud5N_L0FDChdS43kD1Oi_TvZSkeu51dvwM9pvIye7TQJMtR8BZSd_lf5PjL69IgQfXLIhsTeE5WdUuK7E9IOUm";
	public static void sendTextMessage(String userId, String message) {
		
		Map<String, Object> params = new HashMap<>();
		params.put("access_token", access_token);
		
		JsonObject id = new JsonObject();
		id.addProperty("user_id", userId);
		 
		JsonObject text = new JsonObject();
		text.addProperty("text", message);
		 
		JsonObject body = new JsonObject();
		body.add("recipient", id);
		body.add("message", text);		 
		
		try {
			client.excuteRequest("https://openapi.zalo.me/v2.0/oa/message", "POST", params, body);
		} catch (APIException e) {
			e.printStackTrace();
		}
	}
}
