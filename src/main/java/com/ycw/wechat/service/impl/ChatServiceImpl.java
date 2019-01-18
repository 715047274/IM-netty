package com.ycw.wechat.service.impl;

import com.ycw.wechat.mapper.ChatMsgMapper;
import com.ycw.wechat.pojo.ChatMsg;
import com.ycw.wechat.pojo.DataResult;
import com.ycw.wechat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yuchunwei
 */
@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatMsgMapper msgMapper;

    @Override
    public DataResult queryUnReadMsgs(String acceptUserId) {
        List<ChatMsg> chatMsgs = msgMapper.getUnReadMsgList(acceptUserId);
        return DataResult.ok(chatMsgs);
    }

    @Override
    public int insertMsg(ChatMsg msg) {
       return msgMapper.insertMsg(msg);
    }
}