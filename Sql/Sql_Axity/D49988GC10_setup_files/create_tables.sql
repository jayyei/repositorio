REM  Script:  create_tables.sql
REM  Created: By Chaitanya Koratamaddi on 02/05/06
REM  This script creates tables for users ora1-40
--This script invokes hr_main
set echo on
spool ora1.log
connect ora1/ora1 
set echo off
@@hr_main.sql
spool off

set echo on
spool ora2.log
connect ora2/ora2 
set echo off
@@hr_main.sql
spool off

set echo on
spool ora3.log
connect ora3/ora3 
set echo off
@@hr_main.sql
spool off

