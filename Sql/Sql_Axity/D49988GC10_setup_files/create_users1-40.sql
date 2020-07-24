Rem    CREATED by Chaitanya Koratamaddi - 10/11/06
Rem    This script creates the role ora with privileges
Rem    The role ora is then granted to users ora1-40
Rem    Added additional privileges to ora role

set echo on
spool Create_ora.log

alter session set "_ORACLE_SCRIPT"=true;
drop role ora;
create role ora;
grant alter session to ora;
grant create session to ora;
grant create table to ora;
grant create view to ora;
grant create sequence to ora;
grant create synonym to ora;
grant create procedure to ora; 
grant create trigger to ora;
grant create type to ora;
grant query rewrite to ora;
grant create any index to ora;
grant create public synonym to ora;
grant create role to ora;
grant create user to ora;
grant create any directory to ora;
grant drop public synonym to ora;

grant execute on sys.dbms_stats to ora;
grant create job to ora;
grant manage scheduler to ora;
grant debug connect session to ora;
grant debug any procedure to ora;
grant execute any procedure to ora;
grant select on v_$parameter TO ora;

drop user ora1 cascade;
create user ora1 identified by ora1;
grant ora to ora1;
alter user ora1 default tablespace users temporary tablespace temp
quota unlimited on users;

drop user ora2 cascade;
create user ora2 identified by ora2;
grant ora to ora2;
alter user ora2 default tablespace users temporary tablespace temp
quota unlimited on users;

drop user ora3 cascade;
create user ora3 identified by ora3;
grant ora to ora3;
alter user ora3 default tablespace users temporary tablespace temp
quota unlimited on users;


spool off
set echo off



