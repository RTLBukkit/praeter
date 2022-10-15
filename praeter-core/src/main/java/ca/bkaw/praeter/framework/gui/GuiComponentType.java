package ca.bkaw.praeter.framework.gui;

/**
 * A component that exists in a {@link CustomGuiType}.
 * <p>
 * Component types are created when the {@link CustomGuiType gui type} is created.
 * <p>
 * Instances of {@link GuiComponent} are created for each component in each
 * {@link CustomGui} that is created.
 *
 * @param <T> The type created for each opened gui of this type.
 *
 * @see GuiComponent
 * @see CustomGuiType
 */
public abstract class GuiComponentType<T extends GuiComponent> {
    private final GuiComponentRenderer<T, ?> renderer;
    private final int x, y, width, height;

    /**
     * Create a new {@link GuiComponentType}.
     *
     * @param renderer The renderer for this component.
     * @param x The x position of the component.
     * @param y The y position of the component.
     * @param width The width position of the component.
     * @param height The height position of the component.
     */
    public GuiComponentType(GuiComponentRenderer<T, ?> renderer, int x, int y, int width, int height) {
        this.renderer = renderer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Create an instance of the {@link CustomGui} class for this type.
     *
     * @return The created instance.
     */
    public abstract T create();

    // todo javadoc
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
