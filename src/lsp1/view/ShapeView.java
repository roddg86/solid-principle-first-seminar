package lsp1.view;

import lsp1.shape.Rectangle;

public class ShapeView {
    private final Rectangle rectangle;

    public ShapeView(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
