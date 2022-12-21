package ca.bkaw.praeter.gui.component;

import ca.bkaw.praeter.gui.gui.CustomGui;
import ca.bkaw.praeter.gui.gui.CustomGuiType;

/**
 * A component that exists in a {@link CustomGuiType}.
 * <p>
 * Component types are created when the {@link CustomGuiType gui type} is created.
 * <p>
 * Instances of {@link GuiComponent} are created for each component in each
 * {@link CustomGui} that is created.
 *
 * @param <C> The type created for each opened gui of this type.
 * @param <T> The type of the component type.
 *
 * @see GuiComponent
 * @see CustomGuiType
 */
public abstract class GuiComponentType<C extends GuiComponent, T extends GuiComponentType<C, T>> {
    private final GuiComponentRenderer<C, T> renderer;
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
    public GuiComponentType(GuiComponentRenderer<C, T> renderer, int x, int y, int width, int height) {
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
    public abstract C create();

    public C getState(CustomGui gui) {
        return gui.get(this);
    }

    /**
     * Get the renderer for this component type.
     *
     * @return The renderer.
     */
    public GuiComponentRenderer<C, T> getRenderer() {
        return this.renderer;
    }

    /**
     * Get the x coordinate, measured in slots from the top left.
     *
     * @return The coordinate.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Get the y coordinate, measured in slots from the top left.
     *
     * @return The coordinate.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Get the width of the component, measured in slots.
     *
     * @return The width.
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Get the height of the component, measured in slots.
     *
     * @return The height.
     */
    public int getHeight() {
        return this.height;
    }
}
