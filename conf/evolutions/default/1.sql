# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table post (
  id                        bigint auto_increment not null,
  url                       varchar(255),
  post_date                 datetime,
  constraint pk_post primary key (id))
;

create table registered_user (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  description               varchar(255),
  picture_url               varchar(255),
  twitter_id                varchar(255),
  registration_date         datetime,
  constraint pk_registered_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table post;

drop table registered_user;

SET FOREIGN_KEY_CHECKS=1;

