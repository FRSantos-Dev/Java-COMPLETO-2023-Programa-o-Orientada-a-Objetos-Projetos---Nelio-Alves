/*
Fazer um programa para ler os valores da largura e altura de um retângulo
. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
classe como mostrado no projeto ao lado.

Exemplo:
Enter retangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00


widht double
height double
area double
perimeter double
diagonal double

area = widht * height
perimeter = 2 * (widht + height)
diagonal = Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2))

 */

package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
