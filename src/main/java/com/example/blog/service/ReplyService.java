package com.example.blog.service;

import com.example.blog.entity.Reply;
import java.util.List;

public interface ReplyService {

    List<Reply> getRepliesOfTopic(Integer topicId);

    boolean addReply(Reply reply);

    int repliesNum(Integer topicId);
}
