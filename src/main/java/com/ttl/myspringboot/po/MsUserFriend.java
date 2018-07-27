package com.ttl.myspringboot.po;

public class MsUserFriend extends MsUserFriendKey {
    private Byte friendStatus;

    public Byte getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(Byte friendStatus) {
        this.friendStatus = friendStatus;
    }
}