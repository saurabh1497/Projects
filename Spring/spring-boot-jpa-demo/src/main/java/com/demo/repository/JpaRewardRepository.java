package com.demo.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.entities.Reward;


@Repository("jpareward")
//@Transactional
public class JpaRewardRepository implements RewardRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addReward(Reward reward) throws SQLException {
		// TODO Auto-generated method stub
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
		em.persist(reward);
//		tx.commit();
	}

	@Override
	public int getTotalRewardAmount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		List<Reward> reward = (List<Reward>) em.find(Reward.class, accountNumber);
		int total=0;
		for(Reward r: reward)
		{
			total = r.getRewardAmount() + total;
		}
		return total;
	}

	@Override
	public List<Reward> getAllRewardsForAccount(Long accountNUmber) throws SQLException {
		// TODO Auto-generated method stub
		List<Reward> reward = (List<Reward>) em.find(Reward.class, accountNUmber);
		
		return reward;
	}

}
