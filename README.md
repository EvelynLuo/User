# Bridge: 北邮留学服务信息咨询管理平台  
Java EE小学期用。  

## 页面与功能  
预想更新路线。  
### Version 0.1  
- 用户  
  - 个人主页  
    - 展示个人信息  
    - 关联链接：发表过的分享  
  - 编辑页面  
    - 编辑个人信息  
    - 关联链接：发表的分享  
  - 检索结果页  
    - 展示对用户名进行检索后的结果  
    - 链接至个人主页  

##内容
- entity ✔
  - User 映射实体 
    - 列名
	- get()
	- set()
- ejb
  - ConfigUserBean 例子初始化数据库
  - UserRequestBean 状态会话
    - @PersistenceContext
       private EntityManager em;
    - createUser(列名)
	- getUsers():Collection<User>
	- getUser(检索)
	- 编辑个人信息
	**Version 2.0**
	**关注用户followUser->updateFollowList**
	**收藏分享**
	**管理员删除用户**
- exception
  - UserNotFoundException 找不到用户异常
- listeners
  - ActionEvent
  - ActionListener 
  - ValueChangeListener
- web.mangagedbeans
  - UserDetailBean 动态变化
  - UserstoreBean 是一个backingbean for /userstore.xhtml/
  
	
	