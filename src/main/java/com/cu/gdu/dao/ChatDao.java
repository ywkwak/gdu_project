package com.cu.gdu.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.cu.gdu.dto.AttachDto;
import com.cu.gdu.dto.ChatDto;
import com.cu.gdu.dto.ChatRoomDto;
import com.cu.gdu.dto.MemberDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ChatDao {

	private final SqlSessionTemplate sqlSessionTemplate;
	
	public int createChatRoom() {
		return sqlSessionTemplate.insert("chatMapper.insertChatRoom");
	}
	
	public int insertChatMem(int memNo) {
		return sqlSessionTemplate.insert("chatMapper.insertChatMem", memNo);
	}
	
	public List<ChatRoomDto> selectChatRoomList(int memNo){
		return sqlSessionTemplate.selectList("chatMapper.selectChatRoomList", memNo);
	}
	
	public int getLastChatRoomNo() {
		return sqlSessionTemplate.selectOne("chatMapper.getLastChatRoomNo");
	}
	
	public int insertMessage(ChatDto ch) {
		return sqlSessionTemplate.insert("chatMapper.insertMessage", ch);
	}
	
	public List<ChatDto> selectChatList(int chroNo){
		return sqlSessionTemplate.selectList("chatMapper.selectChatList", chroNo);
	}
	
	public int updateMessage(ChatDto ch) {
		return sqlSessionTemplate.update("chatMapper.updateMessage", ch);
	}
	
	public int addMemChatRoom(ChatDto ch) {
		return sqlSessionTemplate.insert("chatMapper.insertAddMem", ch);
	}
	
	public List<MemberDto> selectChatRoomMem(int chroNo){
		return sqlSessionTemplate.selectList("chatMapper.selectChatRoomMem", chroNo);
	}
	
	public int insertChatFile(AttachDto at) {
		return sqlSessionTemplate.insert("chatMapper.insertChatFile", at);
	}
	
	public List<AttachDto> selectChatFiles(int refNo){
		return sqlSessionTemplate.selectList("chatMapper.selectChatFiles", refNo);
	}
	
	
	
}
