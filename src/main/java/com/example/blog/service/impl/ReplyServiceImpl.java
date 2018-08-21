package com.example.blog.service.impl;

import com.example.blog.dao.mapper.ReplyMapper;
import com.example.blog.entity.Reply;
import com.example.blog.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    public ReplyMapper replyDao;

    public List<Reply> getRepliesOfTopic(Integer topicId) {
        return replyDao.getRepliesOfTopic(topicId);
    }

    public boolean addReply(Reply reply) {
        return replyDao.insert(reply)>0;
    }

    public int repliesNum(Integer topicId) {
        return replyDao.getRepliesNum(topicId);
    }
}
