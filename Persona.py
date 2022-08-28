#!/usr/bin/python
#-*- coding: utf-8 -*-

from Empleado import Empleado
from Cliente import Cliente

class Persona(Empleado, Cliente):
    def __init__(self):
        self.Nombre = None
        self.ApaPaterno = None
        self.ApaMaterno = None
        self.Telefono = None
        self.Direccion = None
        self.Correo = None

