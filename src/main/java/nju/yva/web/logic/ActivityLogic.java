package nju.yva.web.logic;

import nju.yva.web.data.ActivityDetail;
import nju.yva.web.data.RefusedActivity;
import nju.yva.web.data.VoluntaryActivity;

import java.util.List;

/**
 * Created by Water on 2017/8/11.
 */
public interface ActivityLogic {
    /**
     * 收藏志愿活动
     *
     * @param id         用户的id
     * @param activityId 活动的id
     * @return
     */
    boolean starVoluntaryActivity(String id, String activityId);


    /**
     * 取消收藏志愿活动
     *
     * @param id         用户的id
     * @param activityId 活动的id
     * @return
     */
    boolean unstarVoluntaryActivity(String id, String activityId);


    /**
     * 查看已收藏志愿活动
     *
     * @param id 用户的id
     * @return 返回该用户已收藏的志愿活动列表
     */
    List<VoluntaryActivity> getStaredVoluntaryrActivities(String id);


    /**
     * 查看某志愿详细信息
     *
     * @param activityId 活动id
     * @return 返回活动的详细信息
     */
    ActivityDetail getActivityDetail(String activityId);


    /**
     * 查看不通过的志愿活动和理由
     *
     * @param id 用户id
     * @return 返回所有被拒的活动和理由（在RefusedActivity类里）
     */
    List<RefusedActivity> getRefusedActivities(String id);


    /**
     * 报名志愿活动
     *
     * @param id         用户id
     * @param activityId 活动id
     * @return
     */
    boolean joinActivity(String id, String activityId);


    /**
     * 取消报名志愿活动
     *
     * @param id         用户id
     * @param activityId 活动id
     * @return
     */
    boolean disjoinActivity(String id, String activityId);


    /**
     * 查看已报名未通过的志愿
     *
     * @param id 用户id
     * @return
     */
    List<VoluntaryActivity> getSignedUpVoluntaryActivities(String id);


    /**
     * 查看通过报名的志愿活动
     *
     * @param id 用户id
     * @return
     */
    List<VoluntaryActivity> getAcceptVoluntaryActivities(String id);


    /**
     * 查看所有志愿活动
     *
     * @return
     */
    List<VoluntaryActivity> getAllVoluntaryActivities();


    /**
     * 评论已参加的志愿活动
     *
     * @param id         用户id
     * @param activityId 活动id
     * @param comment    评价内容
     * @return
     */
    boolean makeComment(String id, String activityId, String comment);
}
