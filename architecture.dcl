%Modules
module Controller:    myappointments.controller.*
module View:          myappointments.view.*
module Model:         myappointments.model.**
module Domain:        myappointments.model.domain.*
module Util:          myappointments.util.*
module DAO:           "myappointments.model.[a-zA-Z0-9/.]*DAO"
module JavaAwtSwing:  java.awt.**, javax.swing.**
module JavaSql:       java.sql.**
 
%Constraints
only View can-depend JavaAwtSwing
%only DAO can-depend JavaSql
only DAO, Util can-depend JavaSql
View cannot-depend Model
Domain can-depend-only $java
%DAO can-depend-only Domain, Util, javaSql
DAO can-depend-only Domain, Util, javaSql, $java, Model, DAO
Util cannot-depend $system