package pers.kinson.wechat.logic.chat.message.req;

import io.netty.buffer.ByteBuf;
import pers.kinson.wechat.net.CmdConst;
import pers.kinson.wechat.net.message.AbstractPacket;

public class ReqChatToGroup extends AbstractPacket {
	
	private long toUserId;
	
	private String content;
	
	public long getToUserId() {
		return toUserId;
	}

	public void setToUserId(long toUserId) {
		this.toUserId = toUserId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void writeBody(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readBody(ByteBuf buf) {
		this.toUserId = buf.readLong();
		this.content = readUTF8(buf);
	}

	@Override
	public int getPacketType() {
		return CmdConst.ReqChatToGroup;
	}

}
