#!/usr/bin/python
#-*- coding: utf-8 -*-

from Vendedor import Vendedor
from administrador import administrador

class Empleado(Vendedor, administrador):
    def __init__(self):
        self.Permiso = None
        self.Id = None
        self.password = None

    def AsignarPermiso(self, ):
        pass

    def busquedaProducto(self, ):
        pass

    def asignarPermiso(self, ):
        pass

