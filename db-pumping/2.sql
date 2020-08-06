create or replace view expression_vw as select * from expression;
grant select, insert, update, delete on web.expression_vw to 'web_appl'@'localhost';