#include <stdio.h>
#include <stdlib.h >
 struct Empleado{
 	char nombre[100];
 	unsigned int edad;
 	char numeroDeEmpleado[10];
 	char numeroDeSeguro[14];
 };
 
 int main(){
 	
 	struct Empleado empleados[1];
 	
 printf("ingrese el nombre");
 scanf("%99[^\n]", empleados[0].nombre);
 printf("ingrese la edad");
 scanf("%d", & empleados[0].edad);
 printf("ingrese el numero del empleado");
 scanf("%s", empleados[0].numeroDeEmpleado);
 printf("ingrese el numero de seguro");
 scanf("%s",empleados[0].numeroDeSeguro);
 printf("%s %d %s %s",empleados[0].nombre,empleados[0].edad,empleados[0].numeroDeEmpleado,empleados[0].numeroDeSeguro);
 
 
 FILE *filepointer;
 filepointer = fopen("empleados.txt", "r+");
 fprintf(filepointer, "%s %d %s %s \n", empleados[0].nombre, empleados[0].edad, empleados[0].numeroDeEmpleado, empleados[0].numeroDeSeguro);
 fclose(filepointer);
 }
 
 
