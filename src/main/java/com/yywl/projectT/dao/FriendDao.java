package com.yywl.projectT.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yywl.projectT.dmo.FriendDmo;

public interface FriendDao extends JpaRepository<FriendDmo, Long> {

	FriendDmo findByOwner_IdAndFriend_Id(Long ownerId, Long friendId);

	List<FriendDmo> findByOwner_IdOrderByPointDesc(Long userId);

	boolean existsByOwner_IdAndFriend_Id(Long userId, Long id);

	List<FriendDmo> findByOwner_IdAndFriend_IdIn(Long id, List<Long> friendIds);

	List<FriendDmo> findByOwner_IdAndPointNotOrderByPointDesc(Long userId, double d);


}
