drop table if exists deliveryman;

drop table if exists meal_discounts;

drop table if exists meal_distriAddr;

drop table if exists meal_goods;

drop table if exists meal_limitTime_discounts;

drop table if exists meal_merchant;

drop table if exists meal_order;

drop table if exists meal_remark;

drop table if exists meal_usr;

drop table if exists order_detail;

drop table if exists ridework;

/*==============================================================*/
/* Table: deliveryman                                           */
/*==============================================================*/
create table deliveryman
(
   rider_num            int not null auto_increment,
   rider_name           varchar(20),
   rider_sex            varchar(5),
   rider_age            int,
   rider_account        varchar(20),
   rider_pwd            varchar(20),
   primary key (rider_num)
);

/*==============================================================*/
/* Table: meal_discounts                                        */
/*==============================================================*/
create table meal_discounts
(
   discnt_id            int not null auto_increment,
   discnt_detail        varchar(100),
   discnt_suitMoney     decimal(15,2),
   discnt_minuMoney     decimal(15,2),
   discnt_begin         date,
   discnt_end           date,
   primary key (discnt_id)
);

/*==============================================================*/
/* Table: meal_distriAddr                                       */
/*==============================================================*/
create table meal_distriAddr
(
   addr_id              int not null auto_increment,
   usr_id               int,
   province             varchar(10),
   city                 varchar(10),
   district             varchar(10),
   addr                 varchar(50),
   usr_name             varchar(20),
   usr_tel              varchar(20),
   primary key (addr_id)
);

/*==============================================================*/
/* Table: meal_goods                                            */
/*==============================================================*/
create table meal_goods
(
   goods_id             int not null auto_increment,
   merchant_num         int,
   goods_name           varchar(30),
   goods_price          decimal(15,2),
   goods_vipPrice       decimal(15,2),
   goods_count          int,
   goods_spec           varchar(50),
   good_detail          varchar(100),
   primary key (goods_id)
);

/*==============================================================*/
/* Table: meal_limitTime_discounts                              */
/*==============================================================*/
create table meal_limitTime_discounts
(
   promotion_id         int not null auto_increment,
   goods_id             int,
   promotion_price      decimal(15,2),
   promotion_cnt        int,
   promotion_begin      date,
   promotion_end        date,
   primary key (promotion_id)
);

/*==============================================================*/
/* Table: meal_merchant                                         */
/*==============================================================*/
create table meal_merchant
(
   merchant_num         int not null auto_increment,
   merchant_name        varchar(20),
   merchant_describe    varchar(50),
   merchant_account     varchar(20),
   merchant_pwd         varchar(20),
   merchant_order       int,
   primary key (merchant_num)
);

/*==============================================================*/
/* Table: meal_order                                            */
/*==============================================================*/
create table meal_order
(
   order_id             int not null auto_increment,
   discnt_id            int,
   or_id                int,
   addr_id              int,
   usr_id               int,
   mea_merchant_num     int,
   rider_num            int,
   init_money           decimal(15,2),
   final_money          decimal(15,2),
   deliver_time         timestamp,
   order_state          varchar(20),
   merchant_num         int,
   primary key (order_id)
);

/*==============================================================*/
/* Table: meal_remark                                           */
/*==============================================================*/
create table meal_remark
(
   usr_id               int not null,
   order_id             int not null,
   remark_detail        varchar(100),
   remark_date          timestamp,
   remark_star          varchar(10),
   remark_picture       longblob,
   primary key (usr_id, order_id)
);

/*==============================================================*/
/* Table: meal_usr                                              */
/*==============================================================*/
create table meal_usr
(
   usr_id               int not null auto_increment,
   usr_name             varchar(20),
   usr_sex              varchar(5),
   usr_pwd              varchar(20),
   usr_tel              varchar(20),
   usr_email            varchar(30),
   usr_city             varchar(20),
   usr_registerTime     timestamp,
   usr_isVIP            varchar(10),
   usr_vipDDL           timestamp,
   primary key (usr_id)
);

/*==============================================================*/
/* Table: order_detail                                          */
/*==============================================================*/
create table order_detail
(
   or_id                int not null auto_increment,
   order_id             int,
   rider_num            int not null,
   or_num               numeric(10,0) not null,
   or_prize             float(10) not null,
   or_discount          float,
   riderev_eva          varchar(50) not null,
   riderev_content      varchar(100),
   riderev_time         timestamp not null,
   primary key (or_id)
);

/*==============================================================*/
/* Table: ridework                                              */
/*==============================================================*/
create table ridework
(
   or_id                int not null,
   rider_num            int not null,
   rideraccount_time    timestamp not null,
   rideraccount_eva     varchar(50),
   rideraccount_prize   decimal(15,2) not null,
   primary key (or_id, rider_num)
);

alter table meal_distriAddr add constraint FK_fresh_usrAddr foreign key (usr_id)
      references meal_usr (usr_id) on delete restrict on update restrict;

alter table meal_goods add constraint FK_merchant_goods foreign key (merchant_num)
      references meal_merchant (merchant_num) on delete restrict on update restrict;

alter table meal_limitTime_discounts add constraint FK_fresh_goodsDiscounts foreign key (goods_id)
      references meal_goods (goods_id) on delete restrict on update restrict;

alter table meal_order add constraint FK_delivery foreign key (rider_num)
      references deliveryman (rider_num) on delete restrict on update restrict;

alter table meal_order add constraint FK_fresh_addr foreign key (addr_id)
      references meal_distriAddr (addr_id) on delete restrict on update restrict;

alter table meal_order add constraint FK_fresh_discountsMoney foreign key (discnt_id)
      references meal_discounts (discnt_id) on delete restrict on update restrict;

alter table meal_order add constraint FK_fresh_usrOrder foreign key (usr_id)
      references meal_usr (usr_id) on delete restrict on update restrict;

alter table meal_order add constraint FK_merchant_sell foreign key (mea_merchant_num)
      references meal_merchant (merchant_num) on delete restrict on update restrict;

alter table meal_order add constraint FK_order_detail2 foreign key (or_id)
      references order_detail (or_id) on delete restrict on update restrict;

alter table meal_remark add constraint FK_meal_remark foreign key (usr_id)
      references meal_usr (usr_id) on delete restrict on update restrict;

alter table meal_remark add constraint FK_meal_remark2 foreign key (order_id)
      references meal_order (order_id) on delete restrict on update restrict;

alter table order_detail add constraint FK_order_detail foreign key (order_id)
      references meal_order (order_id) on delete restrict on update restrict;

alter table order_detail add constraint FK_riderevaluate foreign key (rider_num)
      references deliveryman (rider_num) on delete restrict on update restrict;

alter table ridework add constraint FK_ridework foreign key (or_id)
      references order_detail (or_id) on delete restrict on update restrict;

alter table ridework add constraint FK_ridework2 foreign key (rider_num)
      references deliveryman (rider_num) on delete restrict on update restrict;
