
-- 1
create table cs_catalog_types ( 
 sk_id integer
 ,dx_name varchar(100)
 ,dx_description varchar(200)
 ,dx_type varchar(3)
 ,dd_created timestamp default now()
 ,dd_updated timestamp 
);
create sequence cs_catalog_types_seq start with 1 increment by 1 ; 
alter table cs_catalog_types add constraint cs_catalog_types_pk primary key (sk_id);

insert into cs_catalog_types 
 values ( nextval('cs_catalog_types_seq'), 'Roles', null, 'r', now(), null ) ; 
insert into cs_catalog_types 
 values ( nextval('cs_catalog_types_seq'), 'Cliente', null, 'c', now(), null ) ; 
insert into cs_catalog_types 
 values ( nextval('cs_catalog_types_seq'), 'Operations', null, 'r', now(), null ) ; 
insert into cs_catalog_types 
 values ( nextval('cs_catalog_types_seq'), 'Sources', null, 'r', now(), null ) ; 

-- 2 
create table cs_catalogs (
 sk_id integer
 ,kn_catalog_type_id integer
 ,dx_name varchar(100)
 ,dx_description varchar(200)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
create sequence cs_catalogs_seq start with 1 increment by 1 ; 
alter table cs_catalogs add constraint cs_catalogs_pk primary key ( sk_id );
alter table cs_catalogs add constraint cs_catalogs_fk1 foreign key ( kn_catalog_type_id ) references cs_catalog_types( sk_id ); 



create table mm_users (
 sk_id integer
 ,dx_username varchar(80)
 ,dx_tempus_username varchar(80)
 ,dx_group varchar(80)
 ,dx_profile varchar(80)
 ,dx_name varchar(80)
 ,dx_lastname varchar(80)
 ,dn_company_start_date integer
 ,dn_client_start_date integer
 ,dx_deleted varchar(1)
 ,dx_level varchar(150)
 ,dx_manager varchar(150)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
create sequence mm_users_seq start with 1 increment by 1 ; 
alter table mm_users add constraint mm_users_pk primary key ( sk_id );
-- dx_username con dx_deleted not in 'y' debe ser único 



create table mm_projects (
 sk_id integer
 ,dx_name varchar(200)
 ,dx_remote_created varchar(1)
 ,dx_deleted varchar(1)
 ,dx_deleted_remote varchar(1)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);

create sequence mm_projects_seq start with 1 increment by 1 ; 
alter table mm_projects add constraint mm_projects_pk primary key ( sk_id );



create table hh_user_access (
 sk_id numeric -- BigDecimal ?
 ,kn_id_user integer
 ,kn_id_operation integer
 ,kn_id_source integer
 ,dx_input varchar(32000)
 ,dx_output varchar(32000)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
-- dx_created_user por id_user 
-- mm_user guest ? (no)

drop table dd_project_folios ;
create table dd_project_folios ( 
 sk_id integer -- BigDecimal ?
 ,kn_project_id integer not null 
 ,dx_key varchar(80)
 ,dx_description varchar(300)
 ,dx_issue_type varchar(20)
 ,dn_estimate numeric
 ,dx_closed varchar(1)
 ,dx_closed_remote varchar(1)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);

create sequence dd_project_folios_seq start with 1 increment by 1 ; 
alter table dd_project_folios add constraint dd_project_folios_pk primary key ( sk_id );
alter table dd_project_folios add constraint folio_project_fk foreign key ( kn_project_id ) references mm_projects( sk_id );

create table dd_users_folios (
	sk_id integer
	,kn_id_user integer
	,kn_id_folio integer 
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
alter table dd_users_folios add constraint dd_users_folios_pk primary key ( sk_id );
create unique index idx_uq_user_folios on dd_users_folios( kn_id_user, kn_id_folio );
alter table dd_users_folios add constraint dd_users_folios_fk1 foreign key ( kn_id_user ) references mm_users( sk_id );
alter table dd_users_folios add constraint dd_users_folios_fk2 foreign key ( kn_id_folio ) references dd_project_folios( sk_id );



-- 20190124 - Cesar
alter table mm_users add dx_admin varchar(3);

-- 20190128 - Cesar 
alter table hh_user_access add constraint hh_user_access_fk1 foreign key ( kn_id_user ) references mm_users( sk_id );
create sequence dd_user_folios_seq start with 1 increment by 1 ; 

create table cs_sources {
 sk_id integer
 ,dx_name varchar(1024)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);

drop table dd_folio_workflows;
create table dd_folio_workflows (
 sk_id numeric -- BigDecimal ? 
 ,kn_id_folio integer
 ,kn_id_user integer 
 ,dx_desc varchar(4096)
 ,dn_date integer
 ,dn_time numeric(4,2)
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
alter table dd_folio_workflows add dx_remote varchar(3);
create sequence dd_folio_workflows_seq start with 1 increment by 1 ; 
alter table dd_folio_workflows add constraint dd_folio_workflows_pk primary key ( sk_id );
alter table  dd_folio_workflows add constraint dd_folio_workflows_fk1 foreign key ( kn_id_folio ) references dd_project_folios( sk_id );
alter table  dd_folio_workflows add constraint dd_folio_workflows_fk2 foreign key ( kn_id_user ) references mm_users( sk_id );

create table dd_workflow_custom_tags (
 sk_id integer
 ,kn_id_workflow integer
 ,kn_id_catalog_type integer
 ,kn_id_catalog integer
 ,dx_created_user varchar(100)
 ,dd_created timestamp default now()
 ,dx_updated_user varchar(100)
 ,dd_updated timestamp 
);
create sequence dd_workflow_custom_tags_seq start with 1 increment by 1 ; 
alter table dd_workflow_custom_tags add constraint dd_workflow_custom_tags_pk primary key ( sk_id );
alter table dd_workflow_custom_tags add constraint dd_workflow_custom_tags_fk1 foreign key ( kn_id_workflow ) references dd_folio_workflows( sk_id );
alter table dd_workflow_custom_tags add constraint dd_workflow_custom_tags_fk2 foreign key ( kn_id_catalog_type ) references cs_catalog_types( sk_id );
alter table dd_workflow_custom_tags add constraint dd_workflow_custom_tags_fk3 foreign key ( kn_id_catalog ) references cs_catalogs( sk_id );

alter table dd_workflow_custom_tags drop constraint dd_workflow_custom_tags_fk3;
alter table dd_workflow_custom_tags drop constraint dd_workflow_custom_tags_fk2;
alter table dd_workflow_custom_tags drop constraint dd_workflow_custom_tags__fk1;


