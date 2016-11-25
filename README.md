##RowView
仿微信设置界面的自定义View，


##功能

* 设置界面通用的 UI 配置方法
	* 带开关的
	* 普通的
	* 带图片的
* 每一行都是一个RowView
* ContainerView -> GroupView -> RowView 

![配置后的效果图](http://d.hiphotos.baidu.com/exp/w=480/sign=55ef14b50d7b02080cc93ee952d8f25f/6a600c338744ebf821a5582fdef9d72a6159a7cd.jpg)




##使用方法

    ArrayList<GroupDescriptor> groupDescriptors = new ArrayList<>();

        GroupDescriptor group1 = new GroupDescriptor();
        group1.addDescriptor(new ProfileRowDescriptor(R.string.row_profile)
                        .avatarUrl("")
                        .label("沈阳")
                        .detailLabel("微信号: White212")
                        .hasAction(true));
        groupDescriptors.add(group1);

        GroupDescriptor group2 = new GroupDescriptor();
        group2.addDescriptor(new NormalRowDescriptor(R.string.row_mypost)
                .iconResId(R.drawable.more_my_album)
                .label(getString(R.string.row_mypost))
                .hasAction(true));
        group2.addDescriptor(new NormalRowDescriptor(R.string.row_favorites)
                .iconResId(R.drawable.more_my_favorite)
                .label(getString(R.string.row_favorites))
                .hasAction(true));
        group2.addDescriptor(new NormalRowDescriptor(R.string.row_wallet)
                .iconResId(R.drawable.more_my_bank_card)
                .label(getString(R.string.row_wallet))
                .hasAction(true));
        groupDescriptors.add(group2);

        GroupDescriptor group3 = new GroupDescriptor();
        group3.addDescriptor(new NormalRowDescriptor(R.string.row_sticker)
                .iconResId(R.drawable.more_emoji_store)
                .label(getString(R.string.row_sticker))
                .hasAction(true));
        groupDescriptors.add(group3);

        mContainerView.initializeData(groupDescriptors, this);
        mContainerView.hasPaddingTop(true);
        mContainerView.notifyDataChanged();




##有问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 邮件: 1092417123@qq.com
* QQ: 1092417123
* weibo: [@我爱吃汤圆](http://blog.csdn.net/u011033906)
