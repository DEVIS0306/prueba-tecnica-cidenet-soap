-- Creacion de tablespaces
create tablespace cursosoa_tabspace
    datafile 'cursosoa_tabspace.dat'
    size 50M autoextend on;

-- Creacion de tablespace temporal    
create temporary tablespace cursosoa_tabspace_temp
   tempfile 'cursosoa_tabspace_temp.dat'
   size 7M autoextend on;

-- CReacion de esquema o usuario enlazado al tablespace creado anteriormente   
   create user devsoa 
   identified by 12345
    default tablespace cursosoa_tabspace
   temporary tablespace cursosoa_tabspace_temp;
   
-- privilegios
   grant create session to devsoa;
   grant create table to devsoa;
   grant unlimited tablespace to devsoa;   
